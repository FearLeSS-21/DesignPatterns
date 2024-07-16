import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventManager {
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        if (users == null) {
            users = new ArrayList<>();
            listeners.put(eventType, users);
        }
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        if (users != null) {
            users.remove(listener);
        }
    }

    public void notify(String eventType, String data) {
        List<EventListener> users = listeners.get(eventType);

        if (users != null) {
            for (EventListener listener : users) {
                listener.update(data);
            }
        }
    }
}
