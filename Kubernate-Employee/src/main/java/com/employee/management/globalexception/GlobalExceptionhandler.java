package com.employee.management.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(InValidEmployeeIDException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(InValidEmployeeIDException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}

}