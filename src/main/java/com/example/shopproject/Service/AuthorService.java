package com.example.shopproject.Service;


import com.example.shopproject.Model.Entity.Author;
import com.example.shopproject.Repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<Author> GetAuthorByID(Integer ID) {
        return authorRepository.findById(ID);
    }

    public void PostAuthor( Author author) {
        System.out.println(author.toString());
        authorRepository.save(author);
    }

    public void DeleteAuthor(Integer ID){
        authorRepository.deleteById(ID);
    }
    public Iterable<Author> GetAllAuthors(){
        return authorRepository.findAll();
    }


}
