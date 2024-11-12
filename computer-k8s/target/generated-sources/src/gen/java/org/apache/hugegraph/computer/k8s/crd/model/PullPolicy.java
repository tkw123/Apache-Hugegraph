
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PullPolicy {

    ALWAYS("Always"),
    NEVER("Never"),
    IF_NOT_PRESENT("IfNotPresent");
    private final String value;
    private final static Map<String, PullPolicy> CONSTANTS = new HashMap<String, PullPolicy>();

    static {
        for (PullPolicy c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PullPolicy(String value) {
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
    public static PullPolicy fromValue(String value) {
        PullPolicy constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
