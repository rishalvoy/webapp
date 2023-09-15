package com.project.webapp.repositories;

import com.project.webapp.domain.Book;
import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book, Long> {
}
