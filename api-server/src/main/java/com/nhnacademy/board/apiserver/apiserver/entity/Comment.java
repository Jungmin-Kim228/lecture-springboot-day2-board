package com.nhnacademy.board.apiserver.apiserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="comment_no")
    private Integer commentNo;

    @ManyToOne
    @JoinColumn(name = "post_no")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @Column(name = "comment_content")
    private String commentContent;

    @Builder(builderMethodName = "addComment")
    public static Comment createComment(Post post, User user, String commentContent) {
        Comment comment = new Comment();
        comment.setPost(post);
        comment.setUser(user);
        comment.setCommentContent(commentContent);
        return comment;
    }
}
