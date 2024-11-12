
package org.apache.hugegraph.computer.k8s.crd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CommonComponentState {

    NOT_READY("NotReady"),
    READY("Ready"),
    DELETED("Deleted");
    private final String value;
    private final static Map<String, CommonComponentState> CONSTANTS = new HashMap<String, CommonComponentState>();

    static {
        for (CommonComponentState c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CommonComponentState(String value) {
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
    public static CommonComponentState fromValue(String value) {
        CommonComponentState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
