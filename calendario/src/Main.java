import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        Calendario calendario = Calendario.getIstance();
        int n;
        do {
            System.out.print("In che anno siamo (0 esci): ");
            n = scan.nextInt();
            if (n != 0) {
                calendario.setAnno(n);
                System.out.print("Giorno cercato (0 esci): ");
                n = scan.nextInt();
                if (n != 0)
                    calendario.giornoAnno(n);
            }
        } while (n != 0);
    }
}
