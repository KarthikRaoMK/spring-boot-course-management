package com.example.coursemanagement.controller;

import com.example.coursemanagement.device.MobilePhone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    private final MobilePhone phone;

    public PhoneController(MobilePhone phone) {
        this.phone = phone;
    }

    @GetMapping("/on")
    public String turnOnPhone() {
        return phone.turnOn();
    }
}
