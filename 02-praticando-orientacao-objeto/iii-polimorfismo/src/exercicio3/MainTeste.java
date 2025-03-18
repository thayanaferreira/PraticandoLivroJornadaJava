package exercicio3;

public class MainTeste {
        public static void main(String[] args) {
            Pai obj = new Filho();
            obj.metodo(); // O que acontece aqui?
        }
}

/* 

1- O que acontece na linha 20?
    minha primeira resposta:
    Ocorre o seguinte erro ao executar o código: "The method metodoFilho() is undefined for the type teste.Pai"
    Está sendo chamado um método da classe filha que não está implementado como uma sobrescrição, o método metodoFilho 
    só existe na classe filha então ele não é reconhecido. é como se não existisse, pois somente são executados métodos 
    da classe principal ou sobrescrições na classe filha.  

    Após a correção do exercicio, meu novo entendimento:
    A variável obj tem como referência a classe Pai, então só são acessiveis os métodos da classe Pai, como o método 
    metodoFilho havia sido implementado na classe Filho, então não era visivel e o erro apontava que tal método nao 
    existia na classe Pai.

2- O que precisa ser feito para corrigir?
    Alterar o nome dos metodos, para ter um nome só. 
    E na sobscrição em Filho, adicionar @Override.
    O @Override não é obrigatório, mas ajuda muito, se ele tivesse sido usado antes dessa correção,
    o próprio compilador ja avisaria desse erro.
*/
