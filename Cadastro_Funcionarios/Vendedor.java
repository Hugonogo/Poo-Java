public class Vendedor extends Funcionario{
    private double percComissao;

    public Vendedor() {
    }

    public Vendedor(String nome, String sexo, int idade, double salarioBase, double percComissao) {
        super(nome, sexo, idade, salarioBase);
        this.percComissao = salarioBase * percComissao;
    }

    @Override
    public double calcSalario() {
        return super.calcSalario() + percComissao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Vendedor";
    }

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }
}
