public class App {
    public static void main(String[] args) {

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

        System.out.println("\nNúmero de ocorrências de 4: " + dlist.countOccurrences(4));
        System.out.println("\nNúmero de ocorrências de 5: " + dlist.countOccurrences(5));
        System.out.println("\nNúmero de ocorrências de 9: " + dlist.countOccurrences(9));
        System.out.println("\nNúmeros pares removidos: " + dlist.removeEvenNumbers(dlist.size()));
        System.out.println(dlist);
    }
}