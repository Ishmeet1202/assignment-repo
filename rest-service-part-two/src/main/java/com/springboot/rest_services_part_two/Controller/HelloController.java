package com.springboot.rest_services_part_two.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    private MessageSource messageSource;

    @Autowired
    public HelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello")
    public String sayGoodMorning() {

        Locale locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage(
                "hi",
                null,
                locale
        );
    }
    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "User") String username) {

        Locale locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage(
                "good.morning",
                new Object[]{username},
                locale
        );
    }
}

