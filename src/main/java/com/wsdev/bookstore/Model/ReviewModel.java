package com.wsdev.bookstore.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_review")
public class ReviewModel implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private UUID id;

    @Column( nullable = false )
    private String comment;

    @JsonProperty( access = JsonProperty.Access.WRITE_ONLY )
    @OneToOne
    @JoinColumn( name = "book_id" )
    private BookModel book;

    public UUID getId()
    {
        return id;
    }

    public void setId( UUID id )
    {
        this.id = id;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment( String comment )
    {
        this.comment = comment;
    }

    public BookModel getBook()
    {
        return book;
    }

    public void setBook( BookModel book )
    {
        this.book = book;
    }
}
