
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NodePhase {

    NODE_PENDING("NodePending"),
    NODE_RUNNING("NodeRunning"),
    NODE_TERMINATED("NodeTerminated");
    private final String value;
    private final static Map<String, NodePhase> CONSTANTS = new HashMap<String, NodePhase>();

    static {
        for (NodePhase c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NodePhase(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NodePhase fromValue(String value) {
        NodePhase constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
