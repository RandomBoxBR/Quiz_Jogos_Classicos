public class Main {

    public static void main(String[] args) {

        System.out.println("UNIFAN Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: João Pedro Gonçalves da Silva");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println(" ");
        System.out.println("Seja bem vindo ao Questionário de Jogos Clássicos! Você responderá 15 perguntas, cada uma " +
                "delas tendo 5 alternativas com apenas uma sendo correta. Vamos começar, te desejo uma boa sorte!");
        System.out.println(" ");

        Questao q1 = new Questao();
        q1.pergunta = "1) Quem era o protagonista do primeiro jogo da franquia Street Fighter e em que ano ele foi " +
                "lançado?";
        q1.opcaoA = "A) Protagonista Ken, ano 1987.";
        q1.opcaoB = "B) Protagonista Ryu, ano 1989.";
        q1.opcaoC = "C) Protagonista Ken, ano 1988.";
        q1.opcaoD = "D) Protagonista Ryu, ano 1987.";
        q1.opcaoE = "E) Protagonista Guile, ano 1989.";
        q1.correta = "D";

        Questao q2 = new Questao();
        q2.pergunta = "2) O famoso personagem Sonic tem seu visual baseado em um animal. Qual é esse animal?";
        q2.opcaoA = "A) Gato.";
        q2.opcaoB = "B) Porco-Espinho.";
        q2.opcaoC = "C) Ouriço.";
        q2.opcaoD = "D) Esquilo.";
        q2.opcaoE = "E) Chinchila.";
        q2.correta = "C";

        Questao q3 = new Questao();
        q3.pergunta = "3) No primeiro jogo da franquia Mortal Kombat, havia uma luta secreta que exigia passos " +
                "específicos para ser acessada. Essa luta era contra qual personagem?";
        q3.opcaoA = "A) Reptile.";
        q3.opcaoB = "B) Shao Khan.";
        q3.opcaoC = "C) Kintaro.";
        q3.opcaoD = "D) Ermac.";
        q3.opcaoE = "E) Noob Saibot.";
        q3.correta = "A";

        Questao q4 = new Questao();
        q4.pergunta = "4) Qual é o nome do irmão do Mario que esteve presente desde Super Mario Bros?";
        q4.opcaoA = "A) Bowser.";
        q4.opcaoB = "B) Yoshi.";
        q4.opcaoC = "C) Toad.";
        q4.opcaoD = "D) Goomba.";
        q4.opcaoE = "E) Luigi.";
        q4.correta = "E";

        Questao q5 = new Questao();
        q5.pergunta = "5) Qual era o nome do protagonista do primeiro Castlevania lançado em 1986?";
        q5.opcaoA = "A) Simon.";
        q5.opcaoB = "B) Trevor.";
        q5.opcaoC = "C) Alucard.";
        q5.opcaoD = "D) Hector.";
        q5.opcaoE = "E) Isaac.";
        q5.correta = "A";

        Questao q6 = new Questao();
        q6.pergunta = "6) O clássico jogo Doom de 1993 começa sua gameplay em uma base militar localizada em uma" +
                " lua. Qual o nome dessa lua?";
        q6.opcaoA = "A) Deimos.";
        q6.opcaoB = "B) Phobos.";
        q6.opcaoC = "C) Triton.";
        q6.opcaoD = "D) Oberon.";
        q6.opcaoE = "E) Callisto.";
        q6.correta = "B";

        Questao q7 = new Questao();
        q7.pergunta = "7) Qual o nome do vilão principal de The Legend of Zelda de 1986?";
        q7.opcaoA = "A) Link.";
        q7.opcaoB = "B) Skull Kid.";
        q7.opcaoC = "C) Zant.";
        q7.opcaoD = "D) Ganon.";
        q7.opcaoE = "E) Veran.";
        q7.correta = "D";

        Questao q8 = new Questao();
        q8.pergunta = "8) Em qual jogo da franquia Mega Man ocorreu a primeira aparição do cão robótico Rush?";
        q8.opcaoA = "A) Mega Man 2.";
        q8.opcaoB = "B) Mega Man 7.";
        q8.opcaoC = "C) Mega Man 3.";
        q8.opcaoD = "D) Mega Man 5.";
        q8.opcaoE = "E) Mega Man 8.";
        q8.correta = "C";

        Questao q9 = new Questao();
        q9.pergunta = "9) Qual o apelido dado aos 4 fantasmas que perseguem Pac Man em seus jogos?";
        q9.opcaoA = "A) Tinky, Blinky, Clyde e Skeet";
        q9.opcaoB = "B) Blinky, Pinky, Inky e Clyde.";
        q9.opcaoC = "C) Inky, Tinky, Winky e Pinky.";
        q9.opcaoD = "D) Inky, Skeet, Blinky e Boome.";
        q9.opcaoE = "E) Boome, Clyde, Skeet e Pinky.";
        q9.correta = "B";

        Questao q10 = new Questao();
        q10.pergunta = "10) No primeiro Contra lançado em 1987, quantas fases o jogador deveria concluír para" +
                "finalmente finalizar o jogo?";
        q10.opcaoA = "A) 8 Fases";
        q10.opcaoB = "B) 6 Fases.";
        q10.opcaoC = "C) 5 Fases.";
        q10.opcaoD = "D) 4 Fases.";
        q10.opcaoE = "E) 7 Fases.";
        q10.correta = "E";

        Questao q11 = new Questao();
        q11.pergunta = "11) Qual o nome da dupla de protagonistas que podem ser escolhidos pelo jogador no" +
                " primeiro jogo da franquia Resident Evil lançado em 1996?";
        q11.opcaoA = "A) Chris Redfield e Jill Valentine.";
        q11.opcaoB = "B) Ada Wong e Albert Wesker.";
        q11.opcaoC = "C) Jill Valentine e Leon S. Kennedy.";
        q11.opcaoD = "D) Leon S. Kennedy e Ada Wong";
        q11.opcaoE = "E) Chris Redfield e Ada Wong.";
        q11.correta = "A";

        Questao q12 = new Questao();
        q12.pergunta = "12) A franquia GTA já conta com diversos jogos lançados e teve sua origem como um" +
                " jogo 2D. Em qual título da franquia ouve essa mudança para gráficos em 3D?";
        q12.opcaoA = "A) GTA 2.";
        q12.opcaoB = "B) GTA Vice City.";
        q12.opcaoC = "C) GTA IV.";
        q12.opcaoD = "D) GTA III";
        q12.opcaoE = "E) GTA San Andreas.";
        q12.correta = "D";

        Questao q13 = new Questao();
        q13.pergunta = "13) Na história do primeiro jogo da franquia The King of Fighters (TKOF '94), qual foi" +
                " o trio responsável por derrotar Rugal no final do torneio?";
        q13.opcaoA = "A) Kim Kaphwan, Chang Koehan e Choi Bounge.";
        q13.opcaoB = "B) Athena Asamiya, Sie Kensou e Chin Gentsai.";
        q13.opcaoC = "C) Terry Bogard, Andy Bogard e Joe Higashi.";
        q13.opcaoD = "D) Yuri Sakazaki, Mai Shiranui e King.";
        q13.opcaoE = "E) Kyo Kusanagi, Benimaru Nikaido e Goro Daimon.";
        q13.correta = "E";

        Questao q14 = new Questao();
        q14.pergunta = "14) No jogo Gradius de 1986 os desenvolvedores acidentalmente deixaram na versão final" +
                " um código que era usado para testes no jogo. Esse código acabou se popularizando e ficou conhecido" +
                " como:";
        q14.opcaoA = "A) Arcade Code.";
        q14.opcaoB = "B) Konami Code.";
        q14.opcaoC = "C) God Mode Code.";
        q14.opcaoD = "D) Cheat Code.";
        q14.opcaoE = "E) Developer Code.";
        q14.correta = "B";

        Questao q15 = new Questao();
        q15.pergunta = "15) A franquia Kirby do memóravel protagonista rosado teve seu primeiro jogo lançado em " +
                "1992. Qual foi o título dado a esse jogo?";
        q15.opcaoA = "A) Kirby's Adventure.";
        q15.opcaoB = "B) Kirby Super Star.";
        q15.opcaoC = "C) Kirby's Dream Land.";
        q15.opcaoD = "D) Kirby Star Allies.";
        q15.opcaoE = "E) Kirby & the Amazing Mirror.";
        q15.correta = "C";

        int acertos;

        acertos = 0;

        q1.escrevaQuestao();
        if (q1.isCorreta(q1.leiaResposta())) {
            acertos += 1;
        }

        q2.escrevaQuestao();
        if (q2.isCorreta(q2.leiaResposta())) {
            acertos += 1;
        }

        q3.escrevaQuestao();
        if (q3.isCorreta(q3.leiaResposta())) {
            acertos += 1;
        }

        q4.escrevaQuestao();
        if (q4.isCorreta(q4.leiaResposta())) {
            acertos += 1;
        }

        q5.escrevaQuestao();
        if (q5.isCorreta(q5.leiaResposta())) {
            acertos += 1;
        }

        q6.escrevaQuestao();
        if (q6.isCorreta(q6.leiaResposta())) {
            acertos += 1;
        }

        q7.escrevaQuestao();
        if (q7.isCorreta(q7.leiaResposta())) {
            acertos += 1;
        }

        q8.escrevaQuestao();
        if (q8.isCorreta(q8.leiaResposta())) {
            acertos += 1;
        }

        q9.escrevaQuestao();
        if (q9.isCorreta(q9.leiaResposta())) {
            acertos += 1;
        }

        q10.escrevaQuestao();
        if (q10.isCorreta(q10.leiaResposta())) {
            acertos += 1;
        }

        q11.escrevaQuestao();
        if (q11.isCorreta(q11.leiaResposta())) {
            acertos += 1;
        }

        q12.escrevaQuestao();
        if (q12.isCorreta(q12.leiaResposta())) {
            acertos += 1;
        }

        q13.escrevaQuestao();
        if (q13.isCorreta(q13.leiaResposta())) {
            acertos += 1;
        }

        q14.escrevaQuestao();
        if (q14.isCorreta(q14.leiaResposta())) {
            acertos += 1;
        }

        q15.escrevaQuestao();
        if (q15.isCorreta(q15.leiaResposta())) {
            acertos += 1;
        }

        System.out.println("Você concluiu o Questionário de Jogos Clássicos! Espero que tenha se divertido!");
        System.out.println("Você acertou " + acertos + " de 15 questões!");

    }

}


