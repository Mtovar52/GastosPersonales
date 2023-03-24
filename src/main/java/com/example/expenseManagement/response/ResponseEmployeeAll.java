package com.example.expenseManagement.response;

import com.example.expenseManagement.entities.Employee;

import java.util.List;

public class ResponseEmployeeAll {
    public String Title;
    public String Message;
    public int StatusCode;

    public List<Employee> Data;

    public ResponseEmployeeAll(String title, String message, int statusCode, List<Employee> data) {
        Title = title;
        Message = message;
        StatusCode = statusCode;
        Data = data;
    }
}
