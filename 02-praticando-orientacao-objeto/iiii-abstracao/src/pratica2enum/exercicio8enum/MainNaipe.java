package pratica2enum.exercicio8enum;

public class MainNaipe {
    public static void main(String[] args) {
        //tranaformar enum numa lista
        Naipe[] listaNaipe = Naipe.values(); // agora eu tenho um array, uma lista contendo os naipes com suas cores.
        // Agora vou precisar acessar cada elemento da minha lista e imprimir a cor de cada elemento desse.
        // agora n é a minha lista contendo todos os nipes.
        for(Naipe elementoDaListaNaipe : listaNaipe){
            System.out.println(elementoDaListaNaipe + ": " + elementoDaListaNaipe.getCorNaipe());
        }
    }
}
