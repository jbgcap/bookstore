package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BorrowApplication;
import untitled.domain.Borrowedbook;

@Entity
@Table(name = "Borrow_table")
@Data
//<<< DDD / Aggregate Root
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long bookId;

    private Long customerId;

    private Date borrowDate;

    @PostPersist
    public void onPostPersist() {
        Borrowedbook borrowedbook = new Borrowedbook(this);
        borrowedbook.publishAfterCommit();
    }

    public static BorrowRepository repository() {
        BorrowRepository borrowRepository = BorrowApplication.applicationContext.getBean(
            BorrowRepository.class
        );
        return borrowRepository;
    }
}
//>>> DDD / Aggregate Root
