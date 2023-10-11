import java.util.*;

class QueueOfInteger {
    private DoubleLinkedListOfInteger list;

    public QueueOfInteger() {
        list = new DoubleLinkedListOfInteger();
    }

    public void enqueue(Integer element) {
        list.addToEnd(element);
    }

    public Integer dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        return list.removeByIndex(0);
    }

    public Integer head() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
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
            dequeue();
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }

    /**
     * Método enqueuePriority()
     * Recebe como parâmetro um elemento que deve ser inserido na fila de acordo com a sua prioridade
     * @param element elemento a ser inserido 
     */
    public void enqueuePriority(Integer element) {
            if (isEmpty()) {
                enqueue(element);
            } else {
                int index = 0;
                while (index < size() && element.compareTo(list.get(index)) >= 0) {
                    index++;
                }
                list.add(index, element);
            }
        }        
    }
