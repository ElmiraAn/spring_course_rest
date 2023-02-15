package com.elmiraantipina.spring.rest.exception_handling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//отмечается класс, предоставляющий функциональность GlobalExceptionHandler-а
public class EmployeeGlobalExceptionHandler {


    @ExceptionHandler//отмечается метод, ответственный за обработку исключений
    //ResponseEntity - обертка Http response
    //EmployeeIncorrectData - тип объекта, который добавляется в HTTP response body
    //NoSuchEmployeeException - Exception, на который должен реагировать данный метод
    //NOT_FOUND - StatusCode для HTTP response
    //исключение, если работника с таким id не существует
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException exception){
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler
    //исключение, если неправильный формат id,например api/employees/abc
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception exception){
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
