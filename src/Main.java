public class Main {

    public static void main(String[] args) {
        System.out.println("UNIFAN Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: João Pedro Gonçalves da Silva");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("");
        System.out.println("Seja bem vindo ao Questionário de Jogos Clássicos! Você responderá 15 perguntas, cada uma " +
                "delas tendo 5 alternativas com apenas uma sendo correta. Vamos começar, te desejo uma boa sorte!");
        System.out.println("");

        Questao questao1 = new Questao();
        questao1.pergunta = "Quem era o protagonista do primeiro jogo da franquia Street Fighter e em que ano ele foi lançado?";
        questao1.opcaoA = "A) Protagonista Ken, ano 1987.";
        questao1.opcaoB = "B) Protagonista Ryu, ano 1989.";
        questao1.opcaoC = "C) Protagonista Ken, ano 1988.";
        questao1.opcaoD = "D) Protagonista Ryu, ano 1987.";
        questao1.opcaoE = "E) Protagonista Guile, ano 1989.";
        questao1.correta = "D";

        int acertos;

        acertos = 0;

        questao1.escrevaQuestao();
        if (questao1.isCorreta(questao1.leiaResposta())) {
            acertos = acertos+1;
        }


    }
}


