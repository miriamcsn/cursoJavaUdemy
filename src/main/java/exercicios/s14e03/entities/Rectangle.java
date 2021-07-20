package exercicios.s14e03.entities;

import exercicios.s14e03.entities.enums.Color;

public class Rectangle extends Shape {
    // subclasses que herdam de classes abstratas são obrigadas
    // a sobrescrever os métodos criados na superclasse

    private Double width, height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }

}
