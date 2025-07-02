public class Main {
    public static void main(String[] args) {
        VooComFumantes voo = new VooComFumantes(123, "10/10/2025", 10, 3);

        System.out.println(voo);

        System.out.println("Próxima vaga livre: " + voo.proximoLivre());

        for (int i = 1; i <= voo.maxVagas(); i++) {
            System.out.println("Cadeira " + i + ": tipo " + voo.tipo(i) + ", livre? " + voo.verifica(i));
        }

        voo.ocupa(2);
        voo.ocupa(9);

        System.out.println("\nApós ocupar algumas cadeiras:");
        for (int i = 1; i <= voo.maxVagas(); i++) {
            System.out.println("Cadeira " + i + ": tipo " + voo.tipo(i) + ", livre? " + voo.verifica(i));
        }
    }
}
