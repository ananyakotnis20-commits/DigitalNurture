// StudentView.java (View)
public class StudentView {
    public void displayStudentDetails(String name, int id, String grade) {
        System.out.println("╔══════════════════════╗");
        System.out.println("║   STUDENT DETAILS    ║");
        System.out.println("╠══════════════════════╣");
        System.out.println("║ Name  : " + name);
        System.out.println("║ ID    : " + id);
        System.out.println("║ Grade : " + grade);
        System.out.println("╚══════════════════════╝");
    }
}