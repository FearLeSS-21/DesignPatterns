class Application {
    public void config() {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener(
                "test2.txt",
                "Someone has opened the file: %s"
        );
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s"
        );
        editor.events.subscribe("save", emailAlerts);
    }
}
