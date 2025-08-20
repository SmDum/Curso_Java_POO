package Aula3;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p) { // Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
