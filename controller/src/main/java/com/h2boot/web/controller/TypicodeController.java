package com.h2boot.web.controller;

import com.h2boot.web.config.API;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(API.Typicode.ROOT)
public class TypicodeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TypicodeController.class);
}
