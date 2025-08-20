package Aula3;

public class Aula03 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta("Bic", "Azul", 0.7f);
       c1.setModelo("Bic");
       c1.setPonta(0.5f);
       c1.status();

       System.out.println("Tenho uma caneta " + c1.getModelo() + " com ponta " + c1.getPonta());

       System.out.println("--------------------");

        Caneta c2 = new Caneta("Faber-Castell", "Preta", 0.9f);
        c2.status();
    }
}

