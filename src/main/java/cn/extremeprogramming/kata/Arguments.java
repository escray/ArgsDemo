package cn.extremeprogramming.kata;

import java.util.ArrayList;
import java.util.List;

public class Arguments {
    private List<Argument> arguments;

    public Arguments(Schema schema, String[] argumentsAsStrings) {
        arguments = new ArrayList<>();
        for (int i = 0; i < argumentsAsStrings.length; i+=2) {
            String label = argumentsAsStrings[i];
            String rawValue = argumentsAsStrings[i + 1];
            arguments.add(new Argument(schema, label, rawValue));
        }
    }

    public Object valueOf(String label) {
        Argument match = arguments.stream().filter(argument -> argument.isOf(label)).findAny().get();

        return match.value();
    }

    public int size() {
        return arguments.size();
    }
    // 旧的不变，新的创建
    // 一步替换，旧的再见
}
