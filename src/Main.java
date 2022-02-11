import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Rectangulo[] listaRectangulos = buildRectangulosList();
        showLists(listaRectangulos);
    }

    private static Rectangulo[] buildRectangulosList() {
        Rectangulo[] listaRectangulos = new Rectangulo[8];
        Random rectangulo = new Random();
        for (int i = 0; i < listaRectangulos.length ; i++) {
            int width = rectangulo.nextInt(15) + 1;
            int heigth = rectangulo.nextInt(15) + 1;
            String color = rectangulo.toString();
            int area = rectangulo.nextInt();
            listaRectangulos[i] = new Rectangulo(heigth, width, color, area);
        }
        return listaRectangulos;

    }
    private static String showLists(Rectangulo[] listaRectangulos){
        for (int i = 0; i < listaRectangulos.length; i++) {
            System.out.println("\n Rectangulo " + (i + 1)+ "  ");
            System.out.println("Base: " + listaRectangulos[i].getWidth());
            System.out.println("Altura: " + listaRectangulos[i].getHeigth());
            System.out.println("Color: " + listaRectangulos[i].getColor());
            System.out.println("Area: " + listaRectangulos[i].getAreaDeRectangulo());
        }
        return String.valueOf(listaRectangulos);
    }

}
