
public class Book implements Comparable<Book>{

    private String bookName;
    private int pageNumber;
    private String authorName;
    private String publishYear;

    public Book(String bookName, int pageNumber, String authorName, String publishYear) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }
    
    @Override 
    public int compareTo(Book book) {
        return getBookName().compareTo(book.getBookName());
    }
    
}