
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JobComponentState {

    PENDING("Pending"),
    RUNNING("Running"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed"),
    CANCELLED("Cancelled"),
    UNKNOWN("Unknown");
    private final String value;
    private final static Map<String, JobComponentState> CONSTANTS = new HashMap<String, JobComponentState>();

    static {
        for (JobComponentState c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private JobComponentState(String value) {
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
    public static JobComponentState fromValue(String value) {
        JobComponentState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
