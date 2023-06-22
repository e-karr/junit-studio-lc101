package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    int[] sortedNumbers;
    @Before
    public void createNumbersArray() {
        sortedNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    public void findNumberAtEndOfArray() {
        int numberToFind = 10;
        int expectedIndex = 9;
        assertEquals(expectedIndex, BonusBinarySearch.binarySearch(sortedNumbers, numberToFind));
    }

    @Test
    public void findNumberAtBeginningOfArray() {
        int numberToFind = 1;
        int expectedIndex = 0;
        assertEquals(expectedIndex, BonusBinarySearch.binarySearch(sortedNumbers, numberToFind));
    }

    @Test
    public void findNumberRightHalfOfArray() {
        int numberToFind = 7;
        int expectedIndex = 6;
        assertEquals(expectedIndex, BonusBinarySearch.binarySearch(sortedNumbers, numberToFind));
    }

    @Test
    public void findNumberLeftHalfOfArray() {
        int numberToFind = 3;
        int expectedIndex = 2;
        assertEquals(expectedIndex, BonusBinarySearch.binarySearch(sortedNumbers, numberToFind));
    }

    @Test
    public void searchNumberNotInArray() {
        int numberToFind = 11;
        int expectedIndex = -1;
        assertEquals(expectedIndex, BonusBinarySearch.binarySearch(sortedNumbers, numberToFind));
    }

}
