
package com.kyriba.asyncapitest.listener;

import com.kyriba.asyncapitest.model.TaskExecutionRequest;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class TaskExecutionListener {

    @RabbitListener(queuesToDeclare = @Queue("task-execute-queue"))
    public void triggerTaskAmqp(TaskExecutionRequest request) {
        System.out.println("Task triggered via AMQP: " + request.getTaskName());
    }
}
        