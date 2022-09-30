public class Montador extends Funcionario{
    private double ajudaCusto;

    public Montador(String nome, String sexo, int idade, double salarioBase, double ajudaCusto) {
        super(nome, sexo, idade, salarioBase);
        this.ajudaCusto = salarioBase * ajudaCusto;
    }
    @Override
    public double calcSalario() {
        
        return super.calcSalario() + ajudaCusto;
    }

    @Override
    public String toString() {
    
        return super.toString() + "\nCargo: Montador";
    }
    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
}
