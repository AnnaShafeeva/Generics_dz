public class Main {
    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<>(new String[5]);
        System.out.println(box1.add("Желтый"));
        System.out.println(box1.add("Зеленый"));
        System.out.println(box1.add("Оранжевый"));
        System.out.println(box1.add("Синий"));
        System.out.println(box1.add("Красный"));
        System.out.println(box1.add("Фиолетовый"));
        System.out.println(box1);
        String a = box1.pick();
        System.out.println(a);

        MagicBox<Integer> box2 = new MagicBox<>(new Integer[3]);
        box2.add(5);
        box2.add(3);
        box2.add(10);
        System.out.println(box2);
        int b = box2.pick();
        System.out.println(b);

        MagicBox<String> box3 = new MagicBox<>(new String[4]);
        box3.add("Машина");
        box3.add("Мотоцикл");
        box3.add("Яхта");
        box3.pick();

    }
}
