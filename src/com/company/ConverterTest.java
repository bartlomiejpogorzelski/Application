package com.company;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class ConverterTest {
    @Test
    public void compute() throws Exception {
        Converter conventer = new Converter();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("add 2");
        arrayList.add("multiply 3");
        arrayList.add("apply 10");

        Assert.assertEquals(36.0, conventer.compute(arrayList)); // !!! errors

    }

}