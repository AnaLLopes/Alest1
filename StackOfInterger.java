import java.util.*;

class StackOfInteger {
    private DoubleLinkedListOfInteger list;

    public StackOfInteger() {
        list = new DoubleLinkedListOfInteger();
    }

    public Integer pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }
        return list.removeByIndex(0);
    }

    public Integer push(Integer element) {
        list.add(0, element);
        return element;
    }

    public Integer top() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
        
    }

      @Override
    public String toString()
    {
        return list.toString();
    } 
    

     /**
     * Método reverseArrayUsingStack()
     * Método estático que recebe um arranjo de inteiros e utiliza uma pilha implementada para inverter seu conteúdo
     * @param arr um arranjo de inteiros
     * @return o arranjo de inteiros com os dados invertidos
     */
    public static int[]  reverseArrayUsingStack(int[] arr) {
        StackOfInteger stack = new StackOfInteger();
        int[] reversedArray = new int[arr.length];

        for (int i : arr) {
            stack.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = stack.pop();
        }

        return reversedArray;
    }
}


