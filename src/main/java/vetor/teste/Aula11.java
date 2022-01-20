package vetor.teste;

import vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

        vetor.adiciona(c1);
    }

}
