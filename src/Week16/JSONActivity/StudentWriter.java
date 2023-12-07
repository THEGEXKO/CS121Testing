package Week16.JSONActivity;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student dent = new Student("Jon",3434,"English");
            Gson gson = new Gson();

            String jsonString = gson.toJson(dent);

            FileWriter filewriter = new FileWriter("student.json");
            filewriter.write(jsonString);
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
