package pratica2enum.exercicio7enum;

public enum Meses {
    JANEIRO(31), FEVEREIRO(28), MARCO(31), ABRIL(30), MAIO(31), JUNHO(30), JULHO(30), AGOSTO(31), SETEMBRO(30), OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);

    private final int quantidadeDias;

    Meses(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
}
