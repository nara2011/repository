package DIP;

public class App {
	private Logger logger;

    public App(Logger logger) {
        this.logger = logger;
    }

    public void start() {
        logger.log("App started");
    }
}
