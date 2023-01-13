package sac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class CollegeApp {
	
	public static void PrintingMethod() {
		
		//I created the file gonote.txt to write to it
		
		Path path = Paths.get("C:\\Users\\escan\\Desktop\\gonote.txt");//Using Paths from Java 8
		
		String text = new String();
		
		try {//start try
			
			System.out.println("Successfully Printed To gonote!");//inform the user
			Files.write(path, text.getBytes());//get the path to the note-pad 
		
		} 
        
        catch (IOException e) {//start catch
			System.out.println("Error, file already exist");//when it cannot print or create the file 
		    e.printStackTrace();

        }

	}//end catch

		@SuppressWarnings("unused")
		private static void timerMethod() {
            //start timer method 
            Thread.currentThread();//get current thread 

            try {//start try 
            Thread.sleep(500);//get the thread
            } 
            catch (InterruptedException e) {//start catch
            e.printStackTrace();//catch errors
            }//end catch
		}//end method
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);

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

            int choice = input.nextInt();
            input.nextLine();

                if (choice == 1) {
                    // Quit
                	System.out.println("Good-Bye");
                	input.close();
                    System.exit(0);
                } else if (choice == 2) {
                    // Show all full time students
                	System.out.println("\t\tShow all full time students\n");
                	System.out.println("Name\t\tID");
                    for (Student student : students) {
                        if (student instanceof FulltimeStudent) {
                        	
                            System.out.println(student.getName() +"\t\t"+ student.getId()+"\n");
                        }
                    }
                } else if (choice == 3) {
                	System.out.println("\t\tShow all mature students\n");
                	System.out.println("Name\t\tID");
                    // Show all mature students
                    for (Student student : students) {
                        if (student instanceof MatureStudent) {
                        	
                            System.out.println(student.getName() + "\t\t" + student.getId());
                        }
                    }
                } 
                else if (choice == 4) {
                    // Add a new full time student
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.print("Enter student id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Is the student full-time? (true/false): ");
                    boolean fullTime = input.nextBoolean();
                    input.nextLine();

                    boolean idExists = false;
                    for (Student student : students) {
                        if (student.getId() == id) {
                            idExists = true;
                            break;
                        }
                    }

                    if (!idExists) {
                        FulltimeStudent newStudent = new FulltimeStudent(name, id, fullTime);
                        students.add(newStudent);
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Error: student with ID " + id + " already exists.");
                    }
                } 
                else if (choice == 5) {
                    // Add a new mature student
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.print("Enter student id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter student age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    boolean idExists = false;
                    for (Student student : students) {
                        if (student.getId() == id) {
                            idExists = true;
                            break;
                        }
                    }

                    if (!idExists) {
                        MatureStudent newStudent = new MatureStudent(name, id, age);
                        students.add(newStudent);
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Error: student with ID " + id + " already exists.");
                    }
                }
                else if (choice == 6) {
                    // Remove an existing contact
                    System.out.print("Enter student id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.getId() == id) {
                            students.remove(student);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Student removed successfully.");
                    }
                } else if (choice == 7) {
                    // Sort all students alphabetically
                	 students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
                	 for (Student student : students) {
                		    System.out.println(student.getName());
                		}
                	 
                } 
                else if (choice == 8) {
                	PrintingMethod(students);
                }
                
                else {
                    System.out.println("Invalid choice. Please select a valid option.");
                }
                
            }
        }
    }