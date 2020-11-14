package collections.zad24;

public class Document {
    private StringBuilder content = new StringBuilder();
    private int fontSize;
    private String color;

    public Document() {
        fontSize = 12;
        color = "black";
    }

    public Document(String stringContent, int fontSize, String color) {
        content.append(stringContent);
        this.fontSize = fontSize;
        this.color = color;
    }

    public  void append(String newText){
        content.append(newText);
        //content += newText; // dla String
    }

    public void backspace(){
        this.content.deleteCharAt(this.content.length()-1);
        //content.setLength(content.length()-1);
//        content = content.substring(0,content.length()-1); // dla String
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento
                (content.toString(), fontSize, color);
    }

    public void rollback(DocumentMemento memento){
        content = new StringBuilder(memento.getContent());
        fontSize = memento.getFontSize();
        color = memento.getColor();
    }


    @Override
    public String toString() {
        return "Document{" +
                "content=" + content +
                ", fontSize=" + fontSize +
                ", color='" + color + '\'' +
                '}';
    }
}
