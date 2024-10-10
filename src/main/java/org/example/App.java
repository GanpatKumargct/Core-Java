package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class App 
{
    public static void main( String[] args ) throws JsonProcessingException {

        Student student = new Student();
        student.setName("Narayan");
        student.setCity("Dharavi");
        student.setCourse("JAVA - Core");

        System.out.println(student);

        System.out.println("------JSON Object Mapper------");
        ObjectMapper objectMapper = new ObjectMapper();
        Object obj = objectMapper.writeValueAsString(student);
        System.out.println(obj);



    }
}
