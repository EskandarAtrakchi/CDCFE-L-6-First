package rhntn;
import java.util.ArrayList;
import java.util.Scanner;

public class CollegeApp {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    ArrayList < Student > students = new ArrayList < > ();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Select an option:");
      System.out.println("1. Quit");
      System.out.println("2. Show all full time students");
      System.out.println("3. Show all mature students");
      System.out.println("4. Add a new full time student");
      System.out.println("5. Add a new mature student");
      System.out.println("6. Remove an existing contact");
      System.out.println("7. Sort all students alphabetically");
      System.out.println("8. Print out student list to a text file");

      String choice = scanner.nextLine();
      switch (choice) {

      case "1":
        // Quit
    	System.out.println("Good-Bye");
        System.exit(0);
        return;
      case "2":
        // Show all full time students
        for (Student student: students) {
          if (student instanceof FulltimeStudent) {
            System.out.println("Student name is " + student.getName() + "\nStudent ID is " + student.getId());
          }
        }
        break;
      case "3":
        // Show all mature students
        for (Student student: students) {
          if (student instanceof MatureStudent) {
            System.out.println(student.getName() + " " + student.getId() + " " + ((MatureStudent) student).getAge());
          }
        }
        break;
      case "4":
        // Add a new full time student
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student id: ");
        String id = scanner.nextLine();
        System.out.println("Is the student full time? (true/false) ");
        boolean fulltime = scanner.nextBoolean();
        students.add(new FulltimeStudent(name, id, fulltime));
        break;
      case "5":
        // Add a new mature student
        System.out.println("Enter student name: ");
        name = scanner.nextLine();
        System.out.println("Enter student id: ");
        id = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();
        students.add(new MatureStudent(name, id, age));
        break;
      case "6":
        // Remove an existing contact
        System.out.println("Enter student id to remove: ");
        id = scanner.nextLine();
        for (Student student: students) {
          if (student.getId().equals(id)) {
            students.remove(student);
            break;
          }
        }
        break;
      case "7":
        // Sort all students alphabetically
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        break;
      case "8":
        // Print out student list to a text file
        // Code to write student list to a text file
        break;
      default:
        System.out.println("Invalid option selected.");
        break;
      }
    }
  }
}