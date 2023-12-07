package Week8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Car2Test {
    private Car2 Honda;
    private Car2 Ford;


    @BeforeEach
    public void setUp(){
        //Create an instance of Class
        //Honda is the object
        Car2 Honda2 = new Car2();
        Honda = new Car2("Honda","Civic",2023,12000);
        Ford = new Car2("Ford","Mustang",1990,500);
    }
    @Test
    public void testInstanceCount(){
        assertEquals(2,Car2.total());
    }
}