package org.example;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.util.Arrays;

public class OneDIntArrayConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        String data = (String) source;
        // Remove the brackets and split the string into rows
        String[] rows = data.substring(1, data.length() - 1).split(",");
        return Arrays.stream(rows).mapToInt(Integer::parseInt).toArray();
    }
}
