

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    
        Lista l1 = new Lista();
        try (Scanner input = new Scanner(System.in)) {
            int op = 1;
            int cont = 0;
            while (op == 1 ) {   
               
                System.out.println("Deseja Inserir um número?\n(1)-sim\n(Qualquer outro número)-não");
                System.out.print("-->");
                op = input.nextInt();
                if (op == 1) {
                    System.out.print("Digite um número para a posição "+cont+": ");
                    l1.elem[cont] = input.nextInt();
                    l1.n++;
                    cont++;
                    tam(l1);
                     if (cont == 6) {
                        break;
                    }
                    System.out.println("=====================");
                
                }
                    
            }
                System.out.println();
                exibir(l1);
                System.out.println();
                int a;
                int pos;
                
                
               
                while (true) {                
                    System.out.print("O que você deseja?\n1-(Adicionar um elemento à lista)\n2-(Excluir um elemento da lista)\n3-(Buscar na lista)\n4-(Soma e média dos elementos da lista)\n5-(Buscar o maior e o menor elemento da lista)\n6(Bair)\n-->");
                    op = input.nextInt();
                    if (op == 1) {
                        System.out.print("Digite o Valor que deseja adicionar e sua posição respectivamente:");
                        a = input.nextInt();
                        pos = input.nextInt();
                        add(l1, a, pos);
                        exibir(l1);
                        System.out.println();
                     
                    }
                    if (op == 2) {
                        System.out.print("Digite a posição que deseja remover um valor: ");
                        pos = input.nextInt();
                        excluir(l1, pos);
                        exibir(l1);
                        System.out.println();
                    }
                    if (op == 3) {
                        
                        System.out.print("O que deseja fazer?\n(1)-Exibir o tamanho da lista\n(2)-Exibir o elemento pela posição\n(3)-Exibir a posição pelo elemento\n-->");
                        op = input.nextInt();
                        if (op == 1) {
                            tam(l1);
                        }
                        if (op == 2) {
                            System.out.println();
                            exibir(l1);
                            
                            System.out.print("\nDigite a posição: ");
                            pos = input.nextInt();
                            acessarValor(l1, pos);
                        }
                        if (op == 3) {
                            System.out.println();
                            exibir(l1);
                            System.out.print("\nDigite um número para buscar na lista: ");
                            a = input.nextInt();
                            System.out.println(acessarposicao(l1, a));
                        }
                    }
                    if (op == 4) {
                        media(l1);
                    }
                    if (op == 5) {
                        maiorMenor(l1);
                    }
                    if (op == 6){
                        break;
                    }
                }
        }  
          
    }
    public static void exibir(Lista L){
    
        for (int i = 0; i < L.n; i++) {
            
            System.out.print(L.elem[i]+" ");
            
        }

    }
    public static void acessarValor(Lista L, int k){
        
        if (k < 0 || k > L.n -1) {
            System.out.println("Posição fora da lista");
        }else{System.out.println("O elemento da posição "+k+" é: "+L.elem[k]);}
    
    }
    public static String acessarposicao(Lista L, int k){
        int pos;
        for (int i = 0; i < L.n; i++) {
            pos = L.elem[i];
            if (pos == k) {
                return "O Elemento "+k+" está na posição "+i;
            }
        }
        return "Não existe o elemento "+k+" Na lista";
    
    }
    public static void add(Lista L, int k, int pos){
    int i;
        if (L.n == 6) {
            System.out.println("Lista Cheia");
        } else if(pos == L.n){
            L.elem[pos] = k;
            L.n++;
        }else if(pos < 0 || pos > L.n - 1){
            System.out.println("Posição fora da Lista");
        
        }else{
        
            for (i= L.n -1; i >= pos; i--) {
                L.elem[i+1] = L.elem[i];
            }
            L.elem[pos] = k;
            L.n++;
        }
        
    }
    public static void excluir(Lista L, int pos){
        int i;
        if (pos < 0 || pos > L.n - 1) {
            System.out.println("Posição fora da Lista");
        }else{
            for (i = pos;  i < L.n - 1; i++) {
                L.elem[i] = L.elem[i+1]; 
            }
            L.n--;
        }
    }
    public static void tam(Lista L){
        System.out.println("Tamanho da Lista "+L.n);
    }
    
    
    public static void media(Lista L){
        int sum = 0;
        for (int i = 0; i < L.n; i++) {
            sum += L.elem[i];
        }
        System.out.println("A Soma dos elementos da Lista é: "+sum);
        if (L.n == 0) {
            System.out.println("Lista Vazia");
        }else{
            System.out.println("\nA média dos elementos da lista é "+sum/L.n);
        }
        
    
    }
    public static void maiorMenor(Lista L){
        if(L.n == 0){
            System.out.println("Lista Vazia");
       }else{
            int maior = L.elem[0];
            int menor = L.elem[0];
            for(int i = 0; i < L.n; i++){
                if(L.elem[i] > maior){
                    maior = L.elem[i];
                }
                if(L.elem[i] < menor){
                    menor = L.elem[i];
                }
            }
            System.out.println("O Maior elemento da lista é "+maior+"\nO menor elemento da lista é "+menor);
        
        }
    }
}

