package Aula4;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
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

    public String getFono() {
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
            setSaldo(50.0f);
        } else if(tipo.equals("CP")) {
            setSaldo(150.0f);
        }
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, ainda há dinheiro nela.");
        
        }else if (getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, ainda há débito.");
        
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (getStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + getSaldo());
        } else {
            System.out.println("Conta fechada. Não é possível depositar.");
        }
    }

    public void sacar(float valor) {
        if (getStatus()) {
            if (getSaldo() >= valor) {
                System.out.println("Saque realizado com sucesso. Valor sacado: " + valor);
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    }

    public void pagarMensal() {
        int mensalidade = 0;
        if(getTipo().equals("CC")) {
            mensalidade = 12;
        } else if(getTipo().equals("CP")) {
            mensalidade = 20;
        }

        if(getStatus()) {
            setSaldo(getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso. Saldo atual: " + getSaldo());
        } else {
            System.out.println("Não é possível pagar mensalidade.");
        }
    }
    
}
