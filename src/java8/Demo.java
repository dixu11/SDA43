package java8;

public class Demo {
    public static void main(String[] args) {
        HelloAction helloAction = new HelloAction();
        Button button = new Button("black",helloAction);
        button.pushButton();

        Button buttonExit = new Button("pink", new ButtonAction() {
            @Override
            public void action() {
                System.out.println("exit");
            }
        });

        buttonExit.pushButton();
    }
}
