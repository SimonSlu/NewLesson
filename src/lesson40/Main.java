package lesson40;

public class Main {
    public static void main(String[] args) {
        TaskService tasks = new TaskService();

        tasks.add(new Task("first"));
        tasks.add(new Task("second"));
        tasks.add(new Task("third"));
        tasks.add(new Task("forth"));

        tasks.complete();
        tasks.complete();

        tasks.add(new Task("fifth"));

        tasks.complete();

    }
}
