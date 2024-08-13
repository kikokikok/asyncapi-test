
package com.kyriba.asyncapitest.model;

import java.util.Map;

public class TaskExecutionRequest {
    private String taskName;
    private Map<String, Object> payload;

    // Getters and setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Map<String, Object> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, Object> payload) {
        this.payload = payload;
    }
}
        