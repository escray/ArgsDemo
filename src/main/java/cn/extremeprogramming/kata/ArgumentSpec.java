package cn.extremeprogramming.kata;

public class ArgumentSpec {

    public String label;
    public String type;

    public ArgumentSpec(String argSpecAsString) {
        label = argSpecAsString.split(":")[0];
        type = argSpecAsString.split(":")[1];
    }
}
