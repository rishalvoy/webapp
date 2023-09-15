package com.project.webapp.repositories;

import com.project.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author, Long> {
}
