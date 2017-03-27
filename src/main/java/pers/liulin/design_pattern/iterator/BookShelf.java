package pers.liulin.design_pattern.iterator;

/**
 * Created by LiuLin on 2017/3/27 0027.
 */
public class BookShelf implements Aggregate {   //BookShelf 类是是表示书架的类。
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last ++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
