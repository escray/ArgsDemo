package cn.extremeprogramming.kata;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

public class Argument {
    public String label;
    public String rawValue;
    public String type;

    public Argument(Schema schema, String label, String rawValue) {
        this.label = label.replace("-", "");
        this.rawValue = rawValue;
        this.type = schema.specOf(this.label).type;
    }

    public boolean isOf(String label) {
        return this.label.equals(label);
    }

    // TODO: 6 lines ?
    public Object value() {
        return valueUsingFactory(type, rawValue);
    }

    public Object valueUsingFactory(String type, String rawValue) {
        ArgsType argsValue = ArgsValueFactory.getArgsType(type)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return argsValue.apply(rawValue);
    }
}

