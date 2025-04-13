package HomeWork;

public class Three {

	public static void main(String[] args) {
        Thread vacuuming = new Thread(() -> {
            System.out.println("Пылесосить");
        });
        vacuuming.setPriority(Thread.MIN_PRIORITY);

        Thread washingWindows = new Thread(() -> {
            System.out.println("Мою окна");
        });
       

        Thread takingOutTrash = new Thread(() -> {
            System.out.println("Выкидываю мусор");
        });
        takingOutTrash.setPriority(Thread.MAX_PRIORITY);

        vacuuming.start();
        washingWindows.start();
        takingOutTrash.start();
    }
}
