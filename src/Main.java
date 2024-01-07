import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        TreeSet<Book> bookList = new TreeSet<>();

        Book b1 = new Book("Kürk Mantolu Madonna", 160, 
                            "Sabahattin Ali...........", "1943");
                          
        Book b2 = new Book("Şeker Portakalı.....", 182, 
                            "Jose Mauro De Vasconcelos", "1968");
              
        Book b3 = new Book("1984................", 352, 
                            "George Orwell............", "1949"); 

        Book b4 = new Book("Kırmızı Pazartesi...", 120, 
                            "Gabriel Garcia Marquez...", "1981");
                           
        Book b5 = new Book("Simyacı.............", 184, 
                            "Paulo Coelho.............", "1988");
        
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);

        System.out.println("SORTED BY NAME: ");
        System.out.println();

        for (Book book : bookList) {
            System.out.println("Book Name : " + book.getBookName()+
                                "\tPage Number : " + book.getPageNumber()+
                                "\tAuthor Name : "+ book.getAuthorName()+
                                "\tPublish Year : "+ book.getPublishYear());
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();

        TreeSet<Book> bookList2 = new TreeSet<>(new SortByNumber());

        bookList2.add(b1);
        bookList2.add(b2);
        bookList2.add(b3);
        bookList2.add(b4);
        bookList2.add(b5);

        System.out.println("SORTED BY PAGE: ");

         for (Book book : bookList2) {  
            System.out.println("Book Name : " + book.getBookName()+
                                "\tPage Number : " + book.getPageNumber()+
                                "\tAuthor Name : "+ book.getAuthorName()+
                                "\tPublish Year : "+ book.getPublishYear());
        }

    }
}
