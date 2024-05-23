package com.example.tpo.task1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TangentDecomposeTest {

    private static final int DEF_LENGTH = 7;
    private static double inputTest;
    private static double expectedTest;

    public TangentDecomposeTest(
            Double input,
            Double expected) {
        TangentDecomposeTest.inputTest = input;
        TangentDecomposeTest.expectedTest = expected;
    }

    @Parameterized.Parameters(name = "Sin Test - {0} equals {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0.00, 0.00 },
                { Math.PI / 4, 1d },
                { Math.PI / 2, Double.NaN },
                { 22.3, Math.tan(22.3) },
                {100d, -0.587128d},
                {-323d, 0.66096d}
        });
    }

    @Test
    public void testEquals() {
        assertEquals(expectedTest, TangentDecompose.tan_decompose(inputTest, DEF_LENGTH), 0.01);
    }
}