public class Operations {

    /**
     * Metodo que recebe duas listas de inteiros por parametro, l1 e l2, e
     * retorna o maior valor que aparece simultaneamente nas duas listas. Caso
     * as listas nao possuam valores em comum, o metodo retorna zero. Nao podem
     * ser usados os atributos da lista, isto e´, apenas os seus metodos podem
     * ser chamados. Exemplo: lista1 = {1,2,3,4,5,6,7,8} lista2 = {0,2,4,6,8,10}
     * Integer n = getBiggestComumValue(lista1,lista2) Conteúdo de n = 8
     *
     * @param l1 lista a ser verificada
     * @param l2 lista a ser verificada
     * @return Integer maior valor que aparece simultaneamente nas duas listas
     */
    public static Integer getBiggestComumValue(DoubleLinkedListOfInteger l1, DoubleLinkedListOfInteger l2) {
        Integer maior = null;
        boolean achou = false;
        // O(n(n+m)) --> classe quadrática se usa o metodo get
        // O(n*m) --> com os metodos reset e next
        l1.reset();
        for (int i = 0; i < l1.size(); i++) {
            int n = l1.next(); //l1.get(i);
            if (l2.contains(n)) {
                if (achou == false) { // primeiro elemento em comum encontrado
                    maior = n;
                    achou = true;
                } else {
                    if (n > maior) {
                        maior = n;
                    }
                }
            }
        }
        return maior;
    }
}
