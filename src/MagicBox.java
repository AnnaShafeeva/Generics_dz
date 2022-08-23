import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private Random random = new Random();
    private int randomInt;

    public MagicBox(T[] items) {
        this.items = items;
    }

    public boolean add(T itemNew) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = itemNew;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int itemNull = 0;
        for (T item : items) {
            if (item == null) {
                itemNull++;
                throw new RuntimeException("Коробка не заполнена, количество ячеек, которые надо заполнить: " + itemNull);
            }
        }

        randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

    public String toString() {
        return Arrays.toString(items);
    }

}
