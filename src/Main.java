public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(2);
        bt.add(4);
        bt.add(10);
        bt.add(22);
        bt.add(1);

        System.out.println(bt.contains(22));
        System.out.println(bt.contains(11));
        System.out.println(bt.max());
        System.out.println(bt.min());


        Kucharz kucharz = new Kucharz();
        kucharz.max_difference(1, 10, 20);

    }
}