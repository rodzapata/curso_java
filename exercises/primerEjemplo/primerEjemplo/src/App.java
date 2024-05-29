import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- Instaciamos una persona -------");
        Scanner scan=new Scanner(System.in);
        System.out.print("Digite el nombre :");
        String nombre=scan.nextLine();
        System.out.println("El nomnbre introcucido es "+nombre);

        Persona per = new Persona("rodney","zapata",72209311,49);
        System.out.println(per.getName()+" "+per.getLastName());

        scan.close();
    }
}