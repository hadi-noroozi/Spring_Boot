package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* define Entity */

@Entity // This tells Hibernate to make a table out of this class
@Table(name="vw_arzyab_plcy")
public class PolicyInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "POLICY_ID")
    private Integer id;

    @Column(name = "POLICY_NO")
    private String policynumber;

    @Column(name = "FIELD_ID")
    private Integer fieldid;

    @Column(name = "FIELD_NAME")
    private String fieldname;

    @Column(name = "SUBFIELD_ID")
    private Integer subfieldid;

    @Column(name = "SUBFIELD_NAME")
    private String subfieldname;

    @Column(name = "INSURANCE_SUBJECT_ID")
    private Integer subjectid;

    @Column(name = "SUBJECT_NAME")
    private String subjectname;

    @Column(name = "POLICY_ISSUE_DATE")
    private String policyissuedate;

    @Column(name = "POLICYHOLDER_TYPE")
    private Integer policyholdertype;

    @Column(name = "POLICYHOLDER_NUMBER")
    private String policyholdernumber;

    @Column(name = "POLICYHOLDER_NAME")
    private String policyholdername;

    @Column(name = "POLICYHOLDER_ECONOMICCODE")
    private String policyholdereconomiccode;

    @Column(name = "POLICYHOLDER_GENDER")
    private Integer policyholdergender;
        
    @Column(name = "POLICY_PATTERN_NAME")
    private String policypatternname;

    @Column(name = "POLICY_PATTERN_ID")
    private Integer policypatternid;

    @Column(name = "policy_Year")
    private Integer policyyear;

    @Column(name = "BRANCH_ID")
    private Integer branchid;

    @Column(name = "BRANCH_NAME")
    private String branchname;

    @Column(name = "AGENT_ID")
    private Integer agentid;

    @Column(name = "AGENT_NAME")
    private String agentname;

    @Column(name = "BROKER_ID")
    private Integer brokerid;

    @Column(name = "BROKER_NAME")
    private String brokername;

    @Column(name = "POLICY_SALE_TYPE")
    private String policysaletype;

    @Column(name = "POLICY_START_DATE")
    private String policystartdate;

    @Column(name = "POLICY_END_DATE")
    private String policyenddate;

    @Column(name = "POLICY_DURATION")
    private String policyduration;

    @Column(name = "TOTAL_INSURED")
    private Integer totalinsured;

    @Column(name = "POLICY_PREMIUM")
    private Integer policypremium;

    @Column(name = "TAX")
    private Integer tax;

    @Column(name = "TOLL")
    private Integer toll;

    @Column(name = "HEALTH_TAX")
    private Integer healthtax;

    @Column(name = "BASE_POLICYHOLDER_NAME")
    private String basepolicyholdername;

    @Column(name = "BASE_POLICYHOLDER_NUMBER")
    private String basepolicyholdernumber;

    @Column(name = "province_id")
    private Integer provinceid;

    @Column(name = "province_name")
    private String provincename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policynumber;
    }

    public void setPolicyNumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getFieldId() {
        return fieldid;
    }

    public void setFieldId(String fieldid) {
        this.fieldid = fieldid;
    }

    public String getFieldName() {
        return fieldname;
    }

    public void setFieldName(String fieldname) {
        this.fieldname = fieldname;
    }    

    public String getSubfieldId() {
        return subfieldid;
    }

    public void setSubfieldId(String subfieldid) {
        this.subfieldid = subfieldid;
    }
    
    public String getSubfieldName() {
        return subfieldname;
    }
    
    public void setSubfieldName(String subfieldname) {
        this.subfieldname = subfieldname;
    }  

    public String getSubjectId() {
        return subjectid;
    }

    public void setSubjectId(String subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectName() {
        return subjectname;
    }      

    public void setSubjectName(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getPolicyIssueDate() {
        return policyissuedate;
    }      

    public void setPolicyIssueDate(String policyissuedate) {
        this.policyissuedate = policyissuedate;
    }
  
    public Integer getPolicyholderType() {
        return policyholdertype;
    }

    public void setPolicyholderType(Integer policyholdertype) {
        this.policyholdertype = policyholdertype;
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

    public String getPolicyholderEconomicCode() {
        return policyholdereconomiccode;
    }

    public void setPolicyholderEconomicCode(String policyholdereconomiccode) {
        this.policyholdereconomiccode = policyholdereconomiccode;
    }

}

interface PolicyholderInfo {
   String getPolicyholderNumber();
   String getPolicyholderName();
   Integer getPolicyholderType();
}