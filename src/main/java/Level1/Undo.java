package Level1;

import java.util.List;
import java.util.Stack;

public class Undo {
    private Stack<String> history = new Stack<>();
    private static Undo instance;

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) instance = new Undo();
        return instance;
    }

    public void addCommand(String command) {
        history.push(command);
    }

    public String undoCommand() {
        if (history.isEmpty()) throw new IllegalStateException("History is empty");
        return history.pop();
    }

    public List<String> showHistory() {
        return List.copyOf(history);
    }

    public void clearHistory() {
        history.clear();
    }
}
