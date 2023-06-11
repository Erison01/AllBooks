package com.erison.allbooks.services;

import com.erison.allbooks.models.Book;
import com.erison.allbooks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

public List<Book>allBooks(){
 return    bookRepository.findAll();
}

public Book bookDetails(Long id){
  return   bookRepository.findById(id).orElse(null);
}
    }

