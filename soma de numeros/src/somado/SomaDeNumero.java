package somado;

import java.util.Scanner;

public class SomaDeNumero {

	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
		    
		    int n1,n2;
		    double soma;
		    System.out.println("digite o primeiro numero: ");
            n1 = sc.nextInt();
            System.out.println("digite o segundo numero: ");
            n2 = sc.nextInt();
            
            soma = n1+n2;
            
            System.out.println("A SOMA DOS NUMEROS FOI : " + soma);
            
            
	}

}
