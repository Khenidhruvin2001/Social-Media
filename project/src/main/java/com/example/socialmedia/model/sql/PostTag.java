package com.example.socialmedia.model.sql;

import jakarta.persistence.*;

@Entity
public class PostTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Tag tag;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Post getPost() { return post; }
    public void setPost(Post post) { this.post = post; }
    public Tag getTag() { return tag; }
    public void setTag(Tag tag) { this.tag = tag; }
}
