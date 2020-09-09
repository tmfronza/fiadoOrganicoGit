package fiadoOrganicoGit;

public class Consumidor {

	private String nomeCliente;
	private int dividaCliente[];
	private int contatoCliente;
	private int posicao = 0;

	public Consumidor(String novoCliente) {
		this.nomeCliente = novoCliente;
		this.dividaCliente = new int[10];
	}

	public void setNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNome() {
		return this.nomeCliente;
	}

	public int getDivida() {
		int total = 0;
		for (int divida : dividaCliente) {
			total += divida;
		}
		return total;
	}

	public void registrarDivida(int valorInserido) {
		this.dividaCliente[posicao] = valorInserido;
		posicao++;
	}

	public void setContato(int contatoCliente) {
		this.contatoCliente = contatoCliente;
	}

	public int getContato() {
		return this.contatoCliente;
	}
}
