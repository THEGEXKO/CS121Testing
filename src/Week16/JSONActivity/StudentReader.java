package Week16.JSONActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();

            BufferedReader read = new BufferedReader(new FileReader("student.json"));

            Student student = gson.fromJson(read,Student.class);

            System.out.println("**** Student Details ****");
            System.out.printf("Student name: %s\n Student id: %d\nStudent Class: %s", student.getName(), student.getId(),student.getClas());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
