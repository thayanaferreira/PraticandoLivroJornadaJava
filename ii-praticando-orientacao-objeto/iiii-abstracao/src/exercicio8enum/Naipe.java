package exercicio8enum;

public enum Naipe {
    COPAS("vermelho"), OURO("vermelho"), ESPADAS("preto"), PAUS("preto");

    private String cor;

    //construtor
    Naipe(String cor) {
        this.cor = cor;
    }

    public String getCorNaipe(){
        return cor;
    }
}
