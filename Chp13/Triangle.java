
public class Triangle extends GeometricObject {
    private double mSide1;
    private double mSide2;
    private double mSide3;
    
    public Triangle() {
        super("Yellow", false);
        mSide1 = 1;
        mSide2 = 1;
        mSide3 = 1;
    }

    public Triangle(double s1, double s2, double s3, String color, boolean filled) 
                                        throws IllegalTriangleException {
                                            
        super(color, filled);
        if (s1 + s2 < s3 || s2 + s3 < s1 || s1 + s3 < s2) {
            throw new IllegalTriangleException("Any two sides added together" + 
                " must be greater than the remaining side.  NO side may equal 0!");
        }
        mSide1 = s1;
        mSide2 = s2;
        mSide3 = s3;
    }
    
    public double getSideOne() {
        return mSide1;
    }
    
    public double getSideTwo() {
        return mSide3;
    }
    
    public double getSideThree() {
        return mSide3;
    }
    
    public double getArea() {
        double perimeter = mSide1 + mSide2 + mSide3;
        return Math.sqrt(perimeter * (
                                            (perimeter - mSide1) * 
                                            (perimeter - mSide2) * 
                                            (perimeter - mSide3)));
    }
    
    public double getPerimeter() {
        return (mSide1 + mSide2 + mSide3);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + mSide1 + " side2 = " + mSide2 +
               " side3 = " + mSide3;
    }
    
}