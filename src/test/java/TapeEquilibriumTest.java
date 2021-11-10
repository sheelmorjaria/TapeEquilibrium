import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {
    @Test
    void testSolution() {
        assertEquals(0, (new TapeEquilibrium()).solution(new int[]{1, 1, 1, 1}));
    }
    void testSolution2() {
        assertEquals(1, (new TapeEquilibrium()).solution(new int[]{3, 1, 2, 4, 3}));
    }
    void testSolution3() {
        assertEquals(0, (new TapeEquilibrium()).solution(new int[]{-1000, 1000}));
    }
}

