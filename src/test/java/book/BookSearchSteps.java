package book;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;
import java.util.List;

public class BookSearchSteps {
    private Library library = new Library();
    private Book book = new Book();
    private String author;
//    public BookSearchSteps(){
//        System.out.println("BookSearchSteps1 \n" );
//    }


    @Given("^a book with the title '(.+)', written by '(.+)'$")
    public void a_book_with_the_title_One_good_book_written_by_Anonymous(String title, String author) throws Throwable {
        book.setTitle(title);
        book.setAuthor(author);
        library.addBookToLib(book);
        System.out.println("Title: " + library.storePlace.get(0).getTitle());
        System.out.println("Author:" + library.storePlace.get(0).getAuthor());
    }

    @When("^the customer searches for books titled '(.+)'$")
    public void the_customer_searches_for_books_titled_One_good_book(String title) throws Throwable {
        author = library.findBookAuthor(title);
        System.out.println("Customer search with title: "+ title);

    }


    @Then("^book should have been found with author '(.+)'$")
    public void book_should_have_been_found_with_author_Anonymous(String authorAdded) throws Throwable {
        System.out.println("Result of Author: "+ author);
        Assert.assertEquals(authorAdded,author);
        System.out.println("--------------------------------");

    }

    @Given("^check before preforming with value '(\\d+)'$")
    public void     checkBeforePreformingWithValue(int arg0) throws Throwable {
        try{
            Assert.assertEquals(1,arg0);
        }catch (AssertionError Error){
            throw new PendingException();
        }
    }


    @Given("^these books with the title \"([^\"]*)\", written by \"([^\"]*)\"$")
    public void theseBooksWithTheTitleWrittenBy(String title, String author) throws Throwable {
        book.setTitle(title);
        book.setAuthor(author);
        library.addBookToLib(book);
//        System.out.println("Title is " + library.storePlace.get(0).getTitle());
//        System.out.println("Author is " + library.storePlace.get(0).getAuthor());
    }

//    @Given("^these books$")
//    public void theseBooks(List<Map<String,String>> mapList) throws Throwable {
//        for(int i=0;i<mapList.size();i++){
//            System.out.println("Title value: "+mapList.get(i).get("title"));
//            System.out.println("Author value: "+mapList.get(i).get("author"));
//        }
//    }
    @Given("^these books$")
    public void theseBooks(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        for(int i=1;i<data.size();i++){
            System.out.println("["+i+"]"+" Title Infor: "+data.get(i).get(0));
            System.out.println("["+i+"]"+" Author Infor: "+data.get(i).get(1));
        }
    }

    @Then("^assertion$")
    public void assertion() throws Throwable {
        System.out.println("I do assertion !");
        System.out.println("--------------------------------");
        Assert.assertTrue(true);
        System.out.println("Succesfully !");
    }
}
