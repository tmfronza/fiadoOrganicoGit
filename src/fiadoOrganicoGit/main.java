package fiadoOrganicoGit;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] dividaCliente = new int[10];

		int posicaoArray = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = (scanner.nextLine());
		System.out.print("Informe o valor da compra: ");
		int valorInserido = Integer.valueOf(scanner.nextLine());

		if (valorInserido <= 0) {
			System.out.println("Valor incorreto. O valor precisa ser maior que zero.");
			System.out.print("Informe o valor da compra: ");
			valorInserido = Integer.valueOf(scanner.nextLine());
		}

		dividaCliente[posicaoArray] = valorInserido;

		System.out.print("Deseja informar novo valor de compra? [1 - SIM | 0 - NÃO]: ");
		int desejaNovoValor = Integer.valueOf(scanner.nextLine());

		while (desejaNovoValor == 1) {
			posicaoArray += 1;
			System.out.print("Informe o próximo valor da compra: ");
			valorInserido = Integer.valueOf(scanner.nextLine());
			if (valorInserido <= 0) {
				System.out.println("Valor incorreto. O valor precisa ser maior que zero.");
				System.out.print("Informe o valor da compra: ");
				valorInserido = Integer.valueOf(scanner.nextLine());
			}

			dividaCliente[posicaoArray] = valorInserido;

			System.out.print("Deseja informar novo valor de compra? [1 - SIM | 0 - NÃO]: ");
			desejaNovoValor = Integer.valueOf(scanner.nextLine());
		}

		int valorTotal = somaWhile(dividaCliente);
		System.out.println("O cliente " + nomeCliente + " possui o débito total de " + valorTotal + " reais.");
	}

	public static int somaWhile(int[] dividaCliente) {
		int i = 0;
		int valorTotal = 0;
		while (i < dividaCliente.length) {
			valorTotal += dividaCliente[i];
			i++;
		}
		return valorTotal;
	}

}
