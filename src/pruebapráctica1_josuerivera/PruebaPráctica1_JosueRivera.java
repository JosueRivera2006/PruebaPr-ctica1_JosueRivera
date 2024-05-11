package pruebapráctica1_josuerivera;
import java.util.Scanner;

public class PruebaPráctica1_JosueRivera {
    
    public static void Repetir() { //método para el Ejercicio de repetir mi nombre
        Scanner read = new Scanner(System.in); //el escaner a utilizar
        int repeticion;
        System.out.println("Cantidad de veces que se repetirá el texto: ");
        repeticion = read.nextInt();
        for (int i = 1; i <= repeticion; i++) { //ciclo for que ira repitiendo el mensaje hasta que i llegue a la cantidad de veces que el usuario indico
            System.out.println("¡Hola mi nombre es Josué Rivera y miren mi prueba!");
        }
        System.out.println(); //se imprime una linea para dejar un espacion entre la oracion y el menu principal
    }
    
    public static void SubmenúDeMensajes() { //método del submenu de mensajes
        Scanner read = new Scanner(System.in); //el escaner a utilizar
        int eleccion = 0; //es la variable que se usa como opcion
        while (eleccion != 3) {
            System.out.println("1. Bienvenida ");
            System.out.println("2. Despedida ");
            System.out.println("3. Salir del submenú ");
            eleccion = read.nextInt();
            switch (eleccion) {
                case 1 -> { //Mensaje de bienvenida
                    System.out.println("Bienvenido al Submenú, espero tenga un excelente día");
                }
                case 2 -> { //Mensajes de despedida
                    System.out.println("Hasta luego, gracias por usar mi programa");
                }
                case 3 -> { //Mensaje que hace saber al usuario que salio del submenu
                    System.out.println("Usted ha salido del Submenu");
                }
                default -> { //si el usuario eligio un numero que no esta dentro de las opciones, este mensaje se lo hara saber, y lo devolvera al submenu
                    System.out.println("Usted no ha ingresado una opción válida, lo devolveremos al Submenú principal. ");
                }
            }
        }
    }
    
    public static void MenuPrincipal() { //método para mostrar el Menu Principal
        Scanner read = new Scanner(System.in); //el escaner a utilizar
        int opcion = 1; //variable usada para que el usuario 
        int contador = 0; //variable utilizada para saber cuantas veces ingreso el usuario al menu principal
        while (opcion != 3) {
            contador++;
            System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes:");
            System.out.println("1. Repetir mi nombre.");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1 -> {
                    Repetir(); //llama al metodo Repetir
                }
                case 2 -> {
                    SubmenúDeMensajes(); //llama al metodo de submenu
                }
                case 3 -> {
                    System.out.println("Adiós, está fue mi prueba");
                    System.out.println("Cantidad de veces que se repitío el menú principal: " + contador); //este mensaje muestra las veces que se ingreso al menu principal
                }
                default -> { //caso en el que el usuario no haya elegido una opcion que este presente en el menu principal
                    System.out.println("Usted no ha ingresado ninguna opción válida, lo devolverémos al Menú Principal. ");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MenuPrincipal(); //llama al menu principal
    }
    
}
