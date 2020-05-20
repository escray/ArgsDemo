package cn.extremeprogramming.kata;
// 一定要用 RuntimeException
public class UnspecifiedArgument extends RuntimeException {

    public UnspecifiedArgument(String label) {
        super(label);
    }
}
