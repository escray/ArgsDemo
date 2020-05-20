package cn.extremeprogramming.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemaTest {
    @Test
    public void should_create_schema_out_of_text() {
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        assertThat(schema.size(), is(3));
    }

    @Test
    public void should_find_argument_spec_by_label() {
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        ArgumentSpec spec = schema.specOf("l");
        assertThat(spec.label, is("l"));
        assertThat(spec.type, is("boolean"));
    }
}
