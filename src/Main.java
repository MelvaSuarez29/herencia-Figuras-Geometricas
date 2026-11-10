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

                    double radio;

                    do {
                        System.out.print("Ingrese el radio: ");
                        radio = sc.nextDouble();
                    } while (!validarDatos(radio));

                    System.out.print("Ingrese el color: ");
                    String colorC = sc.next();

                    figura = new Circulo(radio, colorC);
                    figura.imprimirDatos();
                    break;

                case 2:
                    System.out.println("-------- Rectangulo --------");

                    double base;
                    double altura;

                    do {
                        System.out.print("Ingrese la base: ");
                        base = sc.nextDouble();
                    } while (!validarDatos(base));

                    do {
                        System.out.print("Ingrese la altura: ");
                        altura = sc.nextDouble();
                    } while (!validarDatos(altura));

                    System.out.print("Ingrese el color: ");
                    String colorRectangulo = sc.next();

                    figura = new Rectangulo(base, altura);
                    figura.imprimirDatos();
                    break;

                case 3:
                    System.out.println("-------- Triangulo --------");

                    double l1, l2, l3;

                    do {
                        System.out.print("Ingrese el primer lado: ");
                        l1 = sc.nextDouble();

                        System.out.print("Ingrese el segundo lado: ");
                        l2 = sc.nextDouble();

                        System.out.print("Ingrese el tercer lado: ");
                        l3 = sc.nextDouble();

                        if (!validarDatos(l1) || !validarDatos(l2) || !validarDatos(l3)) {
                            continue;
                        }

                        if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
                            System.out.println("Los lados no forman un triangulo valido.");
                        } else {
                            break;
                        }

                    } while (true);

                    System.out.print("Ingrese el color: ");
                    String colorTriangulo = sc.next();

                    figura = new Triangulo(l1, l2, l3);
                    figura.imprimirDatos();
                    break;

                case 4:
                    System.out.println("-------- Cuadrado --------");

                    double lado;

                    do {
                        System.out.print("Ingrese un lado: ");
                        lado = sc.nextDouble();
                    } while (!validarDatos(lado));

                    System.out.print("Ingrese el color: ");
                    String colorCuadrado = sc.next();

                    figura = new Cuadrado(colorCuadrado, lado);
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

        System.out.println("Acaba de salir del sistema. Muchas gracias.");

        sc.close();
    }
    public static boolean validarDatos(double dato) {
        if (dato <= 0) {
            System.out.println("Error: El valor debe ser mayor que cero.");
            return false;
        }
        return true;
    }

}