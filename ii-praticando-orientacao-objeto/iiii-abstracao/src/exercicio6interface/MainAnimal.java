package exercicio6interface;

public class MainAnimal {
    public static void main(String[] args) {
        IAnimal[] animais = {new Cachorro(), new Gato()};

        
        //System.out.println(animais.length); =2
        System.out.println("~~~~~~~~~~~~~~~~~~~ loop forma 1 ~~~~~~~~~~~~~~~~~~~");
        for (IAnimal a : animais){
            a.emitirSom();
        }

        // ou

        System.out.println("~~~~~~~~~~~~~~~~~~~ loop forma 2 ~~~~~~~~~~~~~~~~~~~");
        for(int i=0; i < animais.length; i++ ){    
            animais[i].emitirSom();
            // IAnimal posicaoListaAnimal = animais[i];
            // posicaoListaAnimal.emitirSom();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        /*
         * for(inicialização; condição; incremento){}
         */
        

    }
}
