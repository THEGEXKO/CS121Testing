package Week6.testingAct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testTest {
    private test Bob = new test("Bob",56);
    @Test
    public void getName() {
        assertEquals("Bob",Bob.getName());
    }




    @Test
    public void checkContents() {
        assertFalse(Bob.checkContents);
    }
    @Test
    public void getContent() {
        assertEquals("",Bob.getContent());
    }
}