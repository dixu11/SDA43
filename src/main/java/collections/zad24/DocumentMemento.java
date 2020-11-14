package collections.zad24;

public class DocumentMemento {

    private final String content;
    private final int fontSize;
    private final String color;

    public DocumentMemento(String content, int fontSize, String color) {
        this.content = content;
        this.fontSize = fontSize;
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "DocumentMemento{" +
                "content='" + content + '\'' +
                ", fontSize=" + fontSize +
                ", color='" + color + '\'' +
                '}';
    }
}
