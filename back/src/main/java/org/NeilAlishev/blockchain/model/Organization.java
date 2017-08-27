package org.NeilAlishev.blockchain.model;

import javax.persistence.*;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Entity
@SequenceGenerator(name = "organization_gen", sequenceName = "organization_seq", allocationSize = 1)
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organization_gen")
    private Long id;

    private Long name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }
}
