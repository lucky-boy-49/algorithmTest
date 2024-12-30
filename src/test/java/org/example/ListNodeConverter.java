package org.example;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class ListNodeConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        String data = (String) source;
        String[] rows = data.substring(1, data.length() - 1).split(",");
        ListNode head = new ListNode(Integer.parseInt(rows[0]));
        ListNode tmp = head;
        for (int i = 1; i < rows.length; i++) {
            tmp.next = new ListNode(Integer.parseInt(rows[i]));
            tmp = tmp.next;
        }
        return head;
    }
}
