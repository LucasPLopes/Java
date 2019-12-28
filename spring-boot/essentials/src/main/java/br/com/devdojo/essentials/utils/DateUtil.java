package br.com.devdojo.essentials.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;


@EnableAutoConfiguration
@Component
public class DateUtil {
    public String formatLocalDateToDatabaseStyle(final LocalDateTime ldt) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(ldt);
    }
}