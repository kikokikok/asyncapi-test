
package com.kyriba.asyncapitest.controller;

import com.kyriba.asyncapitest.model.TaskStatusUpdate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskStatusController {

    @GetMapping("/task/status/{taskId}")
    public TaskStatusUpdate subscribeTaskStatusHttp(@PathVariable String taskId) {
        return new TaskStatusUpdate(taskId, "IN_PROGRESS", new java.util.Date());
    }
}
        