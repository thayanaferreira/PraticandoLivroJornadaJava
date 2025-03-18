class Saudacao {
    void dizerOla() {
        System.out.println("Olá, mundo!");
    }
}

public class Pratica3classeAnonimaComClassesConcretas {
    public static void main(String[] args) {
        // Criando uma classe anônima que sobrescreve dizerOla()
        Saudacao saudacao = new Saudacao() {
            @Override
            void dizerOla() {
                System.out.println("Oi, Java!");
            }
        };

        saudacao.dizerOla(); // Saída: Oi, Java!
    }
}
