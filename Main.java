public class Main {
    public static void main(String[] args){
        buttons b = new buttons();
        b.color();
        b.size();
        b.clickAction();
        b.textinput();
        System.out.println();

        textfields t = new textfields();
        t.color();
        t.size();
        t.clickAction();
        t.textinput();
        System.out.println();

        checkboxes c = new checkboxes();
        c.color();
        c.size();
        c.clickAction();
        c.textinput();
    }
}