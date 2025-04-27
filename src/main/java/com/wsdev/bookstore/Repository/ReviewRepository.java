package com.wsdev.bookstore.Repository;

import com.wsdev.bookstore.Model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID>
{

}
