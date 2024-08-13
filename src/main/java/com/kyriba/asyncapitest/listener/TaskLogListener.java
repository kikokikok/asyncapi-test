
package com.kyriba.asyncapitest.listener;

import com.kyriba.asyncapitest.model.TaskLogUpdate;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TaskLogListener {

    @RabbitListener(queuesToDeclare = @Queue("task-log-queue"))
    public void subscribeTaskLogsAmqp(TaskLogUpdate logUpdate) {
        System.out.println("Received log update via AMQP: " + logUpdate.getLog());
    }
}
        