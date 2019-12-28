package net.suncaper.mallanlisb.service;

import com.github.pagehelper.PageInfo;
import net.suncaper.mallanlisb.common.domain.Book;

import java.util.List;

public interface BookService {
    //增删改查
    int addBook(Book book);

    int addBooks(List<Book> books);

    //    动态参数列表
    int removeBooksByIds(Integer... ids);

    int modifyBookById(Book book);

    Book findBookById(Book book);

    //分页
    PageInfo<Book> findBookPageInfo(int page, int limit);
}
