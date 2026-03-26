import java.util.Random;

public class MyClass {
    public static void main(String args[]) {
        Random random = new Random();
        int cantidad = 500;
        int sumaTotal = 0;
        int min = 10;
        int max = 1000;

       
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            sumaTotal += numeroAleatorio;
        }

        double promedio = (double) sumaTotal / cantidad;

      
        System.out.println("--- Resultados de la Tarea ---");
        System.out.println("Cantidad de números generados: " + cantidad);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Promedio: " + promedio);
    }
}
