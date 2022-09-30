public class Cliente {
    private CarrinhoDeCompras carrin;
    private double carteira;


    public Cliente() {
    }

    public Cliente(CarrinhoDeCompras carrin, double carteira) {
        this.carrin = carrin;
        this.carteira = carteira;
    }

    public void pagar(){
        double p = 0;
        if (this.carteira > this.carrin.getValorConta() ) {
            p = this.carteira - this.carrin.getValorConta(); 
            System.out.println("Pago!!!\nCarteira: "+p);
        }else{System.out.println("Não há dinheiro suficiente!");}
       

    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public CarrinhoDeCompras getCarrin() {
        return carrin;
    }

    public void setCarrin(CarrinhoDeCompras carrin) {
        this.carrin = carrin;
    }
}
