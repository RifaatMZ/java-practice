import java.util.Arrays;
import java.util.Comparator;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        String[] colors = {"red", " yellow", "brown", "red", "black", " green", " white", "yellow"};
        colors = removeSpaces(colors);
        Arrays.sort(colors);
        colors = removeDuplicates(colors);
        Arrays.sort(colors, Comparator.reverseOrder());
        colors = addToFraze(colors, " is one of the most popular colors");

        for (String color : colors) {
            logger.info(color);
        }
    }

    static String[] removeSpaces(String[] arr) {
        int n = arr.length;
        String[] temp = new String[n];
        int j = 0;
        for (String i : arr) {
            i = i.replace("\s", "");
            temp[j] = i;
            j++;
        }
        return temp;
    }

    static String[] removeDuplicates(String[] arr) {
        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        return arr;
    }

    static String[] addToFraze(String[] arr, String fraze) {
        int n = arr.length;
        String[] temp = new String[n];
        int j = 0;
        for (String i : arr) {
            i = i + fraze;
            temp[j] = i;
            j++;
        }
        return temp;
    }
}