package fiadoOrganicoGit;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String novoCliente = (scanner.nextLine());
		Consumidor consumidor = new Consumidor(novoCliente);
		System.out.print("Informe o número de telefone para contato com o cliente (somente números, sem traços ou pontos): ");
		int contatoCliente = Integer.valueOf(scanner.nextLine());
		consumidor.setContato(contatoCliente);
		System.out.print("Informe o valor da compra: ");
		int valorInserido = Integer.valueOf(scanner.nextLine());

		if (valorInserido <= 0) {
			System.out.println("Valor incorreto. O valor precisa ser maior que zero.");
			System.out.print("Informe o valor da compra: ");
			valorInserido = Integer.valueOf(scanner.nextLine());
		}

		consumidor.registrarDivida(valorInserido);

		System.out.print("Deseja informar novo valor de compra? [1 - SIM | 0 - NÃO]: ");
		int desejaNovoValor = Integer.valueOf(scanner.nextLine());

		while (desejaNovoValor == 1) {
			System.out.print("Informe o próximo valor da compra: ");
			valorInserido = Integer.valueOf(scanner.nextLine());
			if (valorInserido <= 0) {
				System.out.println("Valor incorreto. O valor precisa ser maior que zero.");
				System.out.print("Informe o valor da compra: ");
				valorInserido = Integer.valueOf(scanner.nextLine());
			}

			consumidor.registrarDivida(valorInserido);

			System.out.print("Deseja informar novo valor de compra? [1 - SIM | 0 - NÃO]: ");
			desejaNovoValor = Integer.valueOf(scanner.nextLine());
		}

		int valorTotal = consumidor.getDivida();

		if (valorTotal > 100) {
			System.out.println("O cliente " + consumidor.getNome() + " possui o débito total de " + valorTotal
					+ " reais. Entre em contato com o cliente " + consumidor.getNome()
					+ " pelo telefone " + consumidor.getContato() + " para que ele venha até a loja quitar a dívida.");
		} else {
			System.out.println("O cliente " + consumidor.getNome()
					+ " possui um débito inferior a R$ 100,00 e por isso o valor não será exibido. Entre em contato com o cliente "
					+ consumidor.getNome() + " pelo telefone " + consumidor.getContato()
					+ " para que ele venha até a loja comprar mais!");
		}

	}

}