import java.util.Scanner;

public class Corregido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean salir = true;
        String ruta;

        do {
            System.out.println("Bienvenido!");
            System.out.println("Escoge una opcion: ");
            System.out.println("1: Pelota / 2: Zapatos / 3: Chaqueta");
            int a = sc.nextInt();

            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("30$");
                    System.out.println("Deseas comprar? ");
                    ruta = sc.nextLine();//(si/no)
                    if (ruta.equals("si")) {
                        salir = false;
                    }
                    break;

                case 2:
                    System.out.println("60$");
                    System.out.println("Deseas comprar? ");
                    ruta = sc.nextLine();//(si/no)
                    if (ruta.equals("si")) {
                        salir = false;
                    }
                    break;
                case 3:
                    System.out.println("80$");
                    System.out.println("Deseas comprar? ");
                    ruta = sc.nextLine();//(si/no)
                    if (ruta.equals("si")) {
                        salir = false;
                    }
                    break;
            }
        } while (salir);
        System.out.println("Gracias por comprar!");
    }
}
