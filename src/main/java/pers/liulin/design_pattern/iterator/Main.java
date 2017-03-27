package pers.liulin.design_pattern.iterator;

/**
 * Created by LiuLin on 2017/3/27 0027.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Arount the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Chindrella"));
        bookShelf.appendBook(new Book("Daddy-Long-legs"));
        bookShelf.appendBook(new Book("Fuck you big ass hole!"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
