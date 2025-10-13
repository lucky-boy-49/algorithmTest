package org.example;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.util.List;

public class StrListConverter implements ArgumentConverter {

    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        String data = (String) source;
        String[] split = data.substring(1, data.length() - 1).split(",");
        return List.of(split);
    }
}
