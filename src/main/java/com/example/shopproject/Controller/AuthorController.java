package com.example.shopproject.Controller;

import com.example.shopproject.Model.Entity.Author;
import com.example.shopproject.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/bookcollection/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public @ResponseBody
    Optional<Author> GetAuthorByID(@RequestParam Integer ID){
        return authorService.GetAuthorByID(ID);
    }

    @GetMapping("/all")
    public Iterable<Author> GetAllAuthors(){
        return authorService.GetAllAuthors();
    }


    @PostMapping
    public void PostAuthor(@RequestBody Author author){
        System.out.println(author.toString());
        authorService.PostAuthor(author);
    }

    @DeleteMapping
    public void DeleteAuthor(Integer ID){
        authorService.DeleteAuthor(ID);
    }

}
