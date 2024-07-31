package contabanco; 

public class Conta {
    // atributos
    public int numConta ;
    protected String tipo = "";
    private String dono = "";
    private float saldo ;
    private boolean status;
    //métodos construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    //métodos

  
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void setNumConta(int c) {
        this.numConta = c;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return this.dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setStatus(boolean sta) {
        this.status = sta;
    }
    public boolean getStatus() {
        return this.status;
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
                System.out.println("Conta Corrente aberta com sucesso. Saldo inicial: R$ " + this.getSaldo());
        } else if (t.equals("cp")) {
            this.setSaldo(150);
            System.out.println("Conta Poupança aberta com sucesso. Saldo inicial: R$ " + this.getSaldo());
        }else {
            this.setStatus(false);
            System.out.println("Tipo de conta inválido. Por favor, use 'cc' para Conta Corrente ou 'cp' para Conta Poupança.");
        }       
    }
    public void fecharConta() {
    if (this.getSaldo() > 0) {
        System.out.println("Não é possível fechar a conta, ainda há dinheiro na conta.");
    } else if (this.getSaldo() < 0) {
        System.out.println("Não é possível fechar a conta, a conta está em débito.");
    } else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso");
    }
}
    public void depositar(float d) {
      if (this.getStatus()) {
          this.setSaldo(this.getSaldo() + d);
          System.out.println("Deposito de R$: " + d + " realizado na conta de " + this.getDono());
      } else {
          System.out.println("conta fechada");
      }
         
    }
    public void sacar(float s) {
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque de R$: " + s + " realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saque de R$: " + s + " é incompatível com saldo");
            }
        }else {
            System.out.println("impossível sacar de uma conta fechada");
        }
    }
    public void mensalidade(int m) {
        int mens = 0;
        if (this.getTipo() == "cc") {
            mens = 12;
        } else if(this.getTipo() == "cp") {
            mens = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - mens);
            System.out.println("mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível pagar a mensalidade");
        }
    }
    }



