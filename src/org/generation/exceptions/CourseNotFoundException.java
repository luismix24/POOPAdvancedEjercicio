package org.generation.exceptions;

public class CourseNotFoundException extends Exception {
	public CourseNotFoundException(String messae){
        super("course not found!!");
    }//constructor

}
