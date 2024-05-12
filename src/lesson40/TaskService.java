package lesson40;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskService {
    private final Queue<Task> tasks = new ArrayDeque<>();

    public Task add(Task task) {
        tasks.offer(task);
        System.out.printf("Task %s added \n", task.getName());
        return task;
    }

    public void complete(){
        Task task = tasks.poll();

        if (task != null) {
            System.out.printf("Task %s completed!\n", task.getName());
        } else {
            System.out.println("Tasks queue is empty");
        }
    }

}
