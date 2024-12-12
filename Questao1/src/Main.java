public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("João", 25);

        System.out.println("=== Dados do Triatleta ===");
        triatleta.exibirDados();

        System.out.println("\n=== Atividades ===");
        triatleta.nadar();
        triatleta.correr();
        triatleta.pedalar();
        triatleta.competir();
    }
}
