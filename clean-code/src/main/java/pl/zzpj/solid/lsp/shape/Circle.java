package pl.zzpj.solid.lsp.shape;

public class Circle extends GeometricShape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
