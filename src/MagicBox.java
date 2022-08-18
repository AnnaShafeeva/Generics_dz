import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(T[] items) {
        this.items = items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        int randomInt = 0;
        int j1 = 0;
        for (T a : items) {
            if (a != null) {
                randomInt = random.nextInt(items.length);
            } else {
                for (T i : items) {
                    if (i == null) {
                        j1++;
                    }
                }
                throw new RuntimeException("Коробка не заполнена, количество ячеек, которые надо заполнить: " + j1);
            }
        }
        return items[randomInt];
    }

    public String toString() {
        return Arrays.toString(items);
    }


}
