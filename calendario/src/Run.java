import java.util.Scanner;

public class Run {
    public static void main(String[] argv){
        Calendario calendario = Calendario.getIstance();
        boolean fine = false;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("In che anno siamo (0 esci): ");
                int n = scan.nextInt();
                if (n != 0) {
                    calendario.setAnno(n);
                    System.out.print("Giorno cercato (0 esci): ");
                    n = scan.nextInt();
                    if (n != 0)
                        calendario.giornoAnno(n);
                    else {
                        fine = true;
                    }
                }
                else {
                    fine = true;
                }
            } catch (Exception e){
                System.out.println("Devi inserire un numero");
            }
        } while (!fine);
        System.out.println("FINE");
    }
}

