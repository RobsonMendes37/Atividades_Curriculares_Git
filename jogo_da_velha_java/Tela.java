import java.util.Formattable;
import java.util.Collection;
import java.util.Scanner;

public class Tela {//aqui é responsavel por receber as infromaçes do usuário e amostar as coisas do jogo, é responsárvel pela saida e entreda

	private ControladorJogo controladorJogo1; //cria uma variavel do tipo ControladorJogo
	private Formattable simboloJogador; // se refere ao simbolo,tipo x ou o, é um jogo da velha, tipo um imagem ou si, prefiro usar "x" 

	private Collection simboloMaquina; // se refere ao simbolo,tipo x ou o, é um jogo da velha,tipo uma imagem, mas prefiro usar o "o"


	Scanner scanner = new Scanner(System.in);

	public void iniciarJogo() {
		//provavelmente é uma forma de iniciar o jogo, mudndo alguma variavel do jogo, algo que estava null passa a ter algum valor ou coisa assim
		//provavelmente vai ter relação com esse objeto private ControladorJogo controladorJogo; "mas como não sei isso provavelmente isso vai ser um problema
	}
	
	public void fazJogada(String linha, int coluna) {//precisa colocar linha e coluna como paremetros? aqui é o inicio, então é aqui que eu recebo os dados
												  //*** agora eu entendi, refere aos atributos desse objeto*/

		//deve se referir ao jogador poder fazer a jogada, por exemplo ele escolhe jogar x no cando superir esquerdo, ou ele escolhe jogar x no meio direito
		// isso aqui também deve provavelmente se referir a esse objeto, ou então mudar alguma coisa da classe
		

		System.out.println("----Faça sua Jogada---- \n Linha: " );
		linha = scanner.next();
		System.out.println("Coluna: " );
		coluna = scanner.nextInt();
		
	}

}
