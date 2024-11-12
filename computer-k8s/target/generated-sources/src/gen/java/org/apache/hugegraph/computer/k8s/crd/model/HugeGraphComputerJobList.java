
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "items",
    "kind",
    "metadata"
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
@Version("v1")
@Group("operator.hugegraph.apache.org")
public class HugeGraphComputerJobList implements KubernetesResource, KubernetesResourceList<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob>
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    private String apiVersion = "operator.hugegraph.apache.org/v1";
    @JsonProperty("items")
    private List<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob> items = new ArrayList<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    private String kind = "HugeGraphComputerJobList";
    @JsonProperty("metadata")
    private ListMeta metadata;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HugeGraphComputerJobList() {
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param items
     */
    public HugeGraphComputerJobList(String apiVersion, List<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob> items, String kind, ListMeta metadata) {
        super();
        this.apiVersion = apiVersion;
        this.items = items;
        this.kind = kind;
        this.metadata = metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public HugeGraphComputerJobList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    @JsonProperty("items")
    public List<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob> items) {
        this.items = items;
    }

    public HugeGraphComputerJobList withItems(List<org.apache.hugegraph.computer.k8s.crd.model.HugeGraphComputerJob> items) {
        this.items = items;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public HugeGraphComputerJobList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    @JsonProperty("metadata")
    public ListMeta getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    public HugeGraphComputerJobList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
