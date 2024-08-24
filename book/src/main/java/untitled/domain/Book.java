package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BookApplication;
import untitled.domain.RegisterBook;

@Entity
@Table(name = "Book_table")
@Data
//<<< DDD / Aggregate Root
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String subTitle;

    private String author;

    private String publisher;

    private String status;

    @PostPersist
    public void onPostPersist() {
        RegisterBook registerBook = new RegisterBook(this);
        registerBook.publishAfterCommit();
    }

    public static BookRepository repository() {
        BookRepository bookRepository = BookApplication.applicationContext.getBean(
            BookRepository.class
        );
        return bookRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateStatus(Borrowedbook borrowedbook) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        */

        /** Example 2:  finding and process
        
        repository().findById(borrowedbook.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
