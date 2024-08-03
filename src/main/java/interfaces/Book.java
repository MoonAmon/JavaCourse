package interfaces;

public class Book implements Product {

    private String name;
    private String autor;
    private int pages;
    private String isbn;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public void setName(String name) {
        setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
