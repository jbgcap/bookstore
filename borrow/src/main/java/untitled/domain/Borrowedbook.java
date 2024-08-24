package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Borrowedbook extends AbstractEvent {

    private Long id;
    private Long bookId;
    private Long customerId;
    private Date borrowDate;

    public Borrowedbook(Borrow aggregate) {
        super(aggregate);
    }

    public Borrowedbook() {
        super();
    }
}
//>>> DDD / Domain Event
