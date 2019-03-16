package programacao;

public class TestaConta {
	public static void main (String[] args) {
		Conta contaDoJorge = new Conta();
		Conta contaDoGp = new Conta();
		
		contaDoJorge.setNome("Jorge");
		contaDoJorge.setAgencia(12345);
		contaDoJorge.setConta(98765);
		contaDoJorge.setSaldo(1234666);
		
		contaDoGp.setNome("Gp");
		contaDoGp.setAgencia(1234);
		contaDoGp.setConta(22838);
		contaDoGp.setSaldo(10000);
		
		//ANTES
		System.out.println("Saldo (Jorge):" + contaDoJorge.getSaldo());
		contaDoJorge.saca(50);
		
		//Depois
		System.out.println("Saldo (Jorge):" + contaDoJorge.getSaldo());
		contaDoJorge.transfere(50, contaDoGp);
		
		//depois
		System.out.println("Saldo (Jorge):" + contaDoJorge.getSaldo());
		System.out.println("Saldo (Gp):" + contaDoGp.getSaldo());
		
		
		
		
		//System.out.println(contaDoJorge.getNome());
		//System.out.println(contaDoJorge2.getNome());
		//System.out.println(contaDoJorge == contaDoJorge2);
		
		
		
		
	}
	
}
