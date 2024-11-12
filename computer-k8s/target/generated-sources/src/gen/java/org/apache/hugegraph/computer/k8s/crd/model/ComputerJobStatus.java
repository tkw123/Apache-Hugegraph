
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
    "componentStates",
    "jobState",
    "jobStatus",
    "lastUpdateTime"
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
public class ComputerJobStatus implements KubernetesResource
{

    @JsonProperty("componentStates")
    private ComponentsStatus componentStates;
    @JsonProperty("jobState")
    private ComputerJobState jobState;
    @JsonProperty("jobStatus")
    private String jobStatus;
    @JsonProperty("lastUpdateTime")
    private java.lang.String lastUpdateTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ComputerJobStatus() {
    }

    /**
     * 
     * @param jobStatus
     * @param jobState
     * @param componentStates
     * @param lastUpdateTime
     */
    public ComputerJobStatus(ComponentsStatus componentStates, ComputerJobState jobState, String jobStatus, java.lang.String lastUpdateTime) {
        super();
        this.componentStates = componentStates;
        this.jobState = jobState;
        this.jobStatus = jobStatus;
        this.lastUpdateTime = lastUpdateTime;
    }

    @JsonProperty("componentStates")
    public ComponentsStatus getComponentStates() {
        return componentStates;
    }

    @JsonProperty("componentStates")
    public void setComponentStates(ComponentsStatus componentStates) {
        this.componentStates = componentStates;
    }

    public ComputerJobStatus withComponentStates(ComponentsStatus componentStates) {
        this.componentStates = componentStates;
        return this;
    }

    @JsonProperty("jobState")
    public ComputerJobState getJobState() {
        return jobState;
    }

    @JsonProperty("jobState")
    public void setJobState(ComputerJobState jobState) {
        this.jobState = jobState;
    }

    public ComputerJobStatus withJobState(ComputerJobState jobState) {
        this.jobState = jobState;
        return this;
    }

    @JsonProperty("jobStatus")
    public String getJobStatus() {
        return jobStatus;
    }

    @JsonProperty("jobStatus")
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public ComputerJobStatus withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    @JsonProperty("lastUpdateTime")
    public java.lang.String getLastUpdateTime() {
        return lastUpdateTime;
    }

    @JsonProperty("lastUpdateTime")
    public void setLastUpdateTime(java.lang.String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ComputerJobStatus withLastUpdateTime(java.lang.String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

}
