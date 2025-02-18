public class FabricaPessoas {

    public static void main(String[] args) {
        // criando duas pessoas
        Pessoa pessoa1 = new Pessoa("Maria");
        Pessoa pessoa2 = new Pessoa("Paulo");
        
        // alternando a idade das pessoas
        pessoa1.setIdade(20);
        pessoa2.setIdade(-1); //imprime a idade 18, pois é maior que zero
        //pessoa2.setIdade(-15); //imprime a idade 0, pois "-15" é menor que zero, não entrando no if.
    
        //imprimindo a idade das pessoas
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa2.getIdade());
    }
}
