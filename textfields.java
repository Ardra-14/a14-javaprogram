public class textfields implements visual,behavioural{

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void size() {
        System.out.println("50px X 20px");
    }

    @Override
    public void clickAction() {
        System.out.println("Textfield activated");
    }

    @Override
    public void textinput() {
        System.out.println("Enter a text here...");
    }
}
