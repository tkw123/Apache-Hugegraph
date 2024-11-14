package org.apache.hugegraph.computer.algorithm.path.dijkstra;

import org.apache.commons.lang.StringUtils;
import org.apache.hugegraph.computer.core.config.Config;
import org.apache.hugegraph.computer.core.graph.edge.Edge;
import org.apache.hugegraph.computer.core.graph.id.Id;
import org.apache.hugegraph.computer.core.graph.value.IdList;
import org.apache.hugegraph.computer.core.graph.value.LongValue;
import org.apache.hugegraph.computer.core.graph.value.Value;
import org.apache.hugegraph.computer.core.graph.value.ValueType;
import org.apache.hugegraph.computer.core.graph.vertex.Vertex;
import org.apache.hugegraph.computer.core.worker.Computation;
import org.apache.hugegraph.computer.core.worker.ComputationContext;

import java.util.Iterator;

import static org.apache.hugegraph.computer.algorithm.sampling.RandomWalk.OPTION_WEIGHT_PROPERTY;

public class Dijkstra implements Computation<LongValue> {


    private Id sourceId;
    private String weightProperty;
    private boolean calculateByWeightProperty;

    public Dijkstra(Id sourceId) {
        this.sourceId = sourceId;
    }

    @Override
    public String name() {
        return "dijkstra";
    }

    @Override
    public String category() {
        return "path";
    }

    @Override
    public void compute0(ComputationContext context, Vertex vertex) {
        // 取节点id
        Id id = vertex.id();
        if(id == sourceId) {
            // 如果是源点,value设置为0
            vertex.value(new LongValue(0));
            // 更新其他邻接点
            for (Edge edge : vertex.edges()) {
                Id target_id = edge.targetId();

                LongValue nowvalue = vertex.value();
                Long now_v = nowvalue.value();
                LongValue evalue = edge.property(this.weightProperty);
                Long e_v = evalue.value();
                // 当前节点值+边值,更新邻接点
                LongValue new_value = new LongValue(e_v + now_v);

                context.sendMessage(target_id, new_value);
            }
            vertex.inactivate();
        } else {
            // 如果不是源点,value设置为Max
            vertex.value(new LongValue(Long.MAX_VALUE));
        }
    }
    @Override
    public void compute(ComputationContext context, Vertex vertex, Iterator<LongValue> messages) {
        LongValue mindist =  new LongValue((vertex.id() == sourceId) ? 0 : Long.MAX_VALUE);
        // 在所有传过来的messages中找当前value最小的
        while (messages.hasNext()) {
            LongValue next = messages.next();
            mindist = new LongValue(Math.min(mindist.value(), next.value()));
        }
        if(vertex.value().compareTo(mindist) == 0) {
            for(Edge edge : vertex.edges()) {
                Id target_id = edge.targetId();

                LongValue nowvalue = vertex.value();
                Long now_v = nowvalue.value();
                LongValue evalue = edge.property(this.weightProperty);
                Long e_v = evalue.value();
                LongValue new_value = new LongValue(e_v + now_v);

                context.sendMessage(target_id, new_value);
            }
            vertex.inactivate();
        }
    }

    @Override
    public void init(Config config) {
        this.weightProperty = config.getString(
                OPTION_WEIGHT_PROPERTY, "");
        this.calculateByWeightProperty = StringUtils.isNotEmpty(
                this.weightProperty);
    }
}
