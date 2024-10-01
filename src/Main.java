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

        Questao questao9 = new Questao();
        questao9.pergunta = "9) Qual o apelido dado aos 4 fantasmas que perseguem Pac Man em seus jogos?";
        questao9.opcaoA = "A) Tinky, Blinky, Clyde e Skeet";
        questao9.opcaoB = "B) Blinky, Pinky, Inky e Clyde.";
        questao9.opcaoC = "C) Inky, Tinky, Winky e Pinky.";
        questao9.opcaoD = "D) Inky, Skeet, Blinky e Boome.";
        questao9.opcaoE = "E) Boome, Clyde, Skeet e Pinky.";
        questao9.correta = "B";

        Questao questao10 = new Questao();
        questao10.pergunta = "10) No primeiro Contra lançado em 1987, quantas fases o jogador deveria concluír para" +
                "finalmente finalizar o jogo?";
        questao10.opcaoA = "A) 8 Fases";
        questao10.opcaoB = "B) 6 Fases.";
        questao10.opcaoC = "C) 5 Fases.";
        questao10.opcaoD = "D) 4 Fases.";
        questao10.opcaoE = "E) 7 Fases.";
        questao10.correta = "E";

        Questao questao11 = new Questao();
        questao11.pergunta = "11) Qual o nome da dupla de protagonistas que podem ser escolhidos pelo jogador no" +
                " primeiro jogo da franquia Resident Evil lançado em 1996?";
        questao11.opcaoA = "A) Chris Redfield e Jill Valentine.";
        questao11.opcaoB = "B) Ada Wong e Albert Wesker.";
        questao11.opcaoC = "C) Jill Valentine e Leon S. Kennedy.";
        questao11.opcaoD = "D) Leon S. Kennedy e Ada Wong";
        questao11.opcaoE = "E) Chris Redfield e Ada Wong.";
        questao11.correta = "A";

        Questao questao12 = new Questao();
        questao12.pergunta = "12) A franquia GTA já conta com diversos jogos lançados e teve sua origem como um" +
                " jogo 2D. Em qual título da franquia ouve essa mudança para gráficos em 3D?";
        questao12.opcaoA = "A) GTA 2.";
        questao12.opcaoB = "B) GTA Vice City.";
        questao12.opcaoC = "C) GTA IV.";
        questao12.opcaoD = "D) GTA III";
        questao12.opcaoE = "E) GTA San Andreas.";
        questao12.correta = "D";

        Questao questao13 = new Questao();
        questao13.pergunta = "13) Na história do primeiro jogo da franquia The King of Fighters (TKOF '94), qual foi" +
                " o trio responsável por derrotar Rugal no final do torneio?";
        questao13.opcaoA = "A) Kim Kaphwan, Chang Koehan e Choi Bounge.";
        questao13.opcaoB = "B) Athena Asamiya, Sie Kensou e Chin Gentsai.";
        questao13.opcaoC = "C) Terry Bogard, Andy Bogard e Joe Higashi.";
        questao13.opcaoD = "D) Yuri Sakazaki, Mai Shiranui e King.";
        questao13.opcaoE = "E) Kyo Kusanagi, Benimaru Nikaido e Goro Daimon.";
        questao13.correta = "E";

        Questao questao14 = new Questao();
        questao14.pergunta = "14) No jogo Gradius de 1986 os desenvolvedores acidentalmente deixaram na versão final" +
                " um código que era usado para testes no jogo. Esse código acabou se popularizando e ficou conhecido" +
                " como:";
        questao14.opcaoA = "A) Arcade Code.";
        questao14.opcaoB = "B) Konami Code.";
        questao14.opcaoC = "C) God Mode Code.";
        questao14.opcaoD = "D) Cheat Code.";
        questao14.opcaoE = "E) Developer Code.";
        questao14.correta = "B";

        Questao questao15 = new Questao();
        questao15.pergunta = "15) A franquia Kirby do memóravel protagonista rosado teve seu primeiro jogo lançado em " +
                "1992. Qual foi o título dado a esse jogo?";
        questao15.opcaoA = "A) Kirby's Adventure.";
        questao15.opcaoB = "B) Kirby Super Star.";
        questao15.opcaoC = "C) Kirby's Dream Land.";
        questao15.opcaoD = "D) Kirby Star Allies.";
        questao15.opcaoE = "E) Kirby & the Amazing Mirror.";
        questao15.correta = "C";

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

        questao9.escrevaQuestao();
        if (questao9.isCorreta(questao9.leiaResposta())) {
            acertos = acertos+1;
        }

        questao10.escrevaQuestao();
        if (questao10.isCorreta(questao10.leiaResposta())) {
            acertos = acertos+1;
        }

        questao11.escrevaQuestao();
        if (questao11.isCorreta(questao11.leiaResposta())) {
            acertos = acertos+1;
        }

        questao12.escrevaQuestao();
        if (questao12.isCorreta(questao12.leiaResposta())) {
            acertos = acertos+1;
        }

        questao13.escrevaQuestao();
        if (questao13.isCorreta(questao13.leiaResposta())) {
            acertos = acertos+1;
        }

        questao14.escrevaQuestao();
        if (questao14.isCorreta(questao14.leiaResposta())) {
            acertos = acertos+1;
        }

        questao15.escrevaQuestao();
        if (questao15.isCorreta(questao15.leiaResposta())) {
            acertos = acertos+1;
        }


    }

}


