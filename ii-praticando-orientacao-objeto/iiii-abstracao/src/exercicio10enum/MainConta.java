package exercicio10enum;

public class MainConta {
    public static void main(String[] args) {
        System.out.println("----------------- FORMA 1 -----------------");
        System.out.println("Status " + StatusConta.ATIVA + ": " +StatusConta.ATIVA.getDescricaoStatusConta());
        System.out.println("Status " + StatusConta.BLOQUEADA + ": " +StatusConta.BLOQUEADA.getDescricaoStatusConta());
        System.out.println("Status " + StatusConta.CANCELADA + ": " +StatusConta.CANCELADA.getDescricaoStatusConta());

        System.out.println("----------------- FORMA 2 -----------------");
        StatusConta[] st = StatusConta.values();
        for(StatusConta stDesc: st){
            System.out.println("Status " + stDesc + ": "+ stDesc.getDescricaoStatusConta());
        }

    }
}
