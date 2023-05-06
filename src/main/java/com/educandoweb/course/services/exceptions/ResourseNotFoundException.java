package com.educandoweb.course.services.exceptions;

public class ResourseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}
