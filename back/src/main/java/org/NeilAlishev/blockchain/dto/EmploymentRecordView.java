package org.NeilAlishev.blockchain.dto;

import org.NeilAlishev.blockchain.model.User;

import java.util.Date;

/**
 * @author Neil Alishev
 */
public class EmploymentRecordView {
    private Date dateFrom;
    private Date dateTo;

    private String status;

    private User user;

    public EmploymentRecordView(Date dateFrom, Date dateTo, String status, User user) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.status = status;
        this.user = user;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
