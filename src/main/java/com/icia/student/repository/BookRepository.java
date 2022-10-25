package com.icia.student.repository;

import com.icia.student.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int save(BookDTO bookDTO){
        return sql.insert("Book.save", bookDTO);
    }

    public BookDTO findBook(){
        return sql.selectOne("Book.findBook");
    }
}
