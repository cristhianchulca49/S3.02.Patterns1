import Level1.Undo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class TestUndo {

    private Undo undo;

    @BeforeEach
    public void setUp() {
        undo = Undo.getInstance();
        undo.clearHistory();
    }

    @Test
    public void testGetInstance() {
        Undo undo1 = Undo.getInstance();
        Undo undo2 = Undo.getInstance();

        Assertions.assertSame(undo1, undo2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"mkdir carpeta", "cd carpeta", "touch archivo.txt"})
    public void testAddCommand(String command) {
        undo.addCommand(command);

        List<String> history = undo.showHistory();
        Assertions.assertTrue(history.contains(command));
    }

    @ParameterizedTest
    @ValueSource(strings = {"mkdir carpeta", "cd carpeta", "touch archivo.txt"})
    public void testUndoCommand(String command) {
        undo.addCommand(command);

        String lastCommand = undo.undoCommand();
        Assertions.assertEquals(command, lastCommand);

        List<String> history = undo.showHistory();
        Assertions.assertFalse(history.contains(lastCommand));
    }

    @ParameterizedTest
    @ValueSource(strings = {"mkdir carpeta", "cd carpeta", "touch archivo.txt"})
    public void testShowHistory(String command) {
        undo.addCommand(command);

        String lastCommand = undo.undoCommand();
        Assertions.assertEquals(command, lastCommand);

        List<String> history = undo.showHistory();
        Assertions.assertFalse(history.contains(lastCommand));
    }
}
