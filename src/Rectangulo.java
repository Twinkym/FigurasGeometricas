import java.util.Objects;

public class Rectangulo {
    private int heigth;
    private int width;
    private String color;
    private int areaDeRectangulo;
    private int area;

    private int calcularArea() {
        int area = heigth * width;
        return area;
      }




    public Rectangulo(int heigth, int width, String color, int area) {
        this.width = width;
        this.heigth = heigth;
        this.color = color;
        this.area = area;
    }

    public int getAreaDeRectangulo() {
        return areaDeRectangulo;
    }

    public void setAreaDeRectangulo(int areaDeRectangulo) {
        this.areaDeRectangulo = areaDeRectangulo;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangulo " +
                "heigth= " + heigth + '\n' +
                ", weigth= " + width + '\n' +
                ", color=' " + color + '\n' +
                ", Area= " + areaDeRectangulo + '\n'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangulo that = (Rectangulo) o;

        if (heigth != that.heigth) return false;
        if (width != that.width) return false;
        return Objects.equals(color, that.color);
    }

//    @Override
//    public int hashCode() {
//        int result = heigth;
//        result = 31 * result + weigth;
//        result = 31 * result + (color != null ? color.hashCode() : 0);
//        return result;
//    }
}
