package com.aoher.service.impl;

import com.aoher.service.ExampleService;

import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link ExampleService}
 */
@Stateless
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String greet(String name) {
        return String.format("Hello %s!", name);
    }

    @Override
    public Map<Object, Object> getSystemProperties() {
        return new HashMap<>(System.getProperties());
    }
}
