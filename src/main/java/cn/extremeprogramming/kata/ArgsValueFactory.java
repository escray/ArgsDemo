package cn.extremeprogramming.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ArgsValueFactory {
    static Map<String, ArgsType> argsTypeMap = new HashMap<>();
    static {
        argsTypeMap.put("boolean", new BooleanArgsValue());
        argsTypeMap.put("integer", new IntegerArgsValue());
        argsTypeMap.put("[string]", new ArrayArgsValue());
        argsTypeMap.put("string", new StringArgsValue());
    }

    public static Optional<ArgsType> getArgsType(String type) {
        return Optional.ofNullable(argsTypeMap.get(type));
    }
}
