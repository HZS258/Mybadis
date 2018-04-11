package com.mybadis.dao;

import com.mybadis.pojo.Author;

import java.util.List;

public interface AuthorDao {
    int addAuthor(Author auhor);
    int updateAuthor(Author author);
    int deleteAuthor(int id);
    Author findById(int id);
    List<Author> findAll();
}
