
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResourceName {

    CPU("cpu"),
    MEMORY("memory"),
    STORAGE("storage"),
    EPHEMERAL_STORAGE("ephemeral-storage");
    private final String value;
    private final static Map<String, ResourceName> CONSTANTS = new HashMap<String, ResourceName>();

    static {
        for (ResourceName c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ResourceName(String value) {
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
    public static ResourceName fromValue(String value) {
        ResourceName constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
