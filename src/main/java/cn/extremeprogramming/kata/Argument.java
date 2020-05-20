package cn.extremeprogramming.kata;

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
        if (type.equals("boolean")) return parseBoolean(rawValue);
        if (type.equals("integer")) return parseInt(rawValue);
        if (type.equals("[string]")) return rawValue.split(",");
        return rawValue;
    }
}
