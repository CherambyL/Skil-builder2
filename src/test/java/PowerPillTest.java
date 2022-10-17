import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

class PowerPillTest {
    private static Random rand;
    private static String[] color = {"Blue", "Red", "Pink", "Purple", "Green"};

    @BeforeAll
    static void beforeAll() {
        rand = new Random();
    }

    @Test
    @DisplayName("[1] test getName")
    void getName() {
        for(int index = 0; index < color.length; index++) {
            String expected = color[index];
            PowerPill aPill = new PowerPill(expected);
            String actual = aPill.getName();
            assertEquals(expected,actual,"Expected " + expected + " got "+ actual);
        }

        // test non-default constructor
        for(int index = 0; index < color.length; index++) {
            String expected = color[index];
            PowerPill aPill = new PowerPill(expected,20);
            String actual = aPill.getName();
            assertEquals(expected,actual,"Expected " + expected + " got "+ actual);
        }
    }

    @Test
    @DisplayName("[1] test getPower")
    void getPower() {
        for(int index = 0; index < 3; index++) {
            int expected = rand.nextInt();
            PowerPill aPill = new PowerPill(color[index],expected);
            int actual = aPill.getPower();
            assertEquals(expected,actual,"Expected " + expected + " got "+ actual);
        }
    }

    @Test
    @DisplayName("[1] test setPower")
    void setPower() {
        for(int index = 0; index < 3; index++) {
            int expected = rand.nextInt();
            PowerPill aPill = new PowerPill(color[index]);
            aPill.setPower(expected);
            int actual = aPill.getPower();
            assertEquals(expected,actual,"Expected " + expected + " got "+ actual);
        }
    }

    @Test
    @DisplayName("[1] test setName")
    void setName() {
        for(int index = 0; index < color.length; index++) {
            String expected = color[index];
            PowerPill aPill = new PowerPill("");
            aPill.setName(expected);
            String actual = aPill.getName();
            assertEquals(expected,actual,"Expected " + expected + " got "+ actual);
        }
    }
}