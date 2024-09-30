public class Main {

    public static void main(String[] args) {
        System.out.println("UNIFAN Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: João Pedro Gonçalves da Silva");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println(" ");
        System.out.println("Seja bem vindo ao Questionário de Jogos Clássicos! Você responderá 15 perguntas, cada uma " +
                "delas tendo 5 alternativas com apenas uma sendo correta. Vamos começar, te desejo uma boa sorte!");
        System.out.println(" ");

        Questao questao1 = new Questao();
        questao1.pergunta = "1) Quem era o protagonista do primeiro jogo da franquia Street Fighter e em que ano ele foi " +
                "lançado?";
        questao1.opcaoA = "A) Protagonista Ken, ano 1987.";
        questao1.opcaoB = "B) Protagonista Ryu, ano 1989.";
        questao1.opcaoC = "C) Protagonista Ken, ano 1988.";
        questao1.opcaoD = "D) Protagonista Ryu, ano 1987.";
        questao1.opcaoE = "E) Protagonista Guile, ano 1989.";
        questao1.correta = "D";

        Questao questao2 = new Questao();
        questao2.pergunta = "2) O famoso personagem Sonic tem seu visual baseado em um animal. Qual é esse animal?";
        questao2.opcaoA = "A) Gato.";
        questao2.opcaoB = "B) Porco-Espinho.";
        questao2.opcaoC = "C) Ouriço.";
        questao2.opcaoD = "D) Esquilo.";
        questao2.opcaoE = "E) Chinchila.";
        questao2.correta = "C";

        Questao questao3 = new Questao();
        questao3.pergunta = "3) No primeiro jogo da franquia Mortal Kombat, havia uma luta secreta que exigia passos " +
                "específicos para ser acessada. Essa luta era contra qual personagem?";
        questao3.opcaoA = "A) Reptile.";
        questao3.opcaoB = "B) Shao Khan.";
        questao3.opcaoC = "C) Kintaro.";
        questao3.opcaoD = "D) Ermac.";
        questao3.opcaoE = "E) Noob Saibot.";
        questao3.correta = "A";

        Questao questao4 = new Questao();
        questao4.pergunta = "4) Qual é o nome do irmão do Mario que esteve presente desde Super Mario Bros?";
        questao4.opcaoA = "A) Bowser.";
        questao4.opcaoB = "B) Yoshi.";
        questao4.opcaoC = "C) Toad.";
        questao4.opcaoD = "D) Goomba.";
        questao4.opcaoE = "E) Luigi.";
        questao4.correta = "E";

        Questao questao5 = new Questao();
        questao5.pergunta = "5) Qual era o nome do protagonista do primeiro Castlevania lançado em 1986?";
        questao5.opcaoA = "A) Simon.";
        questao5.opcaoB = "B) Trevor.";
        questao5.opcaoC = "C) Alucard.";
        questao5.opcaoD = "D) Hector.";
        questao5.opcaoE = "E) Isaac.";
        questao5.correta = "A";

        Questao questao6 = new Questao();
        questao6.pergunta = "6) O clássico jogo Doom de 1993 começa sua gameplay em uma base militar localizada em uma" +
                " lua. Qual o nome dessa lua?";
        questao6.opcaoA = "A) Deimos.";
        questao6.opcaoB = "B) Phobos.";
        questao6.opcaoC = "C) Triton.";
        questao6.opcaoD = "D) Oberon.";
        questao6.opcaoE = "E) Callisto.";
        questao6.correta = "B";

        Questao questao7 = new Questao();
        questao7.pergunta = "7) Qual o nome do vilão principal de The Legend of Zelda de 1986?";
        questao7.opcaoA = "A) Link.";
        questao7.opcaoB = "B) Skull Kid.";
        questao7.opcaoC = "C) Zant.";
        questao7.opcaoD = "D) Ganon.";
        questao7.opcaoE = "E) Veran.";
        questao7.correta = "D";

        Questao questao8 = new Questao();
        questao8.pergunta = "8) Em qual jogo da franquia Mega Man ocorreu a primeira aparição do cão robótico Rush?";
        questao8.opcaoA = "A) Mega Man 2.";
        questao8.opcaoB = "B) Mega Man 7.";
        questao8.opcaoC = "C) Mega Man 3.";
        questao8.opcaoD = "D) Mega Man 5.";
        questao8.opcaoE = "E) Mega Man 8.";
        questao8.correta = "C";

        int acertos;

        acertos = 0;

        questao1.escrevaQuestao();
        if (questao1.isCorreta(questao1.leiaResposta())) {
            acertos = acertos+1;
        }

        questao2.escrevaQuestao();
        if (questao2.isCorreta(questao2.leiaResposta())) {
            acertos = acertos+1;
        }

        questao3.escrevaQuestao();
        if (questao3.isCorreta(questao3.leiaResposta())) {
            acertos = acertos+1;
        }

        questao4.escrevaQuestao();
        if (questao4.isCorreta(questao4.leiaResposta())) {
            acertos = acertos+1;
        }

        questao5.escrevaQuestao();
        if (questao5.isCorreta(questao5.leiaResposta())) {
            acertos = acertos+1;
        }

        questao6.escrevaQuestao();
        if (questao6.isCorreta(questao6.leiaResposta())) {
            acertos = acertos+1;
        }

        questao7.escrevaQuestao();
        if (questao7.isCorreta(questao7.leiaResposta())) {
            acertos = acertos+1;
        }

        questao8.escrevaQuestao();
        if (questao8.isCorreta(questao8.leiaResposta())) {
            acertos = acertos+1;
        }


    }

}


