import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();
        dlist.add(1);
        dlist.add(2);
        dlist.add(3);
        dlist.add(4);
        dlist.add(5);
        dlist.add(5);
        dlist.add(5);
        dlist.add(7);
        dlist.add(8);
        dlist.add(10);
        dlist.add(12);

        StackOfInteger stack = new StackOfInteger();
        int[] originalArray = {1, 2, 3, 4, 5};

        while (true) {
            System.out.println("");
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Contar ocorrências de um número na lista");
            System.out.println("2. Remover números pares da lista");
            System.out.println("3. Testar pilha");
            System.out.println("4. Inverter um arranjo de inteiros");
            System.out.println("5. Sair");

            int option = scanner.nextInt();

            System.out.println("");
            switch (option) {
                case 1:
                    System.out.print("Digite um número para contar as ocorrências: ");
                    int number = scanner.nextInt();
                    System.out.println("Lista Duplamente Encadeada: " + dlist);
                    System.out.println("Número de ocorrências de " + number + ": " + dlist.countOccurrences(number));
                    break;

                case 2:
                    if(dlist.removeEvenNumbers(dlist.size()))
                    System.out.println("Números pares removidos: " + dlist);
                    else
                    System.out.println("Números pares não removidos" );
                    break;

                case 3:
                    stack.push(1);
                    stack.push(2);
                    stack.push(3);

                    System.out.println("Pilha: " + stack.toString());
                    
                    System.out.println("Topo da pilha: " + stack.top());

                    System.out.println("Removido: " + stack.pop());
                    System.out.println("Removido: " + stack.pop());

                    System.out.println("Tamanho da pilha: " + stack.size());
                    System.out.println("A pilha está vazia? " + stack.isEmpty());

                    stack.clear();
                    System.out.println("Pilha limpada!");
                    System.out.println("A pilha está vazia após a limpeza? " + stack.isEmpty());
                    break;

                case 4:
                     System.out.println("Array invertido: " + Arrays.toString(StackOfInteger.reverseArrayUsingStack(originalArray)));
                    break;

                case 5:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}