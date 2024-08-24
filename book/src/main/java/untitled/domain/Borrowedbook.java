package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Borrowedbook extends AbstractEvent {

    private Long id;
    private Long bookId;
    private Long customerId;
    private Date borrowDate;
}
