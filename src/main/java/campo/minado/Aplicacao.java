package campo.minado;

import campo.minado.modelo.Tabuleiro;
import campo.minado.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(9,9,7);

        new TabuleiroConsole(tabuleiro);

    }
}
