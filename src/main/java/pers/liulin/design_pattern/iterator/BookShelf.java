package pers.liulin.design_pattern.iterator;

import java.util.ArrayList;

/**
 * Created by LiuLin on 2017/3/27 0027.
 */
public class BookShelf implements Aggregate {   //BookShelf 类是是表示书架的类。
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
