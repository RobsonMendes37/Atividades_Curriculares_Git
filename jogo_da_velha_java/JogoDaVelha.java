import java.util.Random;
public class JogoDaVelha {

	private int jogadorVencedor=-000;
	//  humano é 1
	//	maquina é 2
	private boolean fimDeJogo;
	private int jogadorDaVez;// erifica se é a vez do jogador jogar
	private int[][] tabuleiro; // é a matriz do jogo, no caso o jogo da velha é um 3 por 3, eu penso em atribuir 1 para o jogador e 0 para a maquina,assim eu 
								// vou ter algumas verificações para quando o jogador for vencer a partir de um numero minimo de jogadas do inidividuo que no caso é 3
								//assim eu deveo iniciar o tabuleiro com algum valor. tipo null
	
	public JogoDaVelha(){ //Faço o tabuleiro com o construtor da classe
		fimDeJogo=false;
		jogadorDaVez=1;
		tabuleiro = new int[3][3];
		for(int i;i<3;i++){
			for(int j;j<3;j++){
				tabuleiro[i][j]=-000;//forma de criar umm string vazia
			}
		}
	}
	
	public boolean iniciarJogo() {//so tem que falar par iniciar o jogo
		return true;
	}

	public void fazJogada(int linha, int coluna) {
		// aqui o usuário de deve jogar, assim deve ter uma entrada da jogada do usuário, colocando a linha e coluna que ele quer jogar, 
		// assim deve colocar o valor no tabuleiro
		jogadorDaVez=1;
		if(tabuleiro[linha][coluna]==-000){//verifica se for vazil,se for é true
			tabuleiro[linha][coluna]= jogadorDaVez;
			jogadorDaVez=2;

		}


	}


	Random random = new Random();
	private void realizarVezDaMaquina() {
			//aqui a maquina faz a jogada, ela pode fazer de forma aleátoria, ou eu posso colocar diretrizes que melhoram as jogadas dela
		
		int linha = random.nextInt(3); //vai fazer um aleatorio de 0 á  2
		int coluna =random.nextInt(3); 
		
		if(tabuleiro[linha][coluna]==-000){//verifica se for vazil,se for é true
			tabuleiro[linha][coluna]= jogadorDaVez;
			jogadorDaVez=1;
		}
	}

	public void atualizarVencedor() {
		// acho que aqui eu verifico o tabuleiro e verifico quem ganhou
		//acho interessante fazer as comparações ifs so na 3 jogada de cada um
		
		if(tabuleiro[0][0]+tabuleiro[0][1]+tabuleiro[0][2]==3){//linha 1
			jogadorVencedor=1;
		}   else if(tabuleiro[0][0]+tabuleiro[0][1]+tabuleiro[0][2]==6){
				jogadorVencedor=2;
			}
		
		if(tabuleiro[1][0]+tabuleiro[1][1]+tabuleiro[1][2]==3){//linha 2
			jogadorVencedor=1;
		}   else if(tabuleiro[1][0]+tabuleiro[1][1]+tabuleiro[1][2]==6){
				jogadorVencedor=2;
			}

		if(tabuleiro[2][0]+tabuleiro[2][1]+tabuleiro[2][2]==3){//linha 3
				jogadorVencedor=1;
			}   else if(tabuleiro[2][0]+tabuleiro[2][1]+tabuleiro[2][2]==6){
					jogadorVencedor=2;
				}
			
		
		if(tabuleiro[0][0]+tabuleiro[1][0]+tabuleiro[2][0]==3){//coluna 1
			jogadorVencedor=1;
		}   else if(tabuleiro[0][0]+tabuleiro[1][0]+tabuleiro[2][0]==6){
				jogadorVencedor=2;
			}
		
		if(tabuleiro[0][1]+tabuleiro[1][1]+tabuleiro[2][1]==3){//coluna 2
			jogadorVencedor=1;
		}   else if(tabuleiro[0][1]+tabuleiro[1][1]+tabuleiro[2][1]==6){
				jogadorVencedor=2;
			}
		
		if(tabuleiro[0][2]+tabuleiro[1][2]+tabuleiro[2][2]==3){//coluna 3
			jogadorVencedor=1;
		}   else if(tabuleiro[0][2]+tabuleiro[1][2]+tabuleiro[2][2]==6){
				jogadorVencedor=2;
			}

		if(tabuleiro[0][0]+tabuleiro[1][1]+tabuleiro[2][2]==3){//diagona esquerda
			jogadorVencedor=1;
		}   else if(tabuleiro[0][0]+tabuleiro[1][1]+tabuleiro[2][2]==6){
				jogadorVencedor=2;
			}
		
		if(tabuleiro[0][2]+tabuleiro[1][1]+tabuleiro[2][0]==3){//diagona direita
			jogadorVencedor=1;
		}   else if(tabuleiro[0][0]+tabuleiro[1][1]+tabuleiro[2][2]==6){
				jogadorVencedor=2;
			}
		
		fimDeJogo=true;
	}

	public int verificarVencendor(){
		if(jogadorVencedor==-000){
			return -1;
		}else return jogadorVencedor;
	}

	public boolean verificarFimDeJogo() {//é tipo o get eu acho
		// aqui verefica se o usuário quer terminar o jogo, no caso verifica uma variavel
		if(jogadorVencedor!=-000){
			return true;
		}
		else return false;
	}

	private void atualizaFimDeJogo() {//atualiza o fim de jogo, ja que ele é privado, é tipo o set
		fimDeJogo=false;
	}

	private void atualizaTabuleiro() {
		//aqui limpa o tabuleiro ja que o jogador quer um novo jogo
		tabuleiro = null;
	}

	
}
