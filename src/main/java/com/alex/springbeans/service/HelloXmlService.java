package com.alex.springbeans.service;

public class HelloXmlService {
    private UtilService utilService;

    public String hello() {
        return utilService.append("Hello from Xml!!!");
    }

    public void setUtilService(UtilService utilService) {
        this.utilService = utilService;
    }
}
