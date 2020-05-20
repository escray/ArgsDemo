package cn.extremeprogramming.kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArgumentsAcceptanceTest {
    @Test
    public void should_be_able_to_parse_arguments() {
        // 1. create schema object from text
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);

        // 2. create arguments object from schema and string array
        String argumentsAsText = "-l true -p 8080 -d /usr/log";
        String[] argumentAsStrings = {"-l", "true", "-p", "8080", "-d", "/usr/log"};
        Arguments arguments = new Arguments(schema, argumentAsStrings);

        // 3. get value from arguments object
        assertThat(arguments.valueOf("l"), is(true));
        assertThat(arguments.valueOf("p"), is(8080));
        assertThat(arguments.valueOf("d"), is("/usr/log"));
    }
}
