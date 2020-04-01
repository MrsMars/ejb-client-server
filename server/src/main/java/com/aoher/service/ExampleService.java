package com.aoher.service;

import javax.ejb.Remote;
import java.util.Map;

@Remote
public interface ExampleService {

    /**
     * Greet a name.
     * @param name name to greet
     * @return "Hello $name!"
     */
    public String greet(String name);

    /**
     * Get the system properties from the server.
     * @return system properties as map
     */
    public Map<Object, Object> getSystemProperties();
}
