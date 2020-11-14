package collections.zad24;

import java.util.Deque;
import java.util.LinkedList;

public class DocumentCaretaker {

    private Deque<DocumentMemento> archive = new LinkedList<>();
    private Document document;

    public DocumentCaretaker(Document document) {
        this.document = document;
    }

    public void save(){
        archive.addLast(document.createMemento());
    }

    public void reverse(){
        if (archive.isEmpty()) return;
        document.rollback(archive.pollLast());
    }
//    save() zapisująca bieżący stan dokumentu
//    reverse() cofająca dokument do poprzedniego stani
//    przetestuj aplikację kilkukrotnie wywołując metody save() i
//    reverse(). Zadbaj o to aby aplikacja nie zatrzymywała się jeśli
//    wowołamy reverse() więcej razy niż dokument został zapisany

}
