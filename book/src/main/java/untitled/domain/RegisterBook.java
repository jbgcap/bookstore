package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RegisterBook extends AbstractEvent {

    private Long id;
    private String title;
    private String subTitle;
    private String author;
    private String publisher;

    public RegisterBook(Book aggregate) {
        super(aggregate);
    }

    public RegisterBook() {
        super();
    }
}
//>>> DDD / Domain Event
