package net.suncaper.mallanlisb.service;

import com.github.pagehelper.PageInfo;
import net.suncaper.mallanlisb.common.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class BookServiceImplTest {


    @Autowired
    private BookService bookService;

    @Test
    public void addBook() {
        int addBook = bookService.addBook(new Book("文化苦旅", 20.2, "余秋雨"));
        System.out.println(addBook);
    }

    @Test
    public void addBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("哈哈",12.0,"陈杰"));
        bookList.add(new Book("哈3哈",1245.0,"陈杰1"));
        bookList.add(new Book("哈4哈",132.0,"陈杰2"));
        bookList.add(new Book("哈6哈",123.0,"陈杰3"));
        int i = bookService.addBooks(bookList);
        System.out.println(i);

    }

    @Test
    public void removeBooksByIds() {
        int i = bookService.removeBooksByIds(2, 3, 4);
        System.out.println(i);
    }

    @Test
    public void modifyBookById() {
        Book book = new Book();
//        book.setId(1);
        book.setAuthor("chenjie");
        book.setPrice(5632.0);
        book.setName("哟哟哟");
        int i = bookService.modifyBookById(book);
        System.out.println(i);
    }

    @Test
    public void findBookById() {
        Book book = new Book();
        book.setId(1);
        Book bookById = bookService.findBookById(book);
        System.out.println(bookById);
    }

    @Test
    public void findBookPageInfo() {
        PageInfo<Book> bookPageInfo = bookService.findBookPageInfo(2, 10);
        System.out.println(bookPageInfo);
    }
}