public class CD extends Midia{
    private int nMusicas;
    

    public CD(int cod, double preco, String nome, int nMusicas) {
        super(cod, preco, nome);
        this.nMusicas = nMusicas;
    }

    public CD() {}
    
    @Override
    public String getTipo() {
        
        return super.getTipo()+"CD";
    }

    @Override
    public String getDetalhes() {
        
        return super.getDetalhes() + " - Número de músicas: "+this.nMusicas;
    }

    @Override
    public void inserirDados() {
      
        super.inserirDados();
        System.out.print("Insira o número de musicas: ");
        this.nMusicas = super.input.nextInt();
        input.nextLine();
        setMusica(getnMusicas());
    }

    public void setMusica(int m){
        String[] l = new String[m];
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            cont = i+1;
            System.out.print("Música "+cont+": ");
            l[i] = super.input.nextLine();
        }
        
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

}
