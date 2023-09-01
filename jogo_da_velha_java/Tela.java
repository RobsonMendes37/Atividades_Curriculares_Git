import java.util.Scanner;

public class Tela {//aqui é responsavel por receber as infromaçes do usuário e amostar as coisas do jogo, é responsárvel pela saida e entreda
	Scanner scanner = new Scanner(System.in);

	private ControladorJogo controladorJogo1; //cria uma variavel do tipo ControladorJogo


	
	public void jogar(){
		
		while(true){
			mostrarTabuleiro();
			fazJogada();
			realizarVezDaMaquina();
				mostrarTabuleiro();
			if(controladorJogo1.verificarFimDeJogo()){
				mostrarVencedor();
				jogarNovamente();
				controladorJogo1.iniciarJogo();	
			}

		}
	}
	public void iniciarJogo() {
		System.out.println("Bem vindo ao Jogo Da Velha!");
		controladorJogo1 = new ControladorJogo();
		controladorJogo1.iniciarJogo();
		jogar();
	}
	

	public void mostrarTabuleiro(){
		int[][] newTabuleiro = controladorJogo1.mostrarTabuleiro();

        System.out.println("Tabuleiro atual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (newTabuleiro[i][j] == 1) {
                    System.out.print(" X ");
                } else if (newTabuleiro[i][j] == 2) {
                    System.out.print(" O ");
                } else {
                    System.out.print("   ");
                }

                if (j < 2) {
                    System.out.print("|"); // Separador entre colunas
                }
            }
            System.out.println(); // Nova linha para a próxima linha do tabuleiro

            if (i < 2) {
                System.out.println("---+---+---"); // Separador entre linhas
            }
        }
    }

	public void mostrarVencedor() {
        int vencedor = controladorJogo1.verificarVencedor();

        if (vencedor == 1) {
            System.out.println("Você venceu! Parabéns!");
        } else if (vencedor == 2) {
            System.out.println("A máquina venceu. Melhor sorte na próxima vez.");
        } else {
            System.out.println("Empate! O jogo terminou sem vencedor.");
        }
    }

	public void fazJogada() {
		System.out.println("----Faça sua Jogada---- \n Linha: " );
		int linha = scanner.nextInt();
		System.out.println("Coluna: " );
		int coluna = scanner.nextInt();

		controladorJogo1.fazJogada(linha, coluna);
		
	}

	public void realizarVezDaMaquina(){
		System.out.println("Maquina Realiza jogada:");
		controladorJogo1.realizarVezDaMaquina();
	}

	public void jogarNovamente() {
        System.out.println("Deseja jogar novamente? (Sim ou Não)");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("Sim")) {
            controladorJogo1.iniciarJogo();
        } else {
            System.out.println("Obrigado por jogar! Até a próxima.");
        }
		controladorJogo1.apagarTabuleiro();
		controladorJogo1.iniciarJogo();
		controladorJogo1.mostrarTabuleiro();
    }

}
