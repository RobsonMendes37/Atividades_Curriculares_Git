public class ControladorJogo {

	//crio uma variavel JogoDaVelha1 da classe JogoDaVelha
	private JogoDaVelha JogoDaVelha1;

	public boolean iniciarJogo() {
		//aqui eu devo receber algo do usuário e com isso mudar alguma variavel ou iniciar um metodo ou coisa do tipo,
		//penso em chamar os metodos de criar tabuleiro,

		JogoDaVelha1 = new JogoDaVelha(); //aqui eu crio um objeto chamando o construtor
										  //em seguida eu quardo ele na variavel JogoDaVelha1
		return true;
	}

	public void fazJogada(int linha, int coluna) {
		//aqui o usuário deve fazer a jogoada, eu leio a jogada e envio a "jogada" pro metodo do JogoDaVelha

		JogoDaVelha1.fazJogada(linha,coluna);
	}

	public int verificarVencedor() {
		JogoDaVelha1.atualizarVencedor();
		return JogoDaVelha1.verificarVencendor();
	}

	public boolean verificarFimDeJogo() {
		//aqui a tela envia a informação se o usuário vai querer um novo jogo então passa a informação para a classe JogoDaVelha
		return JogoDaVelha1.verificarFimDeJogo();
	}

}
