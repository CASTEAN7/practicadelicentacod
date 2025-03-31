package com.iucosoft.javaeefinalproject.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

;

/**
 *
 * @author scostea
 */
@Component
public class StringToDateConverter implements Converter<String, Date> {

    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date convert(String source) {
        try {
            System.out.println("Converting date: " + source);  // Debugging log
            return formatter.parse(source);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date format: " + source);
        }
    }
}
