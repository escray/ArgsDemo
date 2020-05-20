package cn.extremeprogramming.kata;

public class StringArgsValue implements ArgsType {
    @Override
    public Object apply(String rawValue) {
        return rawValue;
    }
}
