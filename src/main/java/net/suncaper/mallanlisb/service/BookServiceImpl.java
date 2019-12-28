package net.suncaper.mallanlisb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.suncaper.mallanlisb.common.domain.Book;
import net.suncaper.mallanlisb.common.domain.BookExample;
import net.suncaper.mallanlisb.mapper.extend.BookMapperExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapperExtend bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int addBooks(List<Book> books) {
        return bookMapper.insertBatch(books);
    }

    @Override
    public int removeBooksByIds(Integer... ids) {
        BookExample bookExample = new BookExample();
        bookExample.createCriteria().andIdIn(Arrays.asList(ids));
        return bookMapper.deleteByExample(bookExample);
    }

    @Override
    public int modifyBookById(Book book) {
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public Book findBookById(Book book) {
        return bookMapper.selectByPrimaryKey(book.getId());
    }

    @Override
    public PageInfo<Book> findBookPageInfo(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<Book> books = bookMapper.selectByExample(null);
        PageInfo<Book> pageInfo = new PageInfo<>(books);
        return pageInfo;
    }
}
