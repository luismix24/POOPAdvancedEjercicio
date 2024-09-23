package org.generation;
import org.generation.classes.Student;
import org.generation.classes.StudentService;
import org.generation.exceptions.CourseNotFoundException;
import org.generation.exceptions.StudentNotFoundException;

public class Main {
	public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent( new Student( "Ian", "1040", 28 ) );
        studentService.addStudent( new Student( "Elise", "1050", 26 ) );
        studentService.addStudent( new Student( "Santiago", "1020", 33 ) );

        try {
        studentService.enrollStudents( "Math01", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        }try {
        studentService.enrollStudents( "Math01", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        }try {
        studentService.enrollStudents( "Math", "1020");
        }catch (CourseNotFoundException | StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        }
//        studentService.showEnrolledStudents("Math");
        
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math_01");
        studentService.showEnrolledStudents("History");
    }//void main

}//Main
