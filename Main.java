public class Main {
    public static void main(String[] args){

        System.out.println("User Details: ");
        UserData u = new UserData();
        u.setUsername("John");
        u.setBooks("IKIGAI");
        u.setTransactions("Transaction completed successfully");
        System.out.println("Name: "+u.getUsername());
        System.out.println("Book: "+u.getBooks());
        System.out.println("Transaction Details: "+u.getTransactions());
        System.out.println();

        System.out.println("Library details are: ");
        LibraryMember l = new LibraryMember();
        l.bookname();
        l.author();
        l.availability();
        l.booksavailability();
        l.newspaperavailability();
        l.login();
        l.searchBooks();
        System.out.println();

        System.out.println("Details of books: ");
        Books b = new Books();
        b.title = "The Power of your Subconcious Mind";
        b.publishers = "JMW group";
        b.showDetails();
        System.out.println();


        System.out.println("Magazine Details:");
        Magazines m = new Magazines();
        m.title = "India Today";
        m.publishers = "Living Media";
        m.showDetails();
        m.setIssueDate("10/04/2024");
        System.out.println("Magazine Issue date : "+m.getIssueDate());
        System.out.println();

        System.out.println("DVD Details: ");
        DVD d = new DVD();
        d.title = "Short Stories";
        d.publishers = "abc publishers";
        d.setTimeSpan("2 hrs");
        System.out.println("Time Duration: "+ d.getTimeSpan());
        d.showDetails();
    }
}