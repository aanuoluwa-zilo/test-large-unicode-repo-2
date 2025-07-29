// Java file 1
package com.example.processor;

import java.util.*;
import java.time.Instant;

public class DataProcessor1 {
    private Map<String, Object> data;
    private int processedCount;
    
    public DataProcessor1() {
        this.data = new HashMap<>();
        this.processedCount = 0;
    }
    
    public List<Map<String, Object>> processData(List<Map<String, Object>> inputData) {
        List<Map<String, Object>> processed = new ArrayList<>();
        
        for (Map<String, Object> item : inputData) {
            if (validateItem(item)) {
                processed.add(transformItem(item));
                processedCount++;
            }
        }
        
        return processed;
    }
    
    private boolean validateItem(Map<String, Object> item) {
        return item.containsKey("id") && 
               item.containsKey("name") && 
               item.containsKey("value");
    }
    
    private Map<String, Object> transformItem(Map<String, Object> item) {
        Map<String, Object> transformed = new HashMap<>();
        transformed.put("id", item.get("id"));
        transformed.put("name", ((String) item.get("name")).toUpperCase());
        transformed.put("value", ((Number) item.get("value")).doubleValue() * 2);
        transformed.put("processedAt", Instant.now().toEpochMilli());
        
        return transformed;
    }
}
