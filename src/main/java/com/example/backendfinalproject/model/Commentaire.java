package com.example.backendfinalproject.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "commentaire")
public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comsa")
    private int id;
    @Column(nullable = false)
    private String content;
    @CreationTimestamp
    @Column(name = "posting_date",nullable = false)
    private Instant postingDate;
    @ManyToOne
    private Film film;
}
