package exercicio10enum;

public enum StatusConta {
    ATIVA("Conta ativa."),
    BLOQUEADA("Conta bloqueada."),
    CANCELADA("Conta cancelada.");

    private String descricao;

    StatusConta(String descricao){
        this.descricao = descricao;
    }

    public String getDescricaoStatusConta(){
        return descricao;
    }


}
