//package seminars.fourth.book;
//
//
//import fourth.book.Book;
//import fourth.book.BookRepository;
//import fourth.book.BookService;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.*;
//
//class BookServiceTest_OLD {
//    @Test
//    void findByIdTest(){
//        BookRepository bookRepository = mock(BookRepository.class);
//        BookService bookService = new BookService(bookRepository);
//        when(bookRepository.findById("1")).thenReturn(any(Book.class));
//
//       when(bookRepository.findById(anyString())).thenReturn(Arrays.asList("1", "Book1", "Author1");
//
////        Book result = BookRepository.F("1");
//
//        verify(bookRepository).findById("1");
//        assertThat(BookRepository.findById).asEqual());
//    }
//
//    @Test
//    void findAllTest() {
//
//    }
//}