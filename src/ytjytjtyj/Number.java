package ytjytjtyj;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Informe quantos numeros serão usados: ");
		int qtsNum = sc.nextInt();
		int soma=0;
		for (int i=1; i<=qtsNum; i++) {
			System.out.println("Valor#: "+ i );
			int x=sc.nextInt();
			soma+=x;
		}
		System.out.println("Soma: "+ soma);

	}

}
