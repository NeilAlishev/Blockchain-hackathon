package org.NeilAlishev.blockchain.model;

import javax.persistence.*;
import java.util.Set;

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

    @ElementCollection(targetClass = User.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "organization_employer", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "employer", nullable = false)
    private Set<User> employers;

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

    public Set<User> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<User> employers) {
        this.employers = employers;
    }
}
