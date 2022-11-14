public class Ebook extends Book{
    private String format;

    Ebook(String title, String author,int pageCount, String Format){
        super(title, author, pageCount);

        this.format = format;
    }
}
