package cn.extremeprogramming.kata;

import static java.lang.Integer.parseInt;

public class IntegerArgsValue implements ArgsType {
    @Override
    public Object apply(String rawValue) {
        return parseInt(rawValue);
    }
}
