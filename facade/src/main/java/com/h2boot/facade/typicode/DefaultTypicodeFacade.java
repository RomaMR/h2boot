package com.h2boot.facade.typicode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("defaultTypicodeFacade")
public class DefaultTypicodeFacade implements TypicodeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultTypicodeFacade.class);
}
