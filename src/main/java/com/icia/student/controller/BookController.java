package com.icia.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.icia.student.dto.BookDTO;
import com.icia.student.service.BookService;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/save") //save 주소로 넘어가는 역할
    public String saveform(){
        return "bookSave";
    }


    @PostMapping("/save")//입력값을 입력받는 역할
    public String save(@ModelAttribute BookDTO bookDTO) {
    boolean result= bookService.save(bookDTO);
    if(result){
        return "index";
    }else {
        return "savefail";
    }
    }

    @GetMapping("/findBook")
    public String findBook(Model model){
      BookDTO findResult= bookService.findBook();
       model.addAttribute("book",findResult);
       return "findBook";
    }
    @GetMapping("/books")
    public String findAll(Model model){
        List<BookDTO> bookList = bookService.findAll();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }
    @GetMapping("/book")
    public String findBook1(@RequestParam("bookId") Long bookId,Model model){ // model : 파라미터를 담는 그릇
        BookDTO findResult = bookService.findBook1(bookId);
        model.addAttribute("book",findResult);
        return "findBook";
    }
}
