import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double altura = 0;
        double media = 0;
        int numero;
        Scanner s = new Scanner(System.in);
        for (numero=0; numero<3; numero++) {
            System.out.println("Digite a altura");
            altura = s.nextDouble();
            media += altura / 3;
        }
        System.out.println("A média das alturas é " +media);
    }
}