import java.util.ArrayList;

public class ControleAvancado extends Controle {

    public static void selecionarCaminhaoMaisApto() {
        String tipoCaminhao;
        String melhorTipo = "";
        ArrayList<String> melhorLista = new ArrayList<>();
        int maiorSoma = -1;

        while (true) {
            tipoCaminhao = leString("\nDigite o tipo do caminhão (Alfa/Beta ou 'Fim' para sair): "); //ao terminar de digitar os caminhões vc digita "fim" pra ver os listados

            if (tipoCaminhao.equalsIgnoreCase("Fim")) {
                break;
            }

            int qtdPluviometros = leInteiro("Quantos pluviômetros esse caminhão carrega? ");
            ArrayList<String> listaPluviometros = new ArrayList<>();
            int somaCapacidade = 0;

            for (int i = 0; i < qtdPluviometros; i++) {
                String tipo = leString("Tipo do pluviômetro " + (i + 1) + ": ");
                listaPluviometros.add(tipo);

    
                if (tipo.equalsIgnoreCase("Grande")) {
                    somaCapacidade += 5;
                } else if (tipo.equalsIgnoreCase("Médio")) {
                    somaCapacidade += 3;
                } else {
                    somaCapacidade += 1; 
                }
            }

            if (somaCapacidade > maiorSoma) {
                maiorSoma = somaCapacidade;
                melhorTipo = tipoCaminhao;
                melhorLista = listaPluviometros;
            }
        }

        System.out.println("\n=== Caminhão mais apto ===");
        int melhorSoma = 0;
        if (melhorSoma == -1) {
            System.out.println("Nenhum caminhão foi cadastrado.");
        } else {
            System.out.println("Tipo: " + melhorTipo);
            System.out.println("Pluviômetros transportados:");
            for (String p : melhorLista) {
                System.out.println("- " + p);
            }
        }
    }
}
