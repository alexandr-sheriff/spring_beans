package com.alex.springbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties;

public class JavaConfigService {

    private final String timeOfInitializing;

    private Integer dayOfMonth;

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public JavaConfigService(String timeOfInitializing) {
        this.timeOfInitializing = timeOfInitializing;
    }

    public String hello() {
        return "Hello from Java config!!!" + " time: " + timeOfInitializing + " dayOfMonth " + dayOfMonth;
    }
}
