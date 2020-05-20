package cn.extremeprogramming.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArgumentTest {

    private Argument argument;

    @Before
    public void setUp() {
        Schema schema = new Schema("l:boolean");
        argument = new Argument(schema,"-l", "true");
    }

    @Test
    public void should_create_argument_out_of_schema_and_label_and_rawValue() {
        assertThat(argument.label, is("l"));
        assertThat(argument.rawValue, is("true"));
        assertThat(argument.type, is("boolean"));
    }

    @Test
    public void should_determine_if_argument_is_of_given_label() {
        assertThat(argument.isOf("l"), is(true));
        assertThat(argument.isOf("w"), is(false));
    }

    @Test
    public void should_support_string_array_type() {
        Schema schema = new Schema("x:[string]");
        Argument argument = new Argument(schema, "-x", "123,456");
        assertThat(argument.value(), is(new String[]{"123", "456"}));
    }

// 软件是一点一点生长出来的

}
