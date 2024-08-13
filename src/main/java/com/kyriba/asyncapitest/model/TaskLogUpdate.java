
package com.kyriba.asyncapitest.model;

import java.util.Date;

public class TaskLogUpdate {
    private String taskId;
    private String log;
    private Date timestamp;

    public TaskLogUpdate(String taskId, String log, Date timestamp) {
        this.taskId = taskId;
        this.log = log;
        this.timestamp = timestamp;
    }

    public String getLog() {
        return taskId;
    }

    // Getters and setters
    // ...
}
        