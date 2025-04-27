package com.wsdev.bookstore.Repository;

import com.wsdev.bookstore.Model.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID>
{

}
