
public class Carro {
	
	/*TO-DO
	 * Ligar carro
	 * desligar carro
	 * acelerar
	 * diminuir velocidade
	 * virar para esquerda/direita
	 * verificar velocidade
	 * trocar a marcha
	 */
	String nome;
	int velocidade = 0;
	boolean carroLigado = false;
	int marcha = 0;
	
	public Carro(String nome) {
		this.nome = nome;
	}
	
	public void statusCarro() {
		System.out.println("O carro é um " + nome);
		System.out.println("O carro está ligado: " + carroLigado);
		System.out.println("O carro está na marcha: " + marcha);
		System.out.println("A velocidade do carro está em: " + velocidade);
		
	}
	
	public void ligarCarro() {
		if (carroLigado == false) {
			carroLigado = true;
			System.out.println("Carro ligado!");
		}else if (carroLigado == true) {
			System.out.println("O carro já está ligado!");
		}
		
	}
	
	public void desligarCarro() {
		if (carroLigado == false) {
			System.out.println("O carro já está desligado!");
		}else if (marcha == 0 && velocidade == 0) {
			carroLigado = false;
			System.out.println("Carro desligado!");
		}else {
			System.out.println("Você só pode desligar o carro quando ele estiver na velocidade 0 e no ponto neutro");
		}
		
	}
	
	public void acelerar() {
		if (carroLigado == false || marcha == 0){
		System.out.println("Você não pode acelerar o carro enquanto ele está desligado ou no ponto morto!");
		
		}else if (marcha == 1 && velocidade <= 19) {
			velocidade += 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 2 && (velocidade == 20 || velocidade <= 39)) {
			velocidade += 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 3 && (velocidade == 40 || velocidade <= 59)) {
			velocidade += 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 4 && (velocidade == 60 || velocidade <= 79)) {
			velocidade += 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 5 && (velocidade == 80 || velocidade <= 99)) {
			velocidade += 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 6 && (velocidade == 100 || velocidade <= 119)) {
			velocidade += 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (velocidade == 120){
			System.out.println("O carro está na velocidade limite!");
			
		}else {
			System.out.println("Para acelerar mais troque para a marcha " + (marcha + 1));
		}
			
	}
	
	public void diminuir() {
		if (carroLigado == false) {
			System.out.println("O carro está desligado");
		}else if (marcha == 6 && velocidade >= 101 && velocidade <= 120) {
			velocidade -= 1 ;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 5 && velocidade >= 81 && velocidade <= 100) {
			velocidade -= 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 4 && velocidade >= 61 && velocidade <= 80) {
			velocidade -= 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 3 && velocidade >= 41 && velocidade <= 60) {
			velocidade -= 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 2 && velocidade >= 21 && velocidade <= 40) {
			velocidade -= 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (marcha == 1 && velocidade > 0 && velocidade <= 20) {
			velocidade -= 1;
			System.out.println("A velocidade está em " + velocidade + " km/h.");
			
		}else if (velocidade == 0 && (marcha == 1 || marcha == 0)){
			System.out.println("O carro está na velocidade " + velocidade + " km/h, e está na marcha " + marcha);
			
		}else {
			System.out.println("Se quiser desacelerar mais, troque para a marcha " + (marcha - 1));
		}
	}
	
	public void virarEsquerda() {
		if(carroLigado == false) {
			System.out.println("O carro está desligado!");
		}else if (velocidade >= 1 && velocidade <= 40) {
			System.out.println("O carro virou a esquerda!");
		}else {
			System.out.println("O carro só pode virar a esquerda com a velocidade entre 1km e 40km.");
		}
	}
	
	public void virarDireita() {
		if(carroLigado == false) {
			System.out.println("O carro está desligado!");
		}else if (velocidade >= 1 && velocidade <= 40) {
			System.out.println("O carro virou a direita!");
		}else {
			System.out.println("O carro só pode virar a direita com a velocidade entre 1km e 40km.");
		}
	}
	
	
	public void trocarMarchaParaCima() {
		if(carroLigado == false) {
			System.out.println("O carro está desligado");
		}else if (marcha == 0 && velocidade == 0) {
			marcha += 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 1 && velocidade == 20){
			marcha += 1;	
			System.out.println("Você está na marcha " + marcha);		
		}else if (marcha == 2 && velocidade == 40){
			marcha += 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 3 && velocidade == 60){
			marcha += 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 4 && velocidade == 80){
			marcha += 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 5 && velocidade == 100){
			marcha += 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 6 ){	
			System.out.println("Você está na marcha " + marcha + ". Está é a ultima marcha");
		}else{
			System.out.println("Você não pode aumentar para a marcha " + (marcha + 1) + " estando a " + velocidade + "Km/h");
		}
	}
		
	public void trocarMarchaParaBaixo() {
		if (carroLigado == false) {
			System.out.println("O carro está desligado!");
		}else if (marcha == 1 && velocidade == 0 ){
			marcha -= 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 2 && velocidade == 20){
			marcha -= 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 3 && velocidade == 40){
			marcha -= 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 4 && velocidade == 60){
			marcha -= 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 5 && velocidade == 80){
			marcha -= 1;	
			System.out.println("Você está na marcha " + marcha);
		}else if (marcha == 6 && velocidade == 100){	
			marcha -= 1;
			System.out.println("Você está na marcha " + marcha );
		}else if (marcha == 0) {
			System.out.println("Você está na marcha zero.");
		}else {
			System.out.println("O você não pode ir para a marcha " + (marcha - 1) + " estando a " + velocidade + "km/h");
		}
	}
	

}
