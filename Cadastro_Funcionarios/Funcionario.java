

public class Funcionario {
    private String nome, sexo;
    private int idade;
    private double salarioBase;
  
    public Funcionario() {}

    public Funcionario(String nome, String sexo, int idade, double salarioBase) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    public double calcSalario(){
        return this.salarioBase;
    }

    @Override
    public String toString(){
        
        return "\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo()+"\nSalario: "+
        calcSalario();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


}
