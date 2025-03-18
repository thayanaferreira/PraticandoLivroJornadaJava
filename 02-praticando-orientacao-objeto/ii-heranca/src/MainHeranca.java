public class MainHeranca {
    public static void main(String[] args){
        Professor professor = new Professor("Thay", 32, 25000);
        professor.fazerAniversario();
        Aluno3 aluno = new Aluno3("Clarisse", 12, "6ª");
        aluno.fazerAniversario();

        // System.out.println("idade professor antes niver: " + professor.getIdade());
        System.out.println("idade professor PÓS niver: " + professor.getIdade());
        System.out.println("idade aluno PÓS niver: " + aluno.getIdade());
    
        // System.out.println(professor.getNome());
        // System.out.println(aluno.getNome());
    }
}
