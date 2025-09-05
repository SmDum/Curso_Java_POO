package Heranca;

public class main {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(1111);
        System.out.println(a1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Cláudio");
        p1.setIdade(39);
        p1.setSexo("M");
        p1.setEspecialidade("Java");
        p1.setSalario(2500.75f);
        System.out.println(p1.toString());
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setIdade(30);
        f1.setSexo("F");
        f1.setSetor("Estoque");
        f1.setTrabalhando(true);
        System.out.println(f1.toString());
    }
}
