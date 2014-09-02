package net.pkhapps.fenix.core.sms.entity;

import net.pkhapps.fenix.core.entity.AbstractFireDepartmentSpecificEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Entity containing fire department specific SMS properties (currently for ASPSMS.COM, but this might change in the future).
 */
@Entity
@Table(name = "sms_properties", uniqueConstraints = @UniqueConstraint(columnNames = "fire_department_id"))
public class SmsProperties extends AbstractFireDepartmentSpecificEntity {

    @Column(name = "user_key", nullable = false)
    private String userKey = "";

    @Column(name = "password", nullable = false)
    private String password = "";

    @Column(name = "originator", nullable = false)
    private String originator;

    public SmsProperties() {
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }
}