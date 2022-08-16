import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testRemoveSpaces() {
        String[] colors = {"red", " yellow", "brown ", " red"};
        String[] actualArray = Main.removeSpaces(colors);
        String[] expectedArray = {"red", "yellow", "brown", "red"};
        assertArrayEquals(actualArray, expectedArray);
    }
    @Test
    public void testRemoveDuplicates() {
        String[] colors = {"red", "yellow", "black", "red", "red"};
        String[] actualArray = Main.removeDuplicates(colors);
        String[] expectedArray = {"red", "yellow", "black"};
        assertArrayEquals(actualArray, expectedArray);
    }
    @Test
    public void testAddToFraze() {
        String[] names = {"Albert", "Adam"};
        String[] actualArray = Main.addToFraze(names, ", Hello!");
        String[] expectedArray = {"Albert, Hello!", "Adam, Hello!"};
        assertArrayEquals(actualArray, expectedArray);
    }
}
