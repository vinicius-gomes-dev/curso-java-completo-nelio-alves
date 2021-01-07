package entities;

public class ContaBancaria {
	private String conta;
	private String nomeTitular;
	private double saldo;
	
		
	public ContaBancaria(String conta, String nomeTitular) {
		this.conta = conta;
		this.nomeTitular = nomeTitular;
	}
	
	public ContaBancaria(String conta, String nomeTitular, double depositoInicial) {
		this.conta = conta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public String getConta() {
		return conta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void saque(double saldo) {
		this.saldo -= (saldo + 5.0);
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	
	
	public String toString() {
		return "Account " + conta + ", "
				+ "Holder: " + nomeTitular + ", "
				+ "Balance: $ " + String.format("%.2f", saldo);
	}

}
