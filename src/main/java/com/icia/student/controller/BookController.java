package com.icia.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.icia.student.dto.BookDTO;
import com.icia.student.service.BookService;
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/save")
    public String saveform(){
        return "bookSave";
    }


    @PostMapping("/save")
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
}
