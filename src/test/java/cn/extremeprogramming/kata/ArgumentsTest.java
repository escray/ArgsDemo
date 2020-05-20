package cn.extremeprogramming.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ArgumentsTest {
    private Arguments arguments;

    @Before
    public void setUp() {
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        String[] argumentsAsStrings = {"-l", "true", "-p", "8080", "-d", "/usr/log"};
        arguments = new Arguments(schema, argumentsAsStrings);
    }

    @Test
    public void should_create_arguments_object_out_of_schema_and_string_array() {
        assertThat(arguments.size(), is(3));
    }

    @Test
    public void should_retrieve_argument_value() {
        assertThat(arguments.valueOf("d"), is("/usr/log"));
        assertThat(arguments.valueOf("l"), is(true));
        assertThat(arguments.valueOf("p"), is(8080));
    }

    @Test(expected = UnspecifiedArgument.class)
    public void should_raise_exception_with_unspecified_argument() {
        String schemaAsText = "l:boolean p:integer";
        Schema schema = new Schema(schemaAsText);
        String[] argumentsAsStrings = {"-l", "true", "-p", "8080", "-d", "/urs/log"};
        new Arguments(schema, argumentsAsStrings);

//        try {
//            new Arguments(schema, argumentsAsStrings);
//            fail();
//        } catch (UnspecifiedArgument e) {
//
//        } catch (NoSuchElementException e) {
//
//        }
    }
    // by using TDD, ignore use breakpoint
}
