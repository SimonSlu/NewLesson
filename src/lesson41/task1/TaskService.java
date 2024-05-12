package lesson41.task1;

import java.util.LinkedHashSet;
import java.util.Set;

public class TaskService {
    private final Set<Task> tasks = new LinkedHashSet<>();

    public Task add(Task task) {
        tasks.add(task);
        System.out.printf("Task %s added \n", task.getName());
        return task;
    }

    public void complete() {
        Task task;
        if(tasks.isEmpty()){
            System.out.println("all tasks complete");
            return;
        }
        for (Task t : tasks) {
            task = t;
            if (task == null) {
                System.out.println("all tasks complete");
            } else {
                System.out.printf("Task %s complete \n", task.getName());
                tasks.remove(task);

            }
            break;
        }

    }
}
