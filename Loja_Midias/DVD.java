

public class DVD extends Midia{
    public int nFaixas;
    
    

    public DVD() {
    }

    public DVD(int cod, double preco, String nome, int nFaixas) {
        super(cod, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return super.getTipo()+"DVD";
    }

    @Override
    public String getDetalhes() {
        
        return super.getDetalhes() + " - Número de Faixas: "+this.nFaixas+"\nFaixas: ";
    }

    public void setFaixas(int n){
        this.nFaixas = n;
        int cont = 0;
        String[] f = new String[n];
        
            for (int i = 0; i < n; i++) {
                cont = i + 1;
                System.out.print("Digite a faixa numero "+cont+": ");
                
                f[i] = this.input.nextLine();
                System.out.println();

                
            }
        
        setnFaixas(nFaixas);
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
       
        System.out.print("Entre com o numero de faixas: ");
        this.nFaixas = super.input.nextInt();
        super.input.nextLine();
    
        setFaixas(getnFaixas());
 
    }


    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
}
