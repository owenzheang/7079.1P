import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskStatusServiceTest {

    @Test
    public void testSubmittedTaskStatus() {
        TaskStatusService service = new TaskStatusService();
        String result = service.getTaskStatus("S123", "9.1P");
        assertEquals("Submitted", result);
    }

    @Test
    public void testUnknownTaskStatus() {
        TaskStatusService service = new TaskStatusService();
        String result = service.getTaskStatus("S999", "9.1P");
        assertEquals("Not Submitted", result);
    }
}