package shapes;

public class Circle extends Shape{
private Double radius;

public Circle(Double radius){
    this.radius = radius;
}

   final public Double getRadius() {
        return this.radius;
    }

    @Override
    Double calculatePerimeter() {
    Double perimeter = 3.14159265359*2*this.radius;
    super.setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    Double calculateArea() {
    Double area = 3.14159265359*(this.radius*this.radius);
    super.setArea(area);
        return area;
    }
}
