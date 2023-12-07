package ClassACtivity;

import java.time.Year;

public class Class1 {
    String Make, Model;
    int year;

    Class1(String make, String model, int year) {
        this.Make = make;
        this.Model = model;
        this.year = year;
    }

    public void setMake(String make) {
        this.Make = Make;
    }

    public void setModel(String model) {
        this.Model = Model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //public void
    public void DisplayInfo() {
        System.out.printf("The car is a %s made by %s in the year %d\n", Model, Make, year);
    }
}
