public class checkboxes implements visual,behavioural{
    @Override
    public void color() {
        System.out.println("Blue");
    }

    @Override
    public void size() {
        System.out.println("30px X 30px");
    }

    @Override
    public void clickAction() {
        System.out.println("Checkbox Clicked");
    }

    @Override
    public void textinput() {
        System.out.println("Please tick the checkbox");
    }
}