package com.gl.crudApplication.Repository;

import com.gl.crudApplication.BookEntity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface BookRepository extends JpaRepository<Book, Long> {
    }


