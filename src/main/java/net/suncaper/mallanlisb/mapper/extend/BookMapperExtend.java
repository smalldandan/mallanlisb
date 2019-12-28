package net.suncaper.mallanlisb.mapper.extend;

import net.suncaper.mallanlisb.common.domain.Book;
import net.suncaper.mallanlisb.common.domain.BookExample;
import net.suncaper.mallanlisb.mapper.BookMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapperExtend extends BookMapper {
    int insertBatch(@Param("books") List<Book> bookList);
}