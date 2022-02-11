import java.util.Objects;

public class Circulo {
    private int r;
    private String color;

    public Circulo(int r, String color) {
        this.r = r;
        this.color = color;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo " +
                "r= " + r +
                ", color=' " + color + '\n'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circulo circulo = (Circulo) o;

        if (r != circulo.r) return false;
        return Objects.equals(color, circulo.color);
    }

//    @Override
//    public int hashCode() {
//        int result = r;
//        result = 31 * result + (color != null ? color.hashCode() : 0);
//        return result;
//    }
}
