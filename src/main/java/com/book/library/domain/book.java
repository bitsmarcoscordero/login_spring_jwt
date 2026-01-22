package com.book.library.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String author;
    
    @Column(length = 500)
    private String description;
    
    @Column(nullable = false)
    private Boolean available;
    
    @Column(nullable = false)
    private Integer publicationYear;

    public book() {
    }

    public book(Long id, String author, String description, Boolean available, Integer publicationYear) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.available = available;
        this.publicationYear = publicationYear;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
}
