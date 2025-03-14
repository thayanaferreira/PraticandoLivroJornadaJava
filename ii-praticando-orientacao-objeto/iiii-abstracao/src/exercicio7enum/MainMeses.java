package exercicio7enum;

public class MainMeses {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~resolução exercício~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //resolução do exercício 1: mostrar quantidade de dias do mes específico
        Meses m = Meses.JANEIRO;
        System.out.println(m.getQuantidadeDias());

        System.out.println("~~~~~~~~~~~~~~Desafio pessoal: como imprimir todos os meses?~~~~~~~~~~~~~~");
        //como imprimo todos os meses de uma vez? for tradicional
        Meses[] mm = Meses.values();
        for(int i=0; i<mm.length; i++){
            System.out.println(mm[i] + ": " + Integer.toString(mm[i].getQuantidadeDias()) +" Dias");
        } //peneeeeei, mas foi, uhúuuuuuuuú

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~for otimizado~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        //Meses[] m = Meses.values();
        for (Meses mes : mm) { //mes = m[0]; mes é a posição da lista m
            System.out.println(mes + ": " + Integer.toString(mes.getQuantidadeDias()) +" Dias");
        }


    }

}
