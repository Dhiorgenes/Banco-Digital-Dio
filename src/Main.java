import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Cliente dhiorgenes = new Cliente();
			dhiorgenes.setNome("Dhiorgenes");
			Conta cc = new ContaCorrente(dhiorgenes);
			Conta poupanca = new ContaPoupanca(dhiorgenes);
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Informe qual operacao deseja realizar.");
			System.out.println("1 - Saque");
			System.out.println("2 - Deposito");
			System.out.println("3 - Transferencia");
			int opcao = sc.nextInt();
			switch (opcao){
				case 1:
					System.out.println("Informe o valor que deseja sacar:");
					int valor_saque = sc.nextInt();
					cc.sacar(valor_saque);
					break;
				case 2:
					System.out.println("Informe o valor que deseja depositar:");
					int valor_deposito = sc.nextInt();
					poupanca.depositar(valor_deposito);
					break;
				case 3:
					System.out.println("Informe o valor que deseja transferir:");
					int valor_transferencia = sc.nextInt();
					cc.transferir(valor_transferencia, poupanca);					
					break;
			}	
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();		
			
		}
	
}