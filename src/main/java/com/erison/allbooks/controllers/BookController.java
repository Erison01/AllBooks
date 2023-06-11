package com.erison.allbooks.controllers;

import com.erison.allbooks.models.Book;
import com.erison.allbooks.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String index(Model model){
        List<Book> books =bookService.allBooks();
        model.addAttribute("allBooks",books);
        return "index";
    }

    @GetMapping("/bookDetails/{id}")
    public String bookDetails(@PathVariable Long id,Model model){
        Book book = bookService.bookDetails(id);
        model.addAttribute("book",book);
        return "details";
    }
}
