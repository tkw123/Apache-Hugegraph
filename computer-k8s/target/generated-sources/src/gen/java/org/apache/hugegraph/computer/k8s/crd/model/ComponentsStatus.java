
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
    "configMap",
    "masterJob",
    "workerJob"
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
public class ComponentsStatus implements KubernetesResource
{

    @JsonProperty("configMap")
    private ComponentState configMap;
    @JsonProperty("masterJob")
    private ComponentState masterJob;
    @JsonProperty("workerJob")
    private ComponentState workerJob;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ComponentsStatus() {
    }

    /**
     * 
     * @param masterJob
     * @param configMap
     * @param workerJob
     */
    public ComponentsStatus(ComponentState configMap, ComponentState masterJob, ComponentState workerJob) {
        super();
        this.configMap = configMap;
        this.masterJob = masterJob;
        this.workerJob = workerJob;
    }

    @JsonProperty("configMap")
    public ComponentState getConfigMap() {
        return configMap;
    }

    @JsonProperty("configMap")
    public void setConfigMap(ComponentState configMap) {
        this.configMap = configMap;
    }

    public ComponentsStatus withConfigMap(ComponentState configMap) {
        this.configMap = configMap;
        return this;
    }

    @JsonProperty("masterJob")
    public ComponentState getMasterJob() {
        return masterJob;
    }

    @JsonProperty("masterJob")
    public void setMasterJob(ComponentState masterJob) {
        this.masterJob = masterJob;
    }

    public ComponentsStatus withMasterJob(ComponentState masterJob) {
        this.masterJob = masterJob;
        return this;
    }

    @JsonProperty("workerJob")
    public ComponentState getWorkerJob() {
        return workerJob;
    }

    @JsonProperty("workerJob")
    public void setWorkerJob(ComponentState workerJob) {
        this.workerJob = workerJob;
    }

    public ComponentsStatus withWorkerJob(ComponentState workerJob) {
        this.workerJob = workerJob;
        return this;
    }

}
