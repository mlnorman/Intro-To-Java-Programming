// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject implements Comparable<GeometricObject> {
  private String color = "white";
  private boolean filled;

  /**Default construct*/
  protected GeometricObject() {
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public int compareTo(GeometricObject obj) {
    if (this.getArea() > obj.getArea()) {
      return 1;
    }
    else if(this.getArea() < obj.getArea()) {
      return -1;
    }
    else {
      return 0;
    }
  }

  /**Getter method for color*/
  public String getColor() {
    return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
    int compare = obj1.compareTo(obj2);
    if (compare == 1) {
      return obj1;
    } else if (compare == -1) {
      return obj2;
    } else {
      return obj1;
    }

  }

  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();
}
