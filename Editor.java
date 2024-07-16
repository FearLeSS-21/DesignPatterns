import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {
    public EventManager events = new EventManager();
    private File file;
    Editor() {

        events = new EventManager();
    }
    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Test.txt");
            events.notify("save", file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
