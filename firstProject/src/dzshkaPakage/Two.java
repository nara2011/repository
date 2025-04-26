package dzshkaPakage;

import java.util.ArrayList;

public class Two {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void allTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markAsCompleted();
                return;
            }
        }
    }
}
