package j25.cloud.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private int yearWritten;
    private int numberOfPages;
    private int numberOfAvailableCopies;
}
