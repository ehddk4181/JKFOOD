package com.web.test.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Model model , Exception ex){
		return "/error";
	}
}
