public class LibraryMember implements BorrowAndReturn,LibraryResources,UserInteractions{
    @Override
    public void bookname() {
        System.out.println("BookName: The Alchemist");
    }

    @Override
    public void author() {
        System.out.println("Author: Paulo Coelho ");
    }

    @Override
    public void availability() {
        System.out.println("Availability: Borrowed");
    }

    @Override
    public void booksavailability(){
        System.out.println("Available Books: IKIGAI, The Da Vinci Code");
    }

    @Override
    public void newspaperavailability(){
        System.out.println("Daily newspapers are available in all languages");
    }

    @Override
    public void login() {
        System.out.println("You can login here...");
    }

    @Override
    public void searchBooks() {
        System.out.println("you can search books here...");
    }

}
