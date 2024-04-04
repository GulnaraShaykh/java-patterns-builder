package iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    private final Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true; // Всегда есть следующий элемент
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }

    // Пример использования
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
