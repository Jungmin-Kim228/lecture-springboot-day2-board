package com.nhnacademy.board.apiserver.apiserver.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Views")
public class View {
    @EmbeddedId
    private Pk pk;

    @MapsId("postNo")
    @ManyToOne
    @JoinColumn(name = "post_no")
    private Post post;

    @MapsId("userNo")
    @OneToOne
    @JoinColumn(name = "user_no")
    private User user;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Getter
    @Setter
    @Embeddable
    public static class Pk implements Serializable {
        @Column(name = "post_no")
        private Integer postNo;

        @Column(name = "user_no")
        private Integer userNo;
    }
}
