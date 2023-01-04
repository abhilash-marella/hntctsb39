package com.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exceptions.MovieException;
import com.demo.models.MyErrorMessage;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieException.class)
	public ResponseEntity<MyErrorMessage> handleMovieException(MovieException me){
		return new ResponseEntity<>(
				new MyErrorMessage(me.getMessage(), me), 
				HttpStatus.OK
			);
	}
	
}
