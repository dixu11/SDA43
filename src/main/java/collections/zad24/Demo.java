package collections.zad24;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        DocumentCaretaker caretaker =
                new DocumentCaretaker(document);
        caretaker.save();
        document.append("Ala ma kota");
        caretaker.save();
        document.backspace();
        caretaker.save();
        document.setColor("GREEN");


        System.out.println(document);
        caretaker.reverse();
        System.out.println(document);
        caretaker.reverse();
        System.out.println(document);
        caretaker.reverse();
        System.out.println(document);
        caretaker.reverse();
        System.out.println(document);
    }
}
