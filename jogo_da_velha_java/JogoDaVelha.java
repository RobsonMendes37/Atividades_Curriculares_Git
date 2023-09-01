import java.util.Random;

public class JogoDaVelha {//faz o jogo funcionar

	private int jogadorVencedor;
	//  humano é 1
	//	maquina é 2
	private boolean fimDeJogo;//inicia com falso
	private int jogadorDaVez;// erifica se é a vez do jogador jogar
	private int[][] tabuleiro; // é a matriz do jogo, no caso o jogo da velha é um 3 por 3, eu penso em atribuir 1 para o jogador e 0 para a maquina,assim eu 
								// vou ter algumas verificações para quando o jogador for vencer a partir de um numero minimo de jogadas do inidividuo que no caso é 3
								//assim eu deveo iniciar o tabuleiro com algum valor. tipo null
	



	public JogoDaVelha(){ //Faço o tabuleiro com o construtor da classe
		fimDeJogo=false;
		jogadorDaVez=1;
		jogadorVencedor=0;
		tabuleiro = new int[3][3];
		
		for(int i =0; i<3; i++){
			for(int j=0;j<3; j++){
				tabuleiro[i][j]=0;//forma de criar umm string vazia
			}
		}
	}
	
	
	public void fazJogada(int linha, int coluna) {
		// aqui o usuário de deve jogar, assim deve ter uma entrada da jogada do usuário, colocando a linha e coluna que ele quer jogar, 
		// assim deve colocar o valor no tabuleiro
		jogadorDaVez=1;
		if(tabuleiro[linha][coluna]==0){//verifica se for vazil,se for é true
			tabuleiro[linha][coluna]= jogadorDaVez;
			jogadorDaVez=2;

		}
	}

	public int[][] mostrarTabuleiro(){
		return tabuleiro;
	}

	Random random = new Random();

	public void realizarVezDaMaquina() {
			//aqui a maquina faz a jogada, ela pode fazer de forma aleátoria, ou eu posso colocar diretrizes que melhoram as jogadas dela
		
		int linha = random.nextInt(3); //vai fazer um aleatorio de 0 á  2
		int coluna =random.nextInt(3); 
		
		if(tabuleiro[linha][coluna]==0){//verifica se for vazil,se for é true
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

	public int amostrarVencendor(){
		if(jogadorVencedor==0){
			return -1;
		}else return jogadorVencedor;
	}

	public boolean verificarFimDeJogo() {
		if(jogadorVencedor!=0){
			return true;
		}   else    return false;
	}

	public void apagarTabuleiro(){
		tabuleiro = null;
	}

	
}
