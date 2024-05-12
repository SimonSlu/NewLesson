package lesson41.task1;

public class Main {
    public static void main(String[] args) {
        TaskService tasks = new TaskService();

        tasks.add(new Task("1"));
        tasks.add(new Task("2"));
        tasks.add(new Task("3"));

        tasks.complete();

        tasks.add(new Task("4"));

        tasks.complete();
        tasks.complete();
        tasks.complete();
        tasks.complete();
        tasks.complete();
    }
}
