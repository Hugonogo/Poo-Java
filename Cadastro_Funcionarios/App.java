public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] cadastro = new Funcionario[4];
        cadastro[0] = new Metalurgico("Luiz Pereira Marx", "M", 36, 1212, 20, 0.001, 0.2);
        cadastro[1] = new Montador("Pedro Alcantare Mello", "M", 28, 1212, 0.02);
        cadastro[2] = new Metalurgico("Larissa Taskov", "F", 19, 1212, 30, 0.001, 0.2);
        cadastro[3] = new Vendedor("Luana Madalena dos Santos", "F", 21, 1212, 0.05);

        for (int index = 0; index < cadastro.length; index++) {
            System.out.println(cadastro[index].toString());

        }
        
    }
}
