
package com.kyriba.asyncapitest.controller;

import com.kyriba.asyncapitest.model.TaskExecutionRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskExecutionController {

    @PostMapping("/task/execute")
    public String triggerTaskHttp(@RequestBody TaskExecutionRequest request) {
        System.out.println("Task triggered via HTTP: " + request.getTaskName());
        String taskId = "task-" + System.currentTimeMillis();
        return taskId;
    }
}
        