
package org.apache.hugegraph.computer.k8s.crd.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastSuperstepStat",
    "maxSuperstep",
    "superstep"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = true, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
public class ComputerJobState implements KubernetesResource
{

    @JsonProperty("lastSuperstepStat")
    private String lastSuperstepStat;
    @JsonProperty("maxSuperstep")
    private Integer maxSuperstep;
    @JsonProperty("superstep")
    private Integer superstep;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ComputerJobState() {
    }

    /**
     * 
     * @param superstep
     * @param maxSuperstep
     * @param lastSuperstepStat
     */
    public ComputerJobState(String lastSuperstepStat, Integer maxSuperstep, Integer superstep) {
        super();
        this.lastSuperstepStat = lastSuperstepStat;
        this.maxSuperstep = maxSuperstep;
        this.superstep = superstep;
    }

    @JsonProperty("lastSuperstepStat")
    public String getLastSuperstepStat() {
        return lastSuperstepStat;
    }

    @JsonProperty("lastSuperstepStat")
    public void setLastSuperstepStat(String lastSuperstepStat) {
        this.lastSuperstepStat = lastSuperstepStat;
    }

    public ComputerJobState withLastSuperstepStat(String lastSuperstepStat) {
        this.lastSuperstepStat = lastSuperstepStat;
        return this;
    }

    @JsonProperty("maxSuperstep")
    public Integer getMaxSuperstep() {
        return maxSuperstep;
    }

    @JsonProperty("maxSuperstep")
    public void setMaxSuperstep(Integer maxSuperstep) {
        this.maxSuperstep = maxSuperstep;
    }

    public ComputerJobState withMaxSuperstep(Integer maxSuperstep) {
        this.maxSuperstep = maxSuperstep;
        return this;
    }

    @JsonProperty("superstep")
    public Integer getSuperstep() {
        return superstep;
    }

    @JsonProperty("superstep")
    public void setSuperstep(Integer superstep) {
        this.superstep = superstep;
    }

    public ComputerJobState withSuperstep(Integer superstep) {
        this.superstep = superstep;
        return this;
    }

}
