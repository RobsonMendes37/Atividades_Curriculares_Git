public class ControladorJogo {//controla o fluxo 

	//crio uma variavel JogoDaVelha1 da classe JogoDaVelha
	private JogoDaVelha JogoDaVelha1;

	public void iniciarJogo() {
		JogoDaVelha1 = new JogoDaVelha(); //aqui eu crio um objeto chamando o construtor
										  //em seguida eu quardo ele na variavel JogoDaVelha1
	}

	public void fazJogada(int linha, int coluna) {
		//aqui o usuário deve fazer a jogoada, eu leio a jogada e envio a "jogada" pro metodo do JogoDaVelha

		JogoDaVelha1.fazJogada(linha,coluna);
	}

	public int[][] mostrarTabuleiro(){
		return JogoDaVelha1.mostrarTabuleiro();
	} 

	public int verificarVencedor() {
		JogoDaVelha1.atualizarVencedor();
		return JogoDaVelha1.amostrarVencendor();
	}

	public boolean verificarFimDeJogo() {
		//aqui a tela envia a informação se o usuário vai querer um novo jogo então passa a informação para a classe JogoDaVelha
		return JogoDaVelha1.verificarFimDeJogo();
	}

	public void apagarTabuleiro(){
		JogoDaVelha1.apagarTabuleiro();
	}
	
	public void realizarVezDaMaquina(){
		JogoDaVelha1.realizarVezDaMaquina();
	}
}
