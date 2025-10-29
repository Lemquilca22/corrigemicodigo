import java.util.Scanner;

public class backupmain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        boolean salir = true;
        String rpta;
        do {
            //Escoger un auto y decidir si comprarlo o no con "do y while"
            System.out.println("bienvenido al concesionario toyota");//bienvenido al concecionario toyota
            System.out.println("a continuacion se muestra los modelos disponibles, selecciona uno");//a continuacion se muestra los modelos disponibles
            System.out.println("1) hilux; 2)corolla; 3)yaris");//1) hilux; 2)corolla; 3)yaris
            int modelo = sc.nextInt();

            sc.nextLine();
            switch (modelo) {
                case 1:
                    System.out.println("30,000$");//precio del auto
                    System.out.println("deseas comprar? (si/no)");//deseas comprar?
                    rpta = sc.nextLine();//(si/no)
                    if (rpta.equals("si")) {
                        salir = false;
                }
                    break;
                case 2:
                    System.out.println("20,000$");//precio del auto
                    System.out.println("deseas comprar? (si/no)");//deseas comprar?
                    rpta = sc.nextLine();//(si/no)
                    if (rpta.equals("si")) {
                        salir = false;
                    }

                    break;
                case 3:
                    System.out.println("15,000$");//precio del auto
                    System.out.println("deseas comprar? (si/no)");//deseas comprar?
                    rpta = sc.nextLine();//(si/no)
                    if (rpta.equals("si")) {
                        salir = false;
                    }

                    break;
            }
        }while (salir);
        System.out.println("gracias por su compra");
    }
}
