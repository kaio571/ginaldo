public class Voo {
    protected int numero;
    protected String data;
    protected boolean[] cadeiras;

    public Voo(int numero, String data, int maxVagas) {
        this.numero = numero;
        this.data = data;
        this.cadeiras = new boolean[maxVagas]; // todas livres (false)
    }

    public int proximoLivre() {
        for (int i = 0; i < cadeiras.length; i++) {
            if (!cadeiras[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public boolean verifica(int cadeira) {
        if (cadeira >= 1 && cadeira <= cadeiras.length) {
            return !cadeiras[cadeira - 1];
        }
        return false;
    }

    public boolean ocupa(int cadeira) {
        if (verifica(cadeira)) {
            cadeiras[cadeira - 1] = true;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Voo " + numero + " na data " + data;
    }
}
