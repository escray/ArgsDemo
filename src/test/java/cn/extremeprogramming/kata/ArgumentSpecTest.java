package cn.extremeprogramming.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArgumentSpecTest {
    @Test
    public void should_create_argument_spec_out_of_text() {
        ArgumentSpec argumentSpec = new ArgumentSpec("l:boolean");
        assertThat(argumentSpec.label, is("l"));
        assertThat(argumentSpec.type, is("boolean"));
    }

}
