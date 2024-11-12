
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RestartPolicy {

    ALWAYS("Always"),
    ON_FAILURE("OnFailure"),
    NEVER("Never");
    private final String value;
    private final static Map<String, RestartPolicy> CONSTANTS = new HashMap<String, RestartPolicy>();

    static {
        for (RestartPolicy c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RestartPolicy(String value) {
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
    public static RestartPolicy fromValue(String value) {
        RestartPolicy constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
