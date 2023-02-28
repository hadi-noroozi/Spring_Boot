package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* define Entity */
@Entity // This tells Hibernate to make a table out of this class
public class Policy {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String policyno;

    private String policyholdernumber;

    private String policyholdername;

    private Integer policyholdertype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyno;
    }

    public void setPolicyNumber(String policyno) {
        this.policyno = policyno;
    }

    public String getPolicyholderNumber() {
        return policyholdernumber;
    }

    public void setPolicyholderNumber(String policyholdernumber) {
        this.policyholdernumber = policyholdernumber;
    }

    public String getPolicyholderName() {
        return policyholdername;
    }

    public void setPolicyholderName(String policyholdername) {
        this.policyholdername = policyholdername;
    }

    public Integer getPolicyholderType() {
        return policyholdertype;
    }

    public void setPolicyholderType(Integer policyholdertype) {
        this.policyholdertype = policyholdertype;
    }

}

interface PolicyholderInfo {
   String getPolicyholderNumber();
   String getPolicyholderName();
   Integer getPolicyholderType();
}