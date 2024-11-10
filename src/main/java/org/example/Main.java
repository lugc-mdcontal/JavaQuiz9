package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();

        try (FileReader reader = new FileReader("src/main/resources/employees.json")) {
            EmployeeList employeeList = gson.fromJson(reader, EmployeeList.class);

            for (Employee employee : employeeList.getEmployees()) {
                System.out.println(employee.getPreferredFullName());
            }
        } catch (IOException | JsonIOException e) {
            e.printStackTrace();
        }
    }
}