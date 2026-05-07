public class TaskStatusService {

    public String getTaskStatus(String studentId, String taskId) {
        if (studentId.equals("S123") && taskId.equals("9.1P")) {
            return "Submitted";
        }
        return "Not Submitted";
    }
}