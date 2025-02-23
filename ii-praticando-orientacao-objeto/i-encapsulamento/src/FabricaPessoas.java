public class FabricaPessoas {

    public static void main(String[] args) {
        // criando duas pessoas
        Pessoa2 p1 = new Pessoa2("Maria");
        Pessoa2 p2 = new Pessoa2("Paulo");
        
        // alternando a idade das pessoas
        p1.setIdade(20);
        p2.setIdade(-1); //imprime a idade 18, pois é maior que zero
        //pessoa2.setIdade(-15); //imprime a idade 0, pois "-15" é menor que zero, não entrando no if.
    
        //imprimindo a idade das pessoas
        System.out.println(p1.getIdade());
        System.out.println(p2.getIdade());
    }
}
