//
//package com.kyriba.asyncapitest.client;
//
//import com.kyriba.asyncapitest.model.TaskExecutionRequest;
//import com.kyriba.asyncapitest.model.TaskLogUpdate;
//import com.kyriba.asyncapitest.model.TaskStatusUpdate;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service
//public class TaskAmqpClient {
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    public void executeTask(String taskName, Map<String, Object> payload) {
//        TaskExecutionRequest request = new TaskExecutionRequest();
//        request.setTaskName(taskName);
//        request.setPayload(payload);
//        rabbitTemplate.convertAndSend("task-execute-queue", request);
//    }
//
//    public void publishTaskStatus(TaskStatusUpdate statusUpdate) {
//        rabbitTemplate.convertAndSend("task-status-queue", statusUpdate);
//    }
//
//    public void publishTaskLog(TaskLogUpdate logUpdate) {
//        rabbitTemplate.convertAndSend("task-log-queue", logUpdate);
//    }
//}
//