package Triangles;

import junit.framework.TestCase;

public class Triangle_TestTest extends TestCase {
    private final Triangle C_Test = new Triangle(4,5,6);
    public void testMain() {
         assertEquals(C_Test.is_equilateral());
    }

    private void assertEquals(boolean equilateral) {

    }
}