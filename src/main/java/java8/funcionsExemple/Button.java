package java8.funcionsExemple;

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
