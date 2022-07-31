package db;

import java.util.ArrayList;

public class InMemoryDB {
    private static ArrayList<Book> dbList=new ArrayList<>();

    static {
        dbList.add(new Book("001","Java", "Jone", "Yes"));
        dbList.add(new Book("002","Python", "Steaven", "Yes"));
        dbList.add(new Book("003","C Sharp", "Nill", "No"));
    }

    public static void addBook(Book book){
        dbList.add(book);
    }

    public static void editBook(int index, Book book){
        dbList.set(index,book);
    }
    public static void removeBook(Book book){
        dbList.remove(book);
    }

    public static ArrayList<Book> getDBList(){
        return dbList;
    };

}
