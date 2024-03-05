import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // definindo as variáveis necessárias
        final int qtd_questoes = 10;
        final int pontos_questoes = 1;


        // inicialização dos arrays da prova
        char[] gabarito = {'b','c','a','d','b','b','a','c','b','d'};

        String[] perguntas = {
                "Qual a nacionalidade do jogador Johan Cruijff?",
                "Qual seleção foi campeã do mundo em 2002?",
                "Quantas vezes o Real Madrid venceu a Liga dos Campeões?",
                "Qual o maior artilheiro da seleção brasileira?",
                "Quantas bolas de ouro Crisitano Ronaldo ganhou em sua carreira?",
                "Quantos títulos mundiais possui o São Paulo Futebol Clube?",
                "Quantas vezes o time do Palmeiras caiu pra segunda divisão?",
                "Quaem foi campeão da Copa do Brasil de 2021?",
                "Por qual time Marco Reus mais atuou em sua carreira?",
                "Quantos títulos mundiais possui a seleção brasileira?",
        };

        String[] alternativas = {
                "a) Francês  - b) Holandês  - c) Italiano   - d) Espanhol",
                "a) Argentina  - b) Bélgica  - c) Brasil  - d) Espanha",
                "a) 14  - b) 10  - c) 12  - d) 11",
                "a) Ronaldo  - b) Pelé  - c) Romário  - d) Neymar",
                "a) 3  - b) 5  - c) 7  - d) 6",
                "a) 2  - b) 3  - c) 4  - d) 1",
                "a) 2  - b) 1  - c) 3  - d) 5",
                "a) São Paulo  - b) Flamengo  - c) Atlético MG  - d) Palmeiras",
                "a) Atlético de Madrid  - b) Borussia Dortmund  - c) Inter de Milão  - d) Wolfsburg",
                "a) 2  - b) 3  - c) 6  - d) 5"
        };

        // definindo as variáveis necessárias
        int nota_final = 0;
        char[] respostas = new char[qtd_questoes];
        char resp;
        String Aluno;

        System.out.println("Bem-vindo ao teste de conhecimentos de futebol. Por favor, digite o seu nome: ");
        Aluno = leitor.nextLine();


        // 1° for que apresenta os enunciados ao aluno
        for (int i = 0;i < qtd_questoes;i++){
            System.out.println("---------------------------------\n");
            System.out.printf("Pergunta número %d: %s\n",i + 1,perguntas[i]);
            System.out.printf("Alternativas: %s\n",alternativas[i]);
            resp = leitor.nextLine().toLowerCase().charAt(0);
            while (resp != 'a' && resp != 'b' && resp != 'c' && resp != 'd'){
                // verificando a resposta do usuário
                System.out.println("Digite uma alternativa válida por favor.");
                System.out.println("---------------------------------\n");
                System.out.printf("Pergunta número %d: %s\n",i + 1,perguntas[i]);
                System.out.printf("Alternativas: %s\n",alternativas[i]);
                resp = leitor.nextLine().toLowerCase().charAt(0);
            }
            respostas[i] = resp;
        }

        // 2° for que contabiliza a quantidade de pontos que ele faz de acordo com seus acertos
        System.out.println("Fim da prova!Confira o resultado.\n");
        for (int i = 0;i < qtd_questoes;i++){
            if (gabarito[i] == respostas[i]){
                nota_final+=pontos_questoes;
            }
        }

        // definição de resultado baseado na nota com o uso do switch
        switch (nota_final){
            case 10: case 9: case 8: case 7:
                System.out.printf("Parabéns %s, sua nota foi: %d",Aluno,nota_final);
                break;

            case 6: case 5: case 4:
                System.out.printf("Eita %s, sua nota foi: %d.Você está de recuperação.",Aluno,nota_final);
                break;

            case 3: case 2: case 1: case 0:
                System.out.printf("Infelizmente você mandou mal %s, sua nota foi: %d.Você foi reprovado(a).",Aluno,nota_final);
                break;
        }




    }
}