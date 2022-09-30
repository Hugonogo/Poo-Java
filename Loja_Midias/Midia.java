import java.util.Scanner;

public class Midia {
    Scanner input = new Scanner(System.in);
    private int cod;
    private double preco;
    private String nome;

    public Midia(int cod, double preco, String nome) {
        this.cod = cod;
        this.preco = preco;
        this.nome = nome;
    }

    public Midia() {
    }

    public String getTipo(){
        return "Midia: ";
    }
    public String getDetalhes(){
        return "Nome: "+getNome()+" - Código: "+getCod()+" - Preço: "+getPreco();
    }

    public void printDados(){
        System.out.println("Tipo de "+getTipo()+" - "+getDetalhes());
    }

    public void inserirDados(){
        
            System.out.print("Digite o nome do produto: ");
            this.nome = this.input.nextLine();
            System.out.print("\nDigite o código do produto: ");
            this.cod = this.input.nextInt();
            System.out.print("\nDigite o preço do produto: ");
            this.preco = this.input.nextDouble();
            input.nextLine();


    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
