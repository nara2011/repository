package dzshkaPakage;

public class Main {
    public static void main(String[] args) {
        Two manager = new Two();

        Task task1 = new Task("Java", "addArrayList");
        Task task2 = new Task("Java", "removeArrayList");
        Task task3 = new Task("Java", "HashMap");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("== Все задачи ==");
        manager.allTasks();

        System.out.println("\n== Удаляем задачу с id = 2 ==");
        manager.removeTask(2);
        manager.allTasks();

        System.out.println("\n== Отмечаем задачу с id = 0 как выполненную ==");
        manager.markAsCompleted(0);
        manager.allTasks();
    }
}

