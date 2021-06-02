package Exception;

public class LackGroupInFacultyException extends Exception {
    public LackGroupInFacultyException() {
        super("Отсутствуют группы на факультете");
    }
}
