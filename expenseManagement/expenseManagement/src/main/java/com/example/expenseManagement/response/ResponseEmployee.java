package com.example.expenseManagement.response;

import com.example.expenseManagement.entities.Employee;

public class ResponseEmployee {

    public String Title;
    public String Message;
    public int StatusCode;
    public Employee Data;

    public ResponseEmployee(String title, String message, int statusCode, Employee data) {
        Title = title;
        Message = message;
        StatusCode = statusCode;
        Data = data;
    }
}
