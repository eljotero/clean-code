package pl.zzpj.solid.lsp.shape;

public class Square extends GeometricShape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
