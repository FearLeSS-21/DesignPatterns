public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.config();

        Editor editor = new Editor();

        // Adding the listeners
        LoggingListener logger = new LoggingListener(
                "Test2.txt",
                "Someone has opened the file: %s"
        );
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s"
        );
        editor.events.subscribe("save", emailAlerts);

        // Simulate file operations
        editor.openFile("Test2.txt");
        editor.saveFile();

        // Print email and message to file
        emailAlerts.printEmailAndMessageToFile();
    }
}
