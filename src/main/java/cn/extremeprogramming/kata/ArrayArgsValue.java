package cn.extremeprogramming.kata;

public class ArrayArgsValue implements ArgsType {
    @Override
    public Object apply(String rawValue) {
        return rawValue.split(",");
    }
}
