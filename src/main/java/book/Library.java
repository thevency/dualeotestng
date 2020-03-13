package book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> storePlace = new ArrayList<>();

    public void addBookToLib(Book book){
        storePlace.add(book);
    }

    public String findBookAuthor(String title){
        for(Book bk: storePlace){
            if(bk.getTitle().contains(title)){
                return bk.getAuthor();
            }else{
                return "empty";
            }
        }
        return "";
    }

}
