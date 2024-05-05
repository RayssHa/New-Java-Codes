import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {

	try (//Scanner keyboard;
		//keyboard = new Scanner(System.in);
	Scanner ler = new Scanner(System.in)) {
		int number;
		String nomecliente,agencia;
		float saldo;

		System.out.println("Digite seu nome completo: ");
		nomecliente= ler.nextLine();
		//nomecliente = keyboard.nextLine();

		ler.nextLine();

		System.out.println("Por favor digite o número da sua conta:");
		number= ler.nextInt();
		//number = keyboard.nextInt();
			
		ler.nextLine();

		System.out.println("Qual numero da agência: ");
		agencia= ler.nextLine();
		//agencia = keyboard.nextLine();
		
		ler.nextLine();
		
		System.out.println("Qual seu saldo: ");
		saldo= ler.nextFloat();
		//saldo = keyboard.nextLine();


		System.out.println("Numero da conta: " + number);
		System.out.println("Nome: " + nomecliente);
		System.out.println("Agência: " + agencia);
		System.out.println("Saldo: " + saldo);
	}
	
}
}