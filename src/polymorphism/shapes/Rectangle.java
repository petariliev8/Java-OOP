package shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    Double calculatePerimeter() {
        Double perimeter = this.height*2+this.width*2;
        super.setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    Double calculateArea() {
        Double area = this.height*this.width;
        super.setPerimeter(area);
        return area;
    }
}
