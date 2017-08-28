package org.NeilAlishev.blockchain.dto;

import org.NeilAlishev.blockchain.dto.enums.Status;
import org.NeilAlishev.blockchain.model.User;

import java.util.Date;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public class EmploymentRecord {

    private Date date;

    private Status status;

    private User user;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
