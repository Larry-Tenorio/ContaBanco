package contabanco;
public class ContaBanco {
    public static void main(String[] args) {
    Conta p1 = new Conta();
    p1.setNumConta(1111);
    p1.setDono("Jubileu");
    p1.abrirConta("cc");
    p1.depositar(100);
    p1.estadoAtual();
    
    
    
    Conta p2 = new Conta();
    p2.setNumConta(2222);
    p2.setDono("Creusa");
    p2.abrirConta("cp");
    p2.sacar(50);
    p2.fecharConta();
    p2.estadoAtual();
    
    
    
    Conta p3 = new Conta();
    p3.setNumConta(3333);
    p3.setDono("Malakoi");
    p3.abrirConta("cs");
    p3.estadoAtual();
    }
    
   
    
}
