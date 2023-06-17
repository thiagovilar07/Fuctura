package aula1;

public class Aula {

	public static void main(String[] args) {
		// Primeiro "Olá Mundo"
		
		//System.out.println("Hello World! - Olá Mundo!");
		//System.out.println("Estou na Fuctura.");
		
		// Primeira atividade usando alguns tipos primitivos.
		
		//String nome = "Thiago Vilar";
		//int idade = 19;
		//double peso = 50.5;
		//System.out.println(nome);
		//System.out.println(idade);
		//System.out.println(peso);
		
		// [1] Prática - java
		//versão 1 + resto de divisão
		String nome = "Exercicio 1";
		int numero1 = 15;
		int numero2 = 19;
		int soma = numero1 + numero2;
		int sub = numero1 - numero2;
		int mult = numero1 * numero2;
		int resto = numero1 % numero2;
		System.out.println(nome);
		System.out.println("A soma de " + numero1 + " e " + numero2 + " é = " + soma);
		System.out.println("A subtração de " + numero1 + " e " + numero2 + " é = " + sub);
		System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é = " + mult);
		System.out.println("O resto da divisão de " + numero1 + " e " + numero2 + " é = " + resto);
		
		//versão 2
		System.out.println();
		System.out.println(nome + "\n" + (numero1 + numero2) + "\n" + (numero1 - numero2) + "\n" + (numero1 * numero2));
		
		//versão 3
		System.out.println();
		System.out.println(nome);
		System.out.println("A soma entre " + numero1 + " e " + numero2 + " é = " + (numero1 + numero2));
		System.out.println("A subtração entre " + numero1 + " e " + numero2 + " é = " + (numero1 - numero2));
		System.out.println("A multiplicação entre" + numero1 + " e " + numero2 + " é = " + (numero1 * numero2));
		
	}

}
