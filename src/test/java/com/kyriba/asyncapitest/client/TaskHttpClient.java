//
//package com.kyriba.asyncapitest.client;
//
//import com.kyriba.asyncapitest.model.TaskExecutionRequest;
//import com.kyriba.asyncapitest.model.TaskLogUpdate;
//import com.kyriba.asyncapitest.model.TaskStatusUpdate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//
//import java.util.Map;
//
//@Service
//public class TaskHttpClient {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    public String executeTask(String taskName, Map<String, Object> payload) {
//        TaskExecutionRequest request = new TaskExecutionRequest();
//        request.setTaskName(taskName);
//        request.setPayload(payload);
//        return restTemplate.postForObject("http://localhost:8080/task/execute", request, String.class);
//    }
//
//    public TaskStatusUpdate getTaskStatus(String taskId) {
//        return restTemplate.getForObject("http://localhost:8080/task/status/" + taskId, TaskStatusUpdate.class);
//    }
//
//    public TaskLogUpdate getTaskLogs(String taskId) {
//        return restTemplate.getForObject("http://localhost:8080/task/logs/" + taskId, TaskLogUpdate.class);
//    }
//}
//