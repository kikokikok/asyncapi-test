
package com.kyriba.asyncapitest.controller;

import com.kyriba.asyncapitest.model.TaskLogUpdate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskLogsController {

    @GetMapping("/task/logs/{taskId}")
    public TaskLogUpdate subscribeTaskLogsHttp(@PathVariable String taskId) {
        return new TaskLogUpdate(taskId, "Log message", new java.util.Date());
    }
}
        