package org.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {
	
	private HashMap<String, Course> courseList;
    private HashMap<String, Student> students;
    private HashMap<String, List<Course>> coursesEnrolledByStudents;


	    public StudentService(){
	    	courseList = new HashMap<>();
	    	students = new HashMap<>();
	    	coursesEnrolledByStudents = new HashMap<>();
	    	
	        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
	        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
	        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
	        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
	        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
	    }//StudentService

	    public void enrollStudents( String courseName, String studentID ){
	        Course course = courseList.get( courseName );

	        if ( !coursesEnrolledByStudents.containsKey( studentID ) ){
	            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
	        }
	        coursesEnrolledByStudents.get( studentID ).add( course );
	    }

	    public void unEnrollStudents( String courseName, String studentID ){
	        Course course = courseList.get( courseName );

	        if ( coursesEnrolledByStudents.containsKey( studentID ) ){
	            coursesEnrolledByStudents.get( studentID ).remove( course );
	        }
	    }

	    public void showEnrolledStudents(String courseId){
	    	Course course = courseList.get(courseId);
	    	if(course!=null) {
	    		System.out.println("Nombre del curso: " + course);
	    	} else {
	    		System.out.println("Student Not Found"+ courseId);
	    	}	    }

	    public void showAllCourses(){
	        //TODO implement using collections loops
	    }

}// class StudenService
