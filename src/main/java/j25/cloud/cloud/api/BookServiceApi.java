package j25.cloud.cloud.api;

import j25.cloud.cloud.model.Book;
import j25.cloud.cloud.model.dto.UpdateBookRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("book-service")
public interface BookServiceApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    void postGrade(@RequestBody UpdateBookRequest book);

    @GetMapping("/{id}")
    Book getById(@PathVariable("id") Long bookId);

    @GetMapping("/search")
    List<Book> getByTitleAndAuthor(@RequestParam(name = "author", required = false) String author,
                                   @RequestParam(name = "title", required = false) String title);
}
