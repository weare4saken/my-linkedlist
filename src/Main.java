public class Main {
    public static void main(String[] args) {
        MyList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Первая");
        myLinkedList.add("Вторая");
        myLinkedList.add("Третья");
        myLinkedList.add("Четвертая");
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.pop());
        System.out.println(myLinkedList);

        myLinkedList.remove(0);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));

        System.out.println(myLinkedList.size());
    }
}
