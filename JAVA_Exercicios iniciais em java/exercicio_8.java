package Exercicios;
/*
8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
*/
import java.util.Scanner;
public class exercicio_8 {
	public static void main(String[] args) {
		double custof, custoc, pd, i;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o custo de f�brica do veic�lo?: ");
		custof= ler.nextInt();
		
		pd = (custof * 28) / 100;
		i = (custof * 45) / 100;
		custoc = custof + pd + i;
		
		System.out.printf("\nO custo �o consumidor � de: %.2f" , custoc);


	}

}
