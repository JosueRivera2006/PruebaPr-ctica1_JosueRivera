package pruebapráctica1_josuerivera;
import java.util.Scanner;

public class PruebaPráctica1_JosueRivera {
    
    public static void Repetir() {
        Scanner read = new Scanner(System.in);
        int repeticion;
        System.out.println("Cantidad de veces que se repetirá el texto: ");
        repeticion = read.nextInt();
        for (int i = 1; i <= repeticion; i++) {
            System.out.println("¡Hola mi nombre es Josué Rivera y miren mi prueba!");
        }
    }
    
    public static void MenuPrincipal() {
        Scanner read = new Scanner(System.in);
        int opcion = 1;
        int contador = 0;
        while (opcion != 3) {
            contador++;
            System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes:");
            System.out.println("1. Repetir mi nombre.");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1 -> {
                    Repetir();
                }
                case 2 -> {
                    
                }
                case 3 -> {
                    System.out.println("Adiós, está fue mi prueba");
                    System.out.println("Cantidad de veces que se repitío el menú principal: " + contador);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MenuPrincipal();
    }
    
}
