package com.icia.student.service;
import com.icia.student.dto.BookDTO;
import com.icia.student.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public boolean save(BookDTO bookDTO){
        int result = bookRepository.save(bookDTO);
        if(result >0){
            return true;
        }else {
            return false;
        }
    }
    public BookDTO findBook(){
        BookDTO findResult = bookRepository.findBook();
        return findResult;
    }
    public List<BookDTO> findAll(){
        return bookRepository.findAll();
    }
}
