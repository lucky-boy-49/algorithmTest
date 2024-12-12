package org.example;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.util.Arrays;

public class TwoDIntArrayConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) {
        String data = (String) source;
        // Remove the brackets and split the string into rows
        String[] rows = data.substring(2, data.length() - 2).split("],\\[");

        int[][] twoDArray = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(",");
            twoDArray[i] = Arrays.stream(cols).mapToInt(Integer::parseInt).toArray();
        }
        return twoDArray;
    }
}
