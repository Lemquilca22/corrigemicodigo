import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        String rpta;

        do {

            System.out.println("");
            System.out.println("");
            system.out.println("5) ; 7); 1)")//info previa a edidión
            Int a = sc.nextInt{};

            sc.nextLine();
            switch (a) {

                case 1://patron de casos multielección
                    System.out.println("");
                    System.out.print("");
                    rpta = sc.nextLine();
                    if (rpta.equalsIgnoreCase("")) {
                        salir = true;
                    }
                    break;

                case 2:
                    System.out.println("");
                    System.out.print("");
                    rpta = sc.nextLine();
                    if (rpta.equalsIgnoreCase("")) {
                        salir = false;
                    }
                    break;

            }

            break;

            case 3:
                System.out.println("");
                System.out.println("");
                Rpta = sc.nextLine()
                if (rpta.equalsIgnoreCase(""))
                    salir = false
        }
        break;

    } while (!salir);

        System.out.println("");
        sc.close();
}
}