
package com.kyriba.asyncapitest.listener;

import com.kyriba.asyncapitest.model.TaskStatusUpdate;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TaskStatusListener {

    @RabbitListener(queuesToDeclare = @Queue("task-status-queue"))
    public void subscribeTaskStatusAmqp(TaskStatusUpdate statusUpdate) {
        System.out.println("Received status update via AMQP: " + statusUpdate.getStatus());
    }
}
        