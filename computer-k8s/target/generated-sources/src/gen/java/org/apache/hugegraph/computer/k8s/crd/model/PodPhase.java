
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PodPhase {

    PENDING("Pending"),
    RUNNING("Running"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed"),
    UNKNOWN("Unknown");
    private final String value;
    private final static Map<String, PodPhase> CONSTANTS = new HashMap<String, PodPhase>();

    static {
        for (PodPhase c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PodPhase(String value) {
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
    public static PodPhase fromValue(String value) {
        PodPhase constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
