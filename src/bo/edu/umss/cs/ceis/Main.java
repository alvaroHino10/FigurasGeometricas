package bo.edu.umss.cs.ceis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        while (true) {

            System.out.println("Ingrese 1 si quiere calcular el area de un rectangulo, ingrese 2 si quiere calcular el area de un cuadrado e ingrese 3 si quiere calcular el area de un Circulo");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese la altura (ejm: 5.0)");
                    String alt = scanner1.nextLine();
                    double altura = Double.parseDouble(alt);
                    System.out.println("Ingrese la base (ejm: 4.0)");
                    String bas = scanner1.nextLine();
                    double base = Double.parseDouble(bas);
                    Figura rect = new Rectangulo(base, altura);
                    System.out.println(rect.area());
                    break;
                }

                case 2: {
                    System.out.println("Ingrese el lado del cuadrado (ejm: 3.0)");
                    String lado = scanner1.nextLine();
                    double lad = Double.parseDouble(lado);
                    Figura cuadrado = new Cuadrado(lad);
                    System.out.println(cuadrado.area());
                    break;
                }

                case 3: {
                    System.out.println("Ingrese el radio del circulo");
                    String radio = scanner1.nextLine();
                    double rad = Double.parseDouble(radio);
                    Figura circulo = new Circulo(rad);
                    System.out.println(circulo.area());
                }

            }
        }
    }
}
