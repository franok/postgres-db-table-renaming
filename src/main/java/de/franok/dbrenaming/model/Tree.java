package de.franok.dbrenaming.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "xmas_tree")
public class Tree {

    @Id
    @UuidGenerator
    @Column(name = "id")
    private String id;

    /**
     * The number of leaves the tree currently has.
     */
    @Column(name = "needles")
    private Long leaves;
}
