package application;

import java.util.Scanner;

import util.Conversor;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe a cotação do dolar: ");
		double qtdDolar = sc.nextDouble();
		
		System.out.println("Informe qauntos dolares quer comprar: ");
		double cotacao = sc.nextDouble();
		
		double cota = Conversor.converter(cotacao, qtdDolar);
		
		System.out.println(cota);
		
		
		
		
		sc.close();

	}

}
