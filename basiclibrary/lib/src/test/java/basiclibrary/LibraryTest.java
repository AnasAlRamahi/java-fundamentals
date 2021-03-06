/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;


import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest {
//    @Test public void testSomeLibraryMethod() {
//        Library classUnderTest = new Library();
//        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
//    }

    Library lib = new Library();

    @Test
    public void analyzingWeatherData() {
        int[][] exampleArr = {
                {10, 11, 13},
                {14, 16, 17},
                {18, 19, 20}
        };
        String expectedResult = "Never saw the temperature: 12\nNever saw the temperature: 15\n";
        System.out.println(exampleArr);
        assertEquals("This array should find the min and max of the temparature and return the temperatures that are not registered for any day", expectedResult,
                lib.analyzingWeatherData(exampleArr)
        );
    }

        @Test
    public void tally(){
        List<String> votes = new ArrayList<String>();
        votes.add("Anas");
        votes.add("Anas");
        votes.add("Anas");
        votes.add("Saify");
        votes.add("Saify");
        votes.add("Saify");
        votes.add("Anas");
        votes.add("Saify");
        votes.add("Anas");
        String expectedString = "Anas";
        assertEquals("This method accepts a List of Strings representing votes and returns one string to show what got the most votes: ", expectedString,
                lib.tally(votes));
    }

//    @Test public void tally() {
//        Library classUnderTest = new Library();
//        assertEquals("", , );
//    }

}
