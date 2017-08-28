package org.NeilAlishev.blockchain.model;

import org.NeilAlishev.blockchain.model.enums.OfferStatus;

import javax.persistence.*;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Entity
@SequenceGenerator(name = "offer_gen", sequenceName = "offer_seq", allocationSize = 1)
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offer_gen")
    private Long id;

    private User employee;

    @OneToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Column(name = "creation_date")
    private Long creationDate;

    @Column(name = "accepted_date")
    private Long acceptedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "offer_status")
    private OfferStatus offerStatus;

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public Long getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(Long acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public OfferStatus getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(OfferStatus offerStatus) {
        this.offerStatus = offerStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
