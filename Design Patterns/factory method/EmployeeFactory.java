public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("Java Developer")) {
            return new JavaDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Python Developer")) {
            return new PythonDeveloper();
        } else {
            return null;
        }
    }
}
