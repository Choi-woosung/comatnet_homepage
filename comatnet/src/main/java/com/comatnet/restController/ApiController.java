package com.comatnet.restController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ApiController
 */
@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        Map<String, String> result = new HashMap<>();
        result.put("message", "안녕하세요.");

        return result;
    }
    
}