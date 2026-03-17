package pratica1completa;
import java.util.Scanner;
//
public class maintriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        double c1, c2;

        System.out.print("Digite o valor do primeiro cateto: ");
        c1 = entrada.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        c2 = entrada.nextDouble();

        TrianguloRetangulo t = new TrianguloRetangulo();

        t.setC1(c1);
        t.setC2(c2);

        System.out.println("Hipotenusa: " + t.calcularHipotenusa());
        System.out.println("Area: " + t.calcularArea());

	}

}
