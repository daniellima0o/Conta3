
public class Conta {
	private String agencia;
	private String nr_conta;
	private double saldo;
	private Cliente cliente;
	public Conta(String agencia, String nr_conta, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.nr_conta = nr_conta;
		this.saldo = 0;
		this.cliente = cliente;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNr_conta() {
		return nr_conta;
	}
	public void setNr_conta(String nr_conta) {
		this.nr_conta = nr_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public boolean depositar(double valorDeposito) {
		if(valorDeposito>=0) {
			saldo += valorDeposito;
			return true;
		}else {
			System.out.println("Valor inválido");
			return false;
		}
	}
	
	public boolean sacar(double valorSaque) {
		if(saldo>=valorSaque) {
			saldo -= valorSaque;
			return true;
		}else {
			System.out.println("Saque não realizado. Saldo indisponível");
			return false;
		}
	}
	
	public void transferir(Conta contaASerTransferido, double valor) {
		if(this.sacar(valor)) {
			contaASerTransferido.depositar(valor);
		}else {
			System.out.println("Transferencia não realizada");
		}
		
	}
	

}
