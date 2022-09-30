

public class CarrinhoDeCompras {

    private Midia midia;
    private double valorConta;
    

    public CarrinhoDeCompras() {
    }

    public CarrinhoDeCompras(Midia midia, double valorConta) {
        this.midia = midia;
        this.valorConta = valorConta;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public double valorFinal(Midia[] m, Midia[] n){
     
        for (int i = 0; i < m.length; i++) {
           this.valorConta += m[i].getPreco();
        }
        for (int i = 0; i < n.length; i++) {
            this.valorConta += n[i].getPreco();
        }
        return this.valorConta;
  
    }
    
}
