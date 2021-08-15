package com.pereira.leet.august;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveBoxesTest {

    @Test
    @DisplayName("Default Test success")
    void testRemoveBoxes() {
        int[] boxes = {1,3,2,2,2,3,4,3,1};
        RemoveBoxes removeBoxes = new RemoveBoxes();
        int solution = removeBoxes.removeBoxes(boxes);
        assertEquals(23, solution);
    }

    @Test
    @DisplayName("Simple Test success")
    void testRemoveSimpleBoxes() {
        int[] boxes = {1,1,1};
        RemoveBoxes removeBoxes = new RemoveBoxes();
        int solution = removeBoxes.removeBoxes(boxes);
        assertEquals(9, solution);
    }

    @Test
    @DisplayName("Single Test success")
    void testRemoveSingleBox() {
        int[] boxes = {1};
        RemoveBoxes removeBoxes = new RemoveBoxes();
        int solution = removeBoxes.removeBoxes(boxes);
        assertEquals(1, solution);
    }

}