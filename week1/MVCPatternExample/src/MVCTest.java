// MVCTest.java
public class MVCTest {
    public static void main(String[] args) {
        Student        model      = new Student("Alice", 101, "A");
        StudentView    view       = new StudentView();
        StudentController controller = new StudentController(model, view);

        System.out.println("Initial:");
        controller.updateView();

        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");

        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}