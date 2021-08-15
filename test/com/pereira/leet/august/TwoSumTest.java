package com.pereira.leet.august;

import com.pereira.leet.august.TwoSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    @DisplayName("Test success")
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] myArray = {2, 7, 11, 15};
        int[] solution = twoSum.twoSum(myArray, 9);
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution);
    }

    @Test
    @DisplayName("Edge case success")
    void testTwoSumEdgeCase() {
        TwoSum twoSum = new TwoSum();
        int[] myArray = {2, 7, 11, 15};
        int[] solution = twoSum.twoSum(myArray, 17);
        int[] expected = {0, 3};
        assertArrayEquals(expected, solution);
    }

    @Test
    @DisplayName("Nothing found")
    void testTwoSumNothingFoundø() {
        TwoSum twoSum = new TwoSum();
        int[] myArray = {2, 7, 11, 15};
        int[] solution = twoSum.twoSum(myArray, 19);
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution);
    }
}