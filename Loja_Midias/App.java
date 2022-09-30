
public class App {
    public static void main(String[] args) throws Exception {
       Midia[] dvd = new DVD[2];
       Midia[] cd = new CD[1];
       CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
       Cliente c1 = new Cliente(carrinho, 200);

       System.out.println("Lista de Compras");
        
       for (int i = 0; i < dvd.length; i++) {
            dvd[i] = new DVD();
            dvd[i].inserirDados();
        }

        for (int i = 0; i < cd.length; i++) {
            cd[i] = new CD();
            cd[i].inserirDados();
        }
        System.out.println();
        for (int i = 0; i < dvd.length; i++) {
            dvd[i].printDados();
            System.out.println();
        }
        for (int i = 0; i < cd.length; i++) {
            cd[i].printDados();
            System.out.println();
        }
        System.out.println("\nValor da conta: "+carrinho.valorFinal(dvd, cd)); 
        System.out.println("-----------");
        c1.pagar();
       
    }
}
