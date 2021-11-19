package com.example.shopproject.Service;


import com.example.shopproject.Mapper.AuthorMapper;
import com.example.shopproject.Model.DTO.Author.AuthorDTO;
import com.example.shopproject.Model.DTO.Author.PostAuthorDTO;
import com.example.shopproject.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public AuthorDTO GetAuthorByID(Integer id) {
        var author = authorRepository.findById(id);
        return author.map(AuthorMapper::AuthorToAuthorDTO).orElse(null);
    }

    public void PostAuthor(PostAuthorDTO postAuthorDTO) {
        authorRepository.save(AuthorMapper.PostAuthorDTOtoAuthor(postAuthorDTO));
    }

    public void DeleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }

    public List<AuthorDTO> GetAllAuthors() {
        List<AuthorDTO> authorDTOS = new ArrayList<>();
        authorRepository.findAll().forEach(author -> {
            authorDTOS.add(AuthorMapper.AuthorToAuthorDTO(author));
        });
        return authorDTOS;
    }

    public List<AuthorDTO> GetAuthorByExactLastName(String lastName) {
        List<AuthorDTO> authorDTOS = new ArrayList<>();
        authorRepository.findAllByLastName(lastName).forEach(author -> {
            authorDTOS.add(AuthorMapper.AuthorToAuthorDTO(author));
        });
        return authorDTOS;
    }

    public List<AuthorDTO> GetAuthorByApproximativeLastName(String lastName) {
        List<AuthorDTO> authorDTOS = new ArrayList<>();
        authorRepository.findAllByLastNameIsContaining(lastName).forEach(author -> {
            authorDTOS.add(AuthorMapper.AuthorToAuthorDTO(author));
        });
        return authorDTOS;
    }
}
