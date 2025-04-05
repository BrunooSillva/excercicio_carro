import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		Carro car = new Carro("Civic");
		
		 do {
			System.out.println("\nOpções do Carro:\n"
					+ "1. Ligar\n"
					+ "2. Acelerar\n"
					+ "3. Desacelerar\n"
					+ "4. Trocar a marcha para cima\n"
					+ "5. Trocar a marcha para baixo\n"
					+ "6. Virar Esquerda\n"
					+ "7. Virar Direita\n"
					+ "8. Desligar\n"
					+ "9. Status carro\n"
					+ "0. Sair do programa");
			System.out.println("Digite a opção que deseja executar: ");
			opcao = scan.nextInt();
			
			switch (opcao) {
				case 1: car.ligarCarro();
					break;
				case 2: car.acelerar();
					break;
				case 3: car.diminuir();
					break;
				case 4: car.trocarMarchaParaCima();
					break;
				case 5: car.trocarMarchaParaBaixo();
					break;
				case 6: car.virarEsquerda();
					break;
				case 7: car.virarDireita();
					break;
				case 8: car.desligarCarro();
					break;
				case 9: car.statusCarro();
					break;
				case 0:
					break;
				default: System.out.println("Comando invalido!");}
					
			
			}while (opcao != 0);
				System.out.println("O programa foi encerrado!!");
		
		scan.close();

	}
}