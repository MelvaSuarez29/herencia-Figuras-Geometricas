
import geometria.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura;
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("------------------ Sistema Figuras Geométricas ------------------");
            System.out.println("Seleccione una figura geométrica para obtener el área o perímetro");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Salir");
            System.out.print("Ingrese solo una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("El valor ingresado no es válido.");
                sc.next();
                continue;
            }

            switch (opcion) {

                case 1:
                    System.out.println("-------- Circulo --------");
                    System.out.print("Ingrese el radio: ");
                    double radio = sc.nextDouble();

                    figura = new Circulo(radio);
                    figura.imprimirDatos();
                    break;

                case 2:
                    System.out.println("-------- Rectangulo --------");
                    System.out.print("Ingrese la base: ");
                    double base = sc.nextDouble();

                    System.out.print("Ingrese la altura: ");
                    double altura = sc.nextDouble();

                    figura = new Rectangulo(base, altura);
                    figura.imprimirDatos();
                    break;

                case 3:
                    System.out.println("-------- Triangulo --------");
                    System.out.print("Ingrese el primer lado: ");
                    double l1 = sc.nextDouble();

                    System.out.print("Ingrese el segundo lado: ");
                    double l2 = sc.nextDouble();

                    System.out.print("Ingrese el tercer lado: ");
                    double l3 = sc.nextDouble();

                    figura = new Triangulo(l1, l2, l3);
                    figura.imprimirDatos();
                    break;

                case 4:
                    System.out.println("-------- Cuadrado --------");
                    System.out.print("Ingrese un lado: ");
                    double lado = sc.nextDouble();

                    figura = new Cuadrado(lado);
                    figura.imprimirDatos();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("El valor ingresado no es válido. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);
        System.out.println("Acaba de salir del sistema Muchas gracias");

        sc.close();
    }
}
