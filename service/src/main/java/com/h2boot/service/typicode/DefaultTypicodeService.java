package com.h2boot.service.typicode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("defaultTypicodeService")
public class DefaultTypicodeService implements TypicodeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultTypicodeService.class);
}
