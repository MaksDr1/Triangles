package Triangles;

public class Triangle {
    private int side1,side2,side3;

    public Triangle(int s1,int s2,int s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // Method to test for a right-angled triangle.
    public boolean is_right(){
        if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
                ((side2*side2) == ((side1*side1) + (side3*side3))) ||
                ((side3*side3) == ((side1*side1) + (side2*side2))))
            return true;
        else
            return false;
    }
    // Method to test for a scalene triangle.
    public boolean is_scalene () {
        if ((side1 != side2) && (side1 != side3) && (side2 != side3))
            return true;
        else
            return false;
    }

    // Method to test for an isosceles triangle.
    public boolean is_isosceles () {
        if (((side1 == side2) && (side1 != side3)) ||
                ((side1 == side3) && (side1 != side2)) ||
                ((side2 == side3) && (side2 != side1)))
            return true;
        else
            return false;
    }

    // Method to test for an equilateral triangle.
    public boolean is_equilateral () {
        if ((side1 == side2) && (side1 == side3))
            return true;
        else
            return false;
    }
}
