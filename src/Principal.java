import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maria", "111.111.111-11");
		Cliente cliente2 = new Cliente("João", "222.222.222-22");
		Conta conta1 = new Conta("123-2","33.223-1", cliente1);
		Conta conta2 = new Conta("123-2", "44.444-2", cliente2);
		
		conta1.depositar(1000);
		
		System.out.println("Cliente: "+conta1.getCliente().getNome());
		System.out.println("Saldo: R$"+conta1.getSaldo());
		System.out.println();
		System.out.println("Cliente: "+conta2.getCliente().getNome());
		System.out.println("Saldo: R$"+conta2.getSaldo());
		Cliente.falar();
		
	}

}
