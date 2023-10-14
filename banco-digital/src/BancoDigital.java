public class BancoDigital {

    public static void main(String[] args) {


        Endereco enderecoDiogo = new Endereco(
                "Rua José Alceu Sabatke",
                "154", "G33",
                "81910730", "Curitiba", "Brasil");
        Cliente diogo = new Cliente(
                "03120727911",
                "Diogo",
                "Lucas de Oliveira",
                enderecoDiogo);

        System.out.println(diogo);
    }

}
