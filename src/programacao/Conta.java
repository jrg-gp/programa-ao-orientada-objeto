package programacao;

public class Conta {
	

	private String nome = null;
	
	private int agencia = 0;
	
	private int conta = 0;
	
	private double saldo = 0;
	
	public void saca (double valor) {
		this.saldo -= valor;
	}
	private void deposita (double valor) {
		this.saldo += valor;
	}
	public void transfere(double valor, Conta outraConta) {
		this.saca(valor);
		outraConta.deposita(valor);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
