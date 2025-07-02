public class VooComFumantes extends Voo {
    private int cadeirasFumantes;

    public VooComFumantes(int numero, String data, int maxVagas, int cadeirasFumantes) {
        super(numero, data, maxVagas);
        this.cadeirasFumantes = cadeirasFumantes;
    }

    public int maxVagas() {
        return cadeiras.length;
    }

    public int cadeirasFumantes() {
        return cadeirasFumantes;
    }

    public char tipo(int cadeira) {
        if (cadeira < 1 || cadeira > cadeiras.length) {
            return '-';
        }

        int primeiraFumante = cadeiras.length - cadeirasFumantes + 1;
        if (cadeira >= primeiraFumante) {
            return 'F';
        } else {
            return 'N';
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Vagas: " + maxVagas() + " | Fumantes: " + cadeirasFumantes;
    }
}
