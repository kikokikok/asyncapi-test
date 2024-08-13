
package com.kyriba.asyncapitest.model;

import java.util.Date;

public class TaskStatusUpdate {
    private String taskId;
    private String status;
    private Date timestamp;

    public TaskStatusUpdate(String taskId, String status, Date timestamp) {
        this.taskId = taskId;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return taskId;
    }

    // Getters and setters
    // ...
}
        