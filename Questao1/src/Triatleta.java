public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {

    public Triatleta(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    @Override
    public void pedalar() {
        System.out.println(nome + " está pedalando.");
    }

    public void competir() {
        System.out.println(nome + " está competindo no triatlo!");
    }
}