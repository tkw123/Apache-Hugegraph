
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvFromSource;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.SecurityContext;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "algorithmName",
    "computerConf",
    "configMapPaths",
    "envFrom",
    "envVars",
    "image",
    "jarFile",
    "jobId",
    "jvmOptions",
    "log4jXml",
    "masterArgs",
    "masterCommand",
    "masterCpu",
    "masterMemory",
    "podTemplateSpec",
    "pullPolicy",
    "pullSecrets",
    "remoteJarUri",
    "secretPaths",
    "securityContext",
    "volumeMounts",
    "volumes",
    "workerArgs",
    "workerCommand",
    "workerCpu",
    "workerInstances",
    "workerMemory"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = true, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class ComputerJobSpec implements KubernetesResource
{

    @JsonProperty("algorithmName")
    private String algorithmName;
    @JsonProperty("computerConf")
    private Map<String, String> computerConf;
    @JsonProperty("configMapPaths")
    private Map<String, String> configMapPaths;
    @JsonProperty("envFrom")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<EnvFromSource> envFrom = new ArrayList<EnvFromSource>();
    @JsonProperty("envVars")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<io.fabric8.kubernetes.api.model.EnvVar> envVars = new ArrayList<io.fabric8.kubernetes.api.model.EnvVar>();
    @JsonProperty("image")
    private String image;
    @JsonProperty("jarFile")
    private String jarFile;
    @JsonProperty("jobId")
    private String jobId;
    @JsonProperty("jvmOptions")
    private String jvmOptions;
    @JsonProperty("log4jXml")
    private String log4jXml;
    @JsonProperty("masterArgs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> masterArgs = new ArrayList<java.lang.String>();
    @JsonProperty("masterCommand")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> masterCommand = new ArrayList<java.lang.String>();
    @JsonProperty("masterCpu")
    private Quantity masterCpu;
    @JsonProperty("masterMemory")
    private Quantity masterMemory;
    @JsonProperty("podTemplateSpec")
    private PodTemplateSpec podTemplateSpec;
    @JsonProperty("pullPolicy")
    private java.lang.String pullPolicy;
    @JsonProperty("pullSecrets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<LocalObjectReference> pullSecrets = new ArrayList<LocalObjectReference>();
    @JsonProperty("remoteJarUri")
    private String remoteJarUri;
    @JsonProperty("secretPaths")
    private Map<String, String> secretPaths;
    @JsonProperty("securityContext")
    private SecurityContext securityContext;
    @JsonProperty("volumeMounts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<io.fabric8.kubernetes.api.model.VolumeMount> volumeMounts = new ArrayList<io.fabric8.kubernetes.api.model.VolumeMount>();
    @JsonProperty("volumes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<io.fabric8.kubernetes.api.model.Volume> volumes = new ArrayList<io.fabric8.kubernetes.api.model.Volume>();
    @JsonProperty("workerArgs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> workerArgs = new ArrayList<java.lang.String>();
    @JsonProperty("workerCommand")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> workerCommand = new ArrayList<java.lang.String>();
    @JsonProperty("workerCpu")
    private Quantity workerCpu;
    @JsonProperty("workerInstances")
    private Integer workerInstances;
    @JsonProperty("workerMemory")
    private Quantity workerMemory;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ComputerJobSpec() {
    }

    /**
     * 
     * @param remoteJarUri
     * @param configMapPaths
     * @param envVars
     * @param masterCommand
     * @param securityContext
     * @param podTemplateSpec
     * @param pullPolicy
     * @param volumeMounts
     * @param workerMemory
     * @param computerConf
     * @param secretPaths
     * @param masterMemory
     * @param log4jXml
     * @param workerCpu
     * @param envFrom
     * @param pullSecrets
     * @param image
     * @param volumes
     * @param algorithmName
     * @param jvmOptions
     * @param jobId
     * @param workerCommand
     * @param masterArgs
     * @param workerArgs
     * @param jarFile
     * @param masterCpu
     * @param workerInstances
     */
    public ComputerJobSpec(String algorithmName, Map<String, String> computerConf, Map<String, String> configMapPaths, List<EnvFromSource> envFrom, List<io.fabric8.kubernetes.api.model.EnvVar> envVars, String image, String jarFile, String jobId, String jvmOptions, String log4jXml, List<java.lang.String> masterArgs, List<java.lang.String> masterCommand, Quantity masterCpu, Quantity masterMemory, PodTemplateSpec podTemplateSpec, java.lang.String pullPolicy, List<LocalObjectReference> pullSecrets, String remoteJarUri, Map<String, String> secretPaths, SecurityContext securityContext, List<io.fabric8.kubernetes.api.model.VolumeMount> volumeMounts, List<io.fabric8.kubernetes.api.model.Volume> volumes, List<java.lang.String> workerArgs, List<java.lang.String> workerCommand, Quantity workerCpu, Integer workerInstances, Quantity workerMemory) {
        super();
        this.algorithmName = algorithmName;
        this.computerConf = computerConf;
        this.configMapPaths = configMapPaths;
        this.envFrom = envFrom;
        this.envVars = envVars;
        this.image = image;
        this.jarFile = jarFile;
        this.jobId = jobId;
        this.jvmOptions = jvmOptions;
        this.log4jXml = log4jXml;
        this.masterArgs = masterArgs;
        this.masterCommand = masterCommand;
        this.masterCpu = masterCpu;
        this.masterMemory = masterMemory;
        this.podTemplateSpec = podTemplateSpec;
        this.pullPolicy = pullPolicy;
        this.pullSecrets = pullSecrets;
        this.remoteJarUri = remoteJarUri;
        this.secretPaths = secretPaths;
        this.securityContext = securityContext;
        this.volumeMounts = volumeMounts;
        this.volumes = volumes;
        this.workerArgs = workerArgs;
        this.workerCommand = workerCommand;
        this.workerCpu = workerCpu;
        this.workerInstances = workerInstances;
        this.workerMemory = workerMemory;
    }

    @JsonProperty("algorithmName")
    public String getAlgorithmName() {
        return algorithmName;
    }

    @JsonProperty("algorithmName")
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public ComputerJobSpec withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }

    @JsonProperty("computerConf")
    public Map<String, String> getComputerConf() {
        return computerConf;
    }

    @JsonProperty("computerConf")
    public void setComputerConf(Map<String, String> computerConf) {
        this.computerConf = computerConf;
    }

    public ComputerJobSpec withComputerConf(Map<String, String> computerConf) {
        this.computerConf = computerConf;
        return this;
    }

    @JsonProperty("configMapPaths")
    public Map<String, String> getConfigMapPaths() {
        return configMapPaths;
    }

    @JsonProperty("configMapPaths")
    public void setConfigMapPaths(Map<String, String> configMapPaths) {
        this.configMapPaths = configMapPaths;
    }

    public ComputerJobSpec withConfigMapPaths(Map<String, String> configMapPaths) {
        this.configMapPaths = configMapPaths;
        return this;
    }

    @JsonProperty("envFrom")
    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    @JsonProperty("envFrom")
    public void setEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
    }

    public ComputerJobSpec withEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    @JsonProperty("envVars")
    public List<io.fabric8.kubernetes.api.model.EnvVar> getEnvVars() {
        return envVars;
    }

    @JsonProperty("envVars")
    public void setEnvVars(List<io.fabric8.kubernetes.api.model.EnvVar> envVars) {
        this.envVars = envVars;
    }

    public ComputerJobSpec withEnvVars(List<io.fabric8.kubernetes.api.model.EnvVar> envVars) {
        this.envVars = envVars;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public ComputerJobSpec withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("jarFile")
    public String getJarFile() {
        return jarFile;
    }

    @JsonProperty("jarFile")
    public void setJarFile(String jarFile) {
        this.jarFile = jarFile;
    }

    public ComputerJobSpec withJarFile(String jarFile) {
        this.jarFile = jarFile;
        return this;
    }

    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    @JsonProperty("jobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ComputerJobSpec withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    @JsonProperty("jvmOptions")
    public String getJvmOptions() {
        return jvmOptions;
    }

    @JsonProperty("jvmOptions")
    public void setJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    public ComputerJobSpec withJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }

    @JsonProperty("log4jXml")
    public String getLog4jXml() {
        return log4jXml;
    }

    @JsonProperty("log4jXml")
    public void setLog4jXml(String log4jXml) {
        this.log4jXml = log4jXml;
    }

    public ComputerJobSpec withLog4jXml(String log4jXml) {
        this.log4jXml = log4jXml;
        return this;
    }

    @JsonProperty("masterArgs")
    public List<java.lang.String> getMasterArgs() {
        return masterArgs;
    }

    @JsonProperty("masterArgs")
    public void setMasterArgs(List<java.lang.String> masterArgs) {
        this.masterArgs = masterArgs;
    }

    public ComputerJobSpec withMasterArgs(List<java.lang.String> masterArgs) {
        this.masterArgs = masterArgs;
        return this;
    }

    @JsonProperty("masterCommand")
    public List<java.lang.String> getMasterCommand() {
        return masterCommand;
    }

    @JsonProperty("masterCommand")
    public void setMasterCommand(List<java.lang.String> masterCommand) {
        this.masterCommand = masterCommand;
    }

    public ComputerJobSpec withMasterCommand(List<java.lang.String> masterCommand) {
        this.masterCommand = masterCommand;
        return this;
    }

    @JsonProperty("masterCpu")
    public Quantity getMasterCpu() {
        return masterCpu;
    }

    @JsonProperty("masterCpu")
    public void setMasterCpu(Quantity masterCpu) {
        this.masterCpu = masterCpu;
    }

    public ComputerJobSpec withMasterCpu(Quantity masterCpu) {
        this.masterCpu = masterCpu;
        return this;
    }

    @JsonProperty("masterMemory")
    public Quantity getMasterMemory() {
        return masterMemory;
    }

    @JsonProperty("masterMemory")
    public void setMasterMemory(Quantity masterMemory) {
        this.masterMemory = masterMemory;
    }

    public ComputerJobSpec withMasterMemory(Quantity masterMemory) {
        this.masterMemory = masterMemory;
        return this;
    }

    @JsonProperty("podTemplateSpec")
    public PodTemplateSpec getPodTemplateSpec() {
        return podTemplateSpec;
    }

    @JsonProperty("podTemplateSpec")
    public void setPodTemplateSpec(PodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
    }

    public ComputerJobSpec withPodTemplateSpec(PodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
        return this;
    }

    @JsonProperty("pullPolicy")
    public java.lang.String getPullPolicy() {
        return pullPolicy;
    }

    @JsonProperty("pullPolicy")
    public void setPullPolicy(java.lang.String pullPolicy) {
        this.pullPolicy = pullPolicy;
    }

    public ComputerJobSpec withPullPolicy(java.lang.String pullPolicy) {
        this.pullPolicy = pullPolicy;
        return this;
    }

    @JsonProperty("pullSecrets")
    public List<LocalObjectReference> getPullSecrets() {
        return pullSecrets;
    }

    @JsonProperty("pullSecrets")
    public void setPullSecrets(List<LocalObjectReference> pullSecrets) {
        this.pullSecrets = pullSecrets;
    }

    public ComputerJobSpec withPullSecrets(List<LocalObjectReference> pullSecrets) {
        this.pullSecrets = pullSecrets;
        return this;
    }

    @JsonProperty("remoteJarUri")
    public String getRemoteJarUri() {
        return remoteJarUri;
    }

    @JsonProperty("remoteJarUri")
    public void setRemoteJarUri(String remoteJarUri) {
        this.remoteJarUri = remoteJarUri;
    }

    public ComputerJobSpec withRemoteJarUri(String remoteJarUri) {
        this.remoteJarUri = remoteJarUri;
        return this;
    }

    @JsonProperty("secretPaths")
    public Map<String, String> getSecretPaths() {
        return secretPaths;
    }

    @JsonProperty("secretPaths")
    public void setSecretPaths(Map<String, String> secretPaths) {
        this.secretPaths = secretPaths;
    }

    public ComputerJobSpec withSecretPaths(Map<String, String> secretPaths) {
        this.secretPaths = secretPaths;
        return this;
    }

    @JsonProperty("securityContext")
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public ComputerJobSpec withSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    @JsonProperty("volumeMounts")
    public List<io.fabric8.kubernetes.api.model.VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<io.fabric8.kubernetes.api.model.VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public ComputerJobSpec withVolumeMounts(List<io.fabric8.kubernetes.api.model.VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    @JsonProperty("volumes")
    public List<io.fabric8.kubernetes.api.model.Volume> getVolumes() {
        return volumes;
    }

    @JsonProperty("volumes")
    public void setVolumes(List<io.fabric8.kubernetes.api.model.Volume> volumes) {
        this.volumes = volumes;
    }

    public ComputerJobSpec withVolumes(List<io.fabric8.kubernetes.api.model.Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    @JsonProperty("workerArgs")
    public List<java.lang.String> getWorkerArgs() {
        return workerArgs;
    }

    @JsonProperty("workerArgs")
    public void setWorkerArgs(List<java.lang.String> workerArgs) {
        this.workerArgs = workerArgs;
    }

    public ComputerJobSpec withWorkerArgs(List<java.lang.String> workerArgs) {
        this.workerArgs = workerArgs;
        return this;
    }

    @JsonProperty("workerCommand")
    public List<java.lang.String> getWorkerCommand() {
        return workerCommand;
    }

    @JsonProperty("workerCommand")
    public void setWorkerCommand(List<java.lang.String> workerCommand) {
        this.workerCommand = workerCommand;
    }

    public ComputerJobSpec withWorkerCommand(List<java.lang.String> workerCommand) {
        this.workerCommand = workerCommand;
        return this;
    }

    @JsonProperty("workerCpu")
    public Quantity getWorkerCpu() {
        return workerCpu;
    }

    @JsonProperty("workerCpu")
    public void setWorkerCpu(Quantity workerCpu) {
        this.workerCpu = workerCpu;
    }

    public ComputerJobSpec withWorkerCpu(Quantity workerCpu) {
        this.workerCpu = workerCpu;
        return this;
    }

    @JsonProperty("workerInstances")
    public Integer getWorkerInstances() {
        return workerInstances;
    }

    @JsonProperty("workerInstances")
    public void setWorkerInstances(Integer workerInstances) {
        this.workerInstances = workerInstances;
    }

    public ComputerJobSpec withWorkerInstances(Integer workerInstances) {
        this.workerInstances = workerInstances;
        return this;
    }

    @JsonProperty("workerMemory")
    public Quantity getWorkerMemory() {
        return workerMemory;
    }

    @JsonProperty("workerMemory")
    public void setWorkerMemory(Quantity workerMemory) {
        this.workerMemory = workerMemory;
    }

    public ComputerJobSpec withWorkerMemory(Quantity workerMemory) {
        this.workerMemory = workerMemory;
        return this;
    }

}
