package Aula4;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        this.saldo = 0.0f; // Inicializa o saldo como zero
        this.status = false; // Inicializa o status como fechado
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("CC"))
        {
            this.setSaldo(50.0f);
        } else if(tipo.equals("CP")) {
            this.setSaldo(150.0f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, ainda há dinheiro nela.");
        
        }else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, ainda há débito.");
        
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de" + this.getDono() + ". Saldo atual: " + getSaldo());
        } else {
            System.out.println("Conta fechada. Não é possível depositar.");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono() + ". Valor sacado: " + valor);
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    }

    public void pagarMensal() {
        int mensalidade = 0;
        if(this.getTipo().equals("CC")) {
            mensalidade = 12;
        } else if(this.getTipo().equals("CP")) {
            mensalidade = 20;
        }

        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso. Saldo atual: " + getSaldo());
        } else {
            System.out.println("Não é possível pagar mensalidade.");
        }
    }

    public void status() {
        System.out.println("=== DADOS DA CONTA ===");
        System.out.println("Número: " + this.getNumConta());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada"));
        System.out.println("========================");
    }
    
}
