public interface Veiculo {
    void acelerar();
    void frear();
}

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
    
    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}

public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }
    
    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}

public interface VeiculoComBuzina extends Veiculo {
    default void buzinar() {
        System.out.println("Bii Bii!");
    }
    
    static boolean ehMotorizado() {
        return true;
    }
}

public interface Eletronico {
    void ligar();
}

public interface Conectavel {
    void conectarWiFi();
}

public class Smartphone implements Eletronico, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Smartphone ligado.");
    }
    
    @Override
    public void conectarWiFi() {
        System.out.println("Smartphone conectado ao Wi-Fi.");
    }
}

public interface Aparelho {
    default void desligar() {
        System.out.println("Desligando o aparelho.");
    }
}

public interface Dispositivo {
    default void desligar() {
        System.out.println("Desligando o dispositivo.");
    }
}

public class Tablet implements Aparelho, Dispositivo {
    @Override
    public void desligar() {
        System.out.println("Desligando o tablet.");
    }
}

public interface Animal {
    void emitirSom();
}

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        
        carro.acelerar();
        carro.frear();
        
        moto.acelerar();
        moto.frear();
        
        Smartphone smartphone = new Smartphone();
        smartphone.ligar();
        smartphone.conectarWiFi();
        
        Tablet tablet = new Tablet();
        tablet.desligar();
        
        Animal[] animais = {new Cachorro(), new Gato()};
        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}
