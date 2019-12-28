package net.suncaper.mallanlisb;

import net.suncaper.mallanlisb.common.domain.Admin;
import net.suncaper.mallanlisb.common.domain.Book;
import net.suncaper.mallanlisb.mapper.AdminMapper;
import net.suncaper.mallanlisb.mapper.BookMapper;
import net.suncaper.mallanlisb.mapper.ImgFileMapper;
import net.suncaper.mallanlisb.mapper.extend.AdminMapperExtend;
import net.suncaper.mallanlisb.mapper.extend.BookMapperExtend;
import net.suncaper.mallanlisb.mapper.extend.ImgFileMapperExtend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MainApplicationTests {

    @Autowired
    AdminMapperExtend adminMapper;
    @Autowired
    BookMapperExtend bookMapper;
    @Autowired
    ImgFileMapperExtend imgFileMapper;

    @Test
    void contextLoads() {
    }
    @Test
    public void testAddTwoAdmin(){
        Admin admin = new Admin("admin","admin");
        Admin test = new Admin("test","test");
        //  adminMapper.insert(admin);
        adminMapper.insert(admin);
    }

    @Test
    public void testAddSomeBook(){
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i <103 ; i++) {
            StringBuilder strb = new StringBuilder();
            for (int j = 0; j < 8 ; j++) {
                char c= (char)( (int)(Math.random()*('z'-'a'+1)+'a'));
                strb.append(c);
            }
            bookList.add(new Book("书名"+i,(int)(Math.random()*100000)/100.0,strb.toString()));
        }
       /* for (Book book : bookList) {
            System.out.println(book);

        }*/
        bookMapper.insertBatch(bookList);
    }

    @Test
    public void testSelectAllBook(){
        List<Book> books = bookMapper.selectByExample(null);
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
