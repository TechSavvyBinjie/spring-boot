package quickstart.service;

import org.springframework.stereotype.Service;
import quickstart.dto.BookDTO;

import java.util.List;
@Service
public class BookService {
    public List<BookDTO> getAllBookDTO(){
        return List.of(new BookDTO((long)10,"12","1",1.0));
    }
}
