package entities;

public class Rectangle {

    public double width;
    public double height;

    // area = base x altura
    public double area() {
        return width * height;
    }

    //perimetro = soma de todos os lados --> P = 2x (base + altura)
    public double perimeter() {
        return 2 * (width + height);
    }

    // diagonal = base² + altura² ou d = raiz de b² + a²
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
