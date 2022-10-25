package com.icia.student.repository;

import com.icia.student.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int save(BookDTO bookDTO){
        return sql.insert("Book.save", bookDTO);
    }

    public BookDTO findBook(){ // 조회결과가 하나일때 selectOne
        return sql.selectOne("Book.findBook");
    }
    public List<BookDTO> findAll(){ // 조회 결과가 여러개 일때 selectList
        return sql.selectList("Book.findAll");
    }
    public  BookDTO findBook1(Long bookId) {//service로 부터 bookId 받음
        return sql.selectOne("Book.findBook1", bookId); // mapper로 넘김
    }

}
