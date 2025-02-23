public class Circle {

  private Double radius;
  private String color;
  private final Double PI = 3.14159;

  public Circle() {
    this.radius = 1.0;
    this.color = "white";
  }

  public Circle(Double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double cumputeArea() {
    return this.radius * this.radius * this.PI;
  }
}
