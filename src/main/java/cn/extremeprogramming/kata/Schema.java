package cn.extremeprogramming.kata;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Schema {
    private final List<ArgumentSpec> argumentSpecs;

    public Schema(String schemaAsText) {
        String[] argSpecsAsStrings = schemaAsText.split(" ");
        argumentSpecs = stream(argSpecsAsStrings).map(ArgumentSpec::new).collect(Collectors.toList());
    }

    public int size() {
        return argumentSpecs.size();
    }

    public ArgumentSpec specOf(String label) {
        Optional<ArgumentSpec> candidate = getArgumentSpec(label);
        if (!candidate.isPresent()) throw new UnspecifiedArgument(label);
        return candidate.get();
    }

    private Optional<ArgumentSpec> getArgumentSpec(String label) {
        return argumentSpecs.stream().filter(spec -> spec.label.equals(label)).findAny();
    }
}
