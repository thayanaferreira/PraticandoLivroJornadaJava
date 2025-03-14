package exercicio9enum;

public enum OperacaoMatematica {
    SOMA('+'), SUBTRACAO('-'), MULTIPLICACAO('*'), DIVISAO('/');

    private final char simbolo;

    OperacaoMatematica(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo(){
        return simbolo;
    }

    public int fazCalculo(int numero1, int numero2) {
        int resultado=0;
        return switch (simbolo){
            case '+' -> numero1 + numero2;
            case '-' -> numero1 - numero2;
            case '*' -> numero1 * numero2;
            case '/' -> numero1 / numero2; //optei por não colocar tratamento para resultados menores que zero.
            default -> resultado;
        };
    }
}