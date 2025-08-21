package Aula4;

public class Aula04 {

    public static void main(String[] args) {
        // Criando uma conta bancária
        Banco p1 = new Banco();

        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);


        Banco p2 = new Banco();

        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);


        p1.estadoAtual();
        p2.estadoAtual();
    }
}
