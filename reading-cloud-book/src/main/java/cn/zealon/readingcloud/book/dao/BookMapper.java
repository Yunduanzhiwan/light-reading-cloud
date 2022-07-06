package cn.zealon.readingcloud.book.dao;

import cn.zealon.readingcloud.common.pojo.book.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 图书
 * @author: zealon
 * @since: 2020/3/16
 */

public interface BookMapper {

    Book selectById(Integer id);



    Book selectByBookId(String bookId);

    List<Book> findPageWithResult(@Param("dicCategory") Integer dicCategory,
                                  @Param("dicChannel") Integer dicChannel,
                                  @Param("dicSerialStatus") Integer dicSerialStatus,
                                  @Param("onlineStatus") Integer onlineStatus,
                                  @Param("authorId") Integer authorId,
                                  @Param("bookId") String bookId,
                                  @Param("bookName") String bookName);

    Integer findPageWithCount(@Param("dicCategory") Integer dicCategory,
                              @Param("dicChannel") Integer dicChannel,
                              @Param("dicSerialStatus") Integer dicSerialStatus,
                              @Param("onlineStatus") Integer onlineStatus,
                              @Param("authorId") Integer authorId,
                              @Param("bookId") String bookId,
                              @Param("bookName") String bookName);
}
