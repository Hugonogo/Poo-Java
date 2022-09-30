public class Metalurgico extends Funcionario{
    private int pecasProduzidas;
    private double percPorPeca;
    private double addInsalubridade;
    
    public Metalurgico(String nome, String sexo, int idade, double salarioBase, int pecasProduzidas, double percPorPeca,
            double addInsalubridade) {
        super(nome, sexo, idade, salarioBase);
        this.pecasProduzidas = pecasProduzidas;
        this.percPorPeca = salarioBase * (percPorPeca * pecasProduzidas);
        this.addInsalubridade = salarioBase * addInsalubridade;
    }
    public Metalurgico() {
    }

    @Override
    public double calcSalario() {
        
        return super.calcSalario() + getAddInsalubridade() * getPercPorPeca();
    }

    @Override
    public String toString() {
      
        return super.toString()+"\nCargo: Metalurgioco";
    }

    public int getPecasProduzidas() {
        return pecasProduzidas;
    }
    public void setPecasProduzidas(int pecasProduzidas) {
        this.pecasProduzidas = pecasProduzidas;
    }
    public double getPercPorPeca() {
        return percPorPeca;
    }
    public void setPercPorPeca(double percPorPeca) {
        this.percPorPeca = percPorPeca;
    }
    public double getAddInsalubridade() {
        return addInsalubridade;
    }
    public void setAddInsalubridade(double addInsalubridade) {
        this.addInsalubridade = addInsalubridade;
    }


}
