
package Treinamento_Condicional;

import java.util.Scanner;

public class QuantidadeDeHorasDeJogo {

    public static void main(String arg[]) {
        Scanner leitor = new Scanner(System.in);

        int horaInicial = leitor.nextInt();
        int horaFinal = leitor.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        leitor.close();

    }

}
