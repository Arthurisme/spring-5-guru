package com.intactai.spring5webapp.repositories;

import com.intactai.spring5webapp.model.Author;
import com.intactai.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
