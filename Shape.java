import java.util.Objects;

public abstract class Shape {
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void draw();
}
