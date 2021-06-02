package Exception;

public class LackOfSubjectException extends Exception {
    public LackOfSubjectException() {
        super("Ошибка. У студента должен быть хотя бы один предмет");
    }
}
