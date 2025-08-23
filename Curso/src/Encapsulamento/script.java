package Encapsulamento;


public class script{
    public static void main(String[] args)
    {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
