package com.wsdev.bookstore.Repository;

import com.wsdev.bookstore.Model.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID>
{

}
