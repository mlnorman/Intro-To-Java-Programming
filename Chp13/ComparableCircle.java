public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
  private double radius;
  public ComparableCircle() {
    super();
  }

  public ComparableCircle(double radius) {
    super(radius);
  }

  //Construct a circle with specified radius, filled, and color
  public ComparableCircle(double radius, String color, boolean filled) {
    super(radius, color, filled);
  }

  public int compareTo(ComparableCircle cc) {
    if (this.getArea() > cc.getArea()) {
      return 1;
    } else if (this.getArea() < cc.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }

}
