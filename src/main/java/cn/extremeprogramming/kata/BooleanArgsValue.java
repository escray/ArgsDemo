package cn.extremeprogramming.kata;

import static java.lang.Boolean.parseBoolean;

public class BooleanArgsValue implements ArgsType {
    @Override
    public Object apply(String rawValue) {
        return parseBoolean(rawValue);
    }
}
