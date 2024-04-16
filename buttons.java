public class buttons implements visual, behavioural{
    public void color(){
        System.out.println("Green");
    }

    @Override
    public void size() {
        System.out.println("100px X 50px");
    }

    @Override
    public void clickAction() {
        System.out.println("Button Clicked");
    }

    @Override
    public void textinput() {
        System.out.println("Click here...");
    }
}
