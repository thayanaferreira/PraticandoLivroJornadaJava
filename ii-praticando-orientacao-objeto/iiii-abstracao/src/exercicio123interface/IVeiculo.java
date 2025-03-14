    package exercicio123interface;

    public interface IVeiculo {
        //Métodos abstratos, devem ser obrigatoriamente implementados na classe.
        //É implícito que é um método abstrato é público
        void acelerar();
        void frear();

        //método default, pode ser sobrescrito na classe.
        default void businar(){
            System.out.println("Bii Bii!");
        }

        //method static é chamado diretamente na main: IVeiculo.ehMotorizado
        static boolean ehMotorizado(){
           return true;
        }
    }
