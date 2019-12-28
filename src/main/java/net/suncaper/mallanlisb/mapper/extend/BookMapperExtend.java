package net.suncaper.mallanlisb.mapper.extend;

import net.suncaper.mallanlisb.common.domain.Book;
import net.suncaper.mallanlisb.common.domain.BookExample;
import net.suncaper.mallanlisb.mapper.BookMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapperExtend extends BookMapper {
//    自己实现的添加多本书的方法
    int insertBatch(@Param("books") List<Book> bookList);
}