
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
    "hugegraph_apache_org_operator_api_v1_ComponentState",
    "hugegraph_apache_org_operator_api_v1_ComponentsStatus",
    "hugegraph_apache_org_operator_api_v1_ComputerJobSpec",
    "hugegraph_apache_org_operator_api_v1_ComputerJobState",
    "hugegraph_apache_org_operator_api_v1_ComputerJobStatus",
    "hugegraph_apache_org_operator_api_v1_HugeGraphComputerJob",
    "hugegraph_apache_org_operator_api_v1_HugeGraphComputerJobList"
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
public class CrdSchema {

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComponentState")
    private ComponentState hugegraphApacheOrgOperatorApiV1ComponentState;
    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComponentsStatus")
    private ComponentsStatus hugegraphApacheOrgOperatorApiV1ComponentsStatus;
    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobSpec")
    private ComputerJobSpec hugegraphApacheOrgOperatorApiV1ComputerJobSpec;
    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobState")
    private ComputerJobState hugegraphApacheOrgOperatorApiV1ComputerJobState;
    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobStatus")
    private ComputerJobStatus hugegraphApacheOrgOperatorApiV1ComputerJobStatus;
    @JsonProperty("hugegraph_apache_org_operator_api_v1_HugeGraphComputerJob")
    private HugeGraphComputerJob hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob;
    @JsonProperty("hugegraph_apache_org_operator_api_v1_HugeGraphComputerJobList")
    private HugeGraphComputerJobList hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CrdSchema() {
    }

    /**
     * 
     * @param hugegraphApacheOrgOperatorApiV1ComponentState
     * @param hugegraphApacheOrgOperatorApiV1ComputerJobState
     * @param hugegraphApacheOrgOperatorApiV1ComputerJobSpec
     * @param hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList
     * @param hugegraphApacheOrgOperatorApiV1ComponentsStatus
     * @param hugegraphApacheOrgOperatorApiV1ComputerJobStatus
     * @param hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob
     */
    public CrdSchema(ComponentState hugegraphApacheOrgOperatorApiV1ComponentState, ComponentsStatus hugegraphApacheOrgOperatorApiV1ComponentsStatus, ComputerJobSpec hugegraphApacheOrgOperatorApiV1ComputerJobSpec, ComputerJobState hugegraphApacheOrgOperatorApiV1ComputerJobState, ComputerJobStatus hugegraphApacheOrgOperatorApiV1ComputerJobStatus, HugeGraphComputerJob hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob, HugeGraphComputerJobList hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList) {
        super();
        this.hugegraphApacheOrgOperatorApiV1ComponentState = hugegraphApacheOrgOperatorApiV1ComponentState;
        this.hugegraphApacheOrgOperatorApiV1ComponentsStatus = hugegraphApacheOrgOperatorApiV1ComponentsStatus;
        this.hugegraphApacheOrgOperatorApiV1ComputerJobSpec = hugegraphApacheOrgOperatorApiV1ComputerJobSpec;
        this.hugegraphApacheOrgOperatorApiV1ComputerJobState = hugegraphApacheOrgOperatorApiV1ComputerJobState;
        this.hugegraphApacheOrgOperatorApiV1ComputerJobStatus = hugegraphApacheOrgOperatorApiV1ComputerJobStatus;
        this.hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob = hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob;
        this.hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList = hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComponentState")
    public ComponentState getHugegraphApacheOrgOperatorApiV1ComponentState() {
        return hugegraphApacheOrgOperatorApiV1ComponentState;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComponentState")
    public void setHugegraphApacheOrgOperatorApiV1ComponentState(ComponentState hugegraphApacheOrgOperatorApiV1ComponentState) {
        this.hugegraphApacheOrgOperatorApiV1ComponentState = hugegraphApacheOrgOperatorApiV1ComponentState;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1ComponentState(ComponentState hugegraphApacheOrgOperatorApiV1ComponentState) {
        this.hugegraphApacheOrgOperatorApiV1ComponentState = hugegraphApacheOrgOperatorApiV1ComponentState;
        return this;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComponentsStatus")
    public ComponentsStatus getHugegraphApacheOrgOperatorApiV1ComponentsStatus() {
        return hugegraphApacheOrgOperatorApiV1ComponentsStatus;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComponentsStatus")
    public void setHugegraphApacheOrgOperatorApiV1ComponentsStatus(ComponentsStatus hugegraphApacheOrgOperatorApiV1ComponentsStatus) {
        this.hugegraphApacheOrgOperatorApiV1ComponentsStatus = hugegraphApacheOrgOperatorApiV1ComponentsStatus;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1ComponentsStatus(ComponentsStatus hugegraphApacheOrgOperatorApiV1ComponentsStatus) {
        this.hugegraphApacheOrgOperatorApiV1ComponentsStatus = hugegraphApacheOrgOperatorApiV1ComponentsStatus;
        return this;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobSpec")
    public ComputerJobSpec getHugegraphApacheOrgOperatorApiV1ComputerJobSpec() {
        return hugegraphApacheOrgOperatorApiV1ComputerJobSpec;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobSpec")
    public void setHugegraphApacheOrgOperatorApiV1ComputerJobSpec(ComputerJobSpec hugegraphApacheOrgOperatorApiV1ComputerJobSpec) {
        this.hugegraphApacheOrgOperatorApiV1ComputerJobSpec = hugegraphApacheOrgOperatorApiV1ComputerJobSpec;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1ComputerJobSpec(ComputerJobSpec hugegraphApacheOrgOperatorApiV1ComputerJobSpec) {
        this.hugegraphApacheOrgOperatorApiV1ComputerJobSpec = hugegraphApacheOrgOperatorApiV1ComputerJobSpec;
        return this;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobState")
    public ComputerJobState getHugegraphApacheOrgOperatorApiV1ComputerJobState() {
        return hugegraphApacheOrgOperatorApiV1ComputerJobState;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobState")
    public void setHugegraphApacheOrgOperatorApiV1ComputerJobState(ComputerJobState hugegraphApacheOrgOperatorApiV1ComputerJobState) {
        this.hugegraphApacheOrgOperatorApiV1ComputerJobState = hugegraphApacheOrgOperatorApiV1ComputerJobState;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1ComputerJobState(ComputerJobState hugegraphApacheOrgOperatorApiV1ComputerJobState) {
        this.hugegraphApacheOrgOperatorApiV1ComputerJobState = hugegraphApacheOrgOperatorApiV1ComputerJobState;
        return this;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobStatus")
    public ComputerJobStatus getHugegraphApacheOrgOperatorApiV1ComputerJobStatus() {
        return hugegraphApacheOrgOperatorApiV1ComputerJobStatus;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_ComputerJobStatus")
    public void setHugegraphApacheOrgOperatorApiV1ComputerJobStatus(ComputerJobStatus hugegraphApacheOrgOperatorApiV1ComputerJobStatus) {
        this.hugegraphApacheOrgOperatorApiV1ComputerJobStatus = hugegraphApacheOrgOperatorApiV1ComputerJobStatus;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1ComputerJobStatus(ComputerJobStatus hugegraphApacheOrgOperatorApiV1ComputerJobStatus) {
        this.hugegraphApacheOrgOperatorApiV1ComputerJobStatus = hugegraphApacheOrgOperatorApiV1ComputerJobStatus;
        return this;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_HugeGraphComputerJob")
    public HugeGraphComputerJob getHugegraphApacheOrgOperatorApiV1HugeGraphComputerJob() {
        return hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_HugeGraphComputerJob")
    public void setHugegraphApacheOrgOperatorApiV1HugeGraphComputerJob(HugeGraphComputerJob hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob) {
        this.hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob = hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1HugeGraphComputerJob(HugeGraphComputerJob hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob) {
        this.hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob = hugegraphApacheOrgOperatorApiV1HugeGraphComputerJob;
        return this;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_HugeGraphComputerJobList")
    public HugeGraphComputerJobList getHugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList() {
        return hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList;
    }

    @JsonProperty("hugegraph_apache_org_operator_api_v1_HugeGraphComputerJobList")
    public void setHugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList(HugeGraphComputerJobList hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList) {
        this.hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList = hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList;
    }

    public CrdSchema withHugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList(HugeGraphComputerJobList hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList) {
        this.hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList = hugegraphApacheOrgOperatorApiV1HugeGraphComputerJobList;
        return this;
    }

}
