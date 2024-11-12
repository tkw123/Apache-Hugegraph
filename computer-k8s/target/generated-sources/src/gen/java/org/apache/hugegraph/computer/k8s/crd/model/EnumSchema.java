
package org.apache.hugegraph.computer.k8s.crd.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
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
    "NodePhase",
    "ResourceName",
    "RestartPolicy",
    "PullPolicy",
    "PodPhase",
    "EventType",
    "CommonComponentState",
    "JobComponentState"
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
public class EnumSchema {

    @JsonProperty("NodePhase")
    private NodePhase nodePhase;
    @JsonProperty("ResourceName")
    private ResourceName resourceName;
    @JsonProperty("RestartPolicy")
    private RestartPolicy restartPolicy;
    @JsonProperty("PullPolicy")
    private PullPolicy pullPolicy;
    @JsonProperty("PodPhase")
    private PodPhase podPhase;
    @JsonProperty("EventType")
    private EventType eventType;
    @JsonProperty("CommonComponentState")
    private CommonComponentState commonComponentState;
    @JsonProperty("JobComponentState")
    private JobComponentState jobComponentState;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnumSchema() {
    }

    /**
     * 
     * @param podPhase
     * @param nodePhase
     * @param commonComponentState
     * @param resourceName
     * @param eventType
     * @param restartPolicy
     * @param pullPolicy
     * @param jobComponentState
     */
    public EnumSchema(NodePhase nodePhase, ResourceName resourceName, RestartPolicy restartPolicy, PullPolicy pullPolicy, PodPhase podPhase, EventType eventType, CommonComponentState commonComponentState, JobComponentState jobComponentState) {
        super();
        this.nodePhase = nodePhase;
        this.resourceName = resourceName;
        this.restartPolicy = restartPolicy;
        this.pullPolicy = pullPolicy;
        this.podPhase = podPhase;
        this.eventType = eventType;
        this.commonComponentState = commonComponentState;
        this.jobComponentState = jobComponentState;
    }

    @JsonProperty("NodePhase")
    public NodePhase getNodePhase() {
        return nodePhase;
    }

    @JsonProperty("NodePhase")
    public void setNodePhase(NodePhase nodePhase) {
        this.nodePhase = nodePhase;
    }

    public EnumSchema withNodePhase(NodePhase nodePhase) {
        this.nodePhase = nodePhase;
        return this;
    }

    @JsonProperty("ResourceName")
    public ResourceName getResourceName() {
        return resourceName;
    }

    @JsonProperty("ResourceName")
    public void setResourceName(ResourceName resourceName) {
        this.resourceName = resourceName;
    }

    public EnumSchema withResourceName(ResourceName resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    @JsonProperty("RestartPolicy")
    public RestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    @JsonProperty("RestartPolicy")
    public void setRestartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public EnumSchema withRestartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    @JsonProperty("PullPolicy")
    public PullPolicy getPullPolicy() {
        return pullPolicy;
    }

    @JsonProperty("PullPolicy")
    public void setPullPolicy(PullPolicy pullPolicy) {
        this.pullPolicy = pullPolicy;
    }

    public EnumSchema withPullPolicy(PullPolicy pullPolicy) {
        this.pullPolicy = pullPolicy;
        return this;
    }

    @JsonProperty("PodPhase")
    public PodPhase getPodPhase() {
        return podPhase;
    }

    @JsonProperty("PodPhase")
    public void setPodPhase(PodPhase podPhase) {
        this.podPhase = podPhase;
    }

    public EnumSchema withPodPhase(PodPhase podPhase) {
        this.podPhase = podPhase;
        return this;
    }

    @JsonProperty("EventType")
    public EventType getEventType() {
        return eventType;
    }

    @JsonProperty("EventType")
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public EnumSchema withEventType(EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    @JsonProperty("CommonComponentState")
    public CommonComponentState getCommonComponentState() {
        return commonComponentState;
    }

    @JsonProperty("CommonComponentState")
    public void setCommonComponentState(CommonComponentState commonComponentState) {
        this.commonComponentState = commonComponentState;
    }

    public EnumSchema withCommonComponentState(CommonComponentState commonComponentState) {
        this.commonComponentState = commonComponentState;
        return this;
    }

    @JsonProperty("JobComponentState")
    public JobComponentState getJobComponentState() {
        return jobComponentState;
    }

    @JsonProperty("JobComponentState")
    public void setJobComponentState(JobComponentState jobComponentState) {
        this.jobComponentState = jobComponentState;
    }

    public EnumSchema withJobComponentState(JobComponentState jobComponentState) {
        this.jobComponentState = jobComponentState;
        return this;
    }

}
