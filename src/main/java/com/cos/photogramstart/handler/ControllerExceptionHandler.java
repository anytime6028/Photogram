package com.cos.photogramstart.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.photogramstart.util.Script;
import com.cos.photogramstart.web.dto.CMrespDto;

@ControllerAdvice //모든 controller에 대해 응답
@RestController // data  reuturn 할거라서
public class ControllerExceptionHandler {

	@ExceptionHandler(CustomValidationException.class)
	public String validationException(CustomValidationException e)
	{
		// script return과 CMrespDto return 장단점 생각해보기 (상황에 맞게?)
		return Script.back(e.getErrorMap().toString());
	}
}
