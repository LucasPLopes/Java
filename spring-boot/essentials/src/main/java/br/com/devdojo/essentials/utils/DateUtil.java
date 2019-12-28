package br.com.devdojo.essentials.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;


// @EnableAutoConfiguration // não é necessário
@Component
public class DateUtil {
    public String formatLocalDateToDatabaseStyle(final LocalDateTime ldt) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(ldt);
    }
}