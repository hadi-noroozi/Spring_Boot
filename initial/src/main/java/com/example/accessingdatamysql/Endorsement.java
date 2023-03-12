package com.example.accessingdatamysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* define Entity */

@Entity // This tells Hibernate to make a table out of this class
@Table(name="vw_arzyab_edrs")
public class Endorsement {

    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ENDORSEMENT_NUMBER")
    private Integer endorsementnumber;

    @Column(name = "POLICY_NO")
    private String policynumber;

    @Column(name = "POLICYHOLDER_NUMBER")
    private String policyholdernumber;

    @Column(name = "field_id")
    private Integer fieldid;

    @Column(name = "field_name")
    private String fieldname;

    @Column(name = "Endorsement_Issue_date")
    private String endorsementissuedate;

    @Column(name = "ENDORSEMENT_START_DATE")
    private String endorsementstartdate;

    @Column(name = "ENDORSEMENT_END_DATE")
    private String endorsementenddate;

    @Column(name = "ENDORSEMENT_PREMIUM")
    private Integer endorsementpremium;

    @Column(name = "ENDORSEMENT_YEAR")
    private Integer endorsementyear;

    @Column(name = "ENDORSEMENT_TYPE")
    private String endorsementtype;

    @Column(name = "TAX")
    private Integer tax;

    @Column(name = "TOLL")
    private Integer toll;

    @Column(name = "HEALTH_TAX")
    private Integer healthtax;

    @Column(name = "INSURANCE_PROCESS_NAME")
    private String description;


    public Integer getEndorsementnumber() {
        return this.endorsementnumber;
    }

    public void setEndorsementnumber(Integer endorsementnumber) {
        this.endorsementnumber = endorsementnumber;
    }

    public String getPolicynumber() {
        return this.policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicyholdernumber() {
        return this.policyholdernumber;
    }

    public void setPolicyholdernumber(String policyholdernumber) {
        this.policyholdernumber = policyholdernumber;
    }

    public Integer getFieldid() {
        return this.fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public String getFieldname() {
        return this.fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public String getEndorsementissuedate() {
        return this.endorsementissuedate;
    }

    public void setEndorsementissuedate(String endorsementissuedate) {
        this.endorsementissuedate = endorsementissuedate;
    }

    public String getEndorsementstartdate() {
        return this.endorsementstartdate;
    }

    public void setEndorsementstartdate(String endorsementstartdate) {
        this.endorsementstartdate = endorsementstartdate;
    }

    public String getEndorsementenddate() {
        return this.endorsementenddate;
    }

    public void setEndorsementenddate(String endorsementenddate) {
        this.endorsementenddate = endorsementenddate;
    }

    public Integer getEndorsementpremium() {
        return this.endorsementpremium;
    }

    public void setEndorsementpremium(Integer endorsementpremium) {
        this.endorsementpremium = endorsementpremium;
    }

    public Integer getEndorsementyear() {
        return this.endorsementyear;
    }

    public void setEndorsementyear(Integer endorsementyear) {
        this.endorsementyear = endorsementyear;
    }

    public String getEndorsementtype() {
        return this.endorsementtype;
    }

    public void setEndorsementtype(String endorsementtype) {
        this.endorsementtype = endorsementtype;
    }

    public Integer getTax() {
        return this.tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getToll() {
        return this.toll;
    }

    public void setToll(Integer toll) {
        this.toll = toll;
    }

    public Integer getHealthtax() {
        return this.healthtax;
    }

    public void setHealthtax(Integer healthtax) {
        this.healthtax = healthtax;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   

}

interface EndorsementList {
    Integer getFieldId();
    String getFieldName();
    String getPolicynumber();
    Integer getEndorsementnumber();
    String getEndorsementissuedate();
    String getEndorsementstartdate();
    String getEndorsementenddate();
    String getEndorsementtype();
    Integer getEndorsementpremium();
}

