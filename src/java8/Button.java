package java8;

public class Button {

    private String color;
    private ButtonAction buttonAction;

    public Button(String color, ButtonAction buttonAction) {
        this.color = color;
        this.buttonAction = buttonAction;
    }

    public void pushButton() {
        buttonAction.action();
    }


}
