package com.example.accessingdatamysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    @Column(name = "POLICYHOLDER_BIRTHDATE")
    private String policyholderbirthdate;

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
    private Long totalinsured;

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

    public Integer getFieldId() {
        return fieldid;
    }

    public void setFieldId(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public String getFieldName() {
        return fieldname;
    }

    public void setFieldName(String fieldname) {
        this.fieldname = fieldname;
    }    

    public Integer getSubfieldId() {
        return subfieldid;
    }

    public void setSubfieldId(Integer subfieldid) {
        this.subfieldid = subfieldid;
    }
    
    public String getSubfieldName() {
        return subfieldname;
    }
    
    public void setSubfieldName(String subfieldname) {
        this.subfieldname = subfieldname;
    }  

    public Integer getSubjectId() {
        return subjectid;
    }

    public void setSubjectId(Integer subjectid) {
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

    public String getPolicyholderBirthdate() {
        return policyholderbirthdate;
    }

    public void setPolicyholderBirthdate(String policyholderbirthdate) {
        this.policyholderbirthdate = policyholderbirthdate;
    }

    public String getPolicyholderEconomicCode() {
        return policyholdereconomiccode;
    }

    public void setPolicyholderEconomicCode(String policyholdereconomiccode) {
        this.policyholdereconomiccode = policyholdereconomiccode;
    }

    public Integer getPolicyholderGender() {
        return policyholdergender;
    }

    public void setPolicyholderGender(Integer policyholdergender) {
        this.policyholdergender = policyholdergender;
    }

    public String getPolicyPatternName() {
        return policypatternname;
    }      

    public void setPolicyPatternName(String policypatternname) {
        this.policypatternname = policypatternname;
    }

    public Integer getPolicyPatternId() {
        return policypatternid;
    }

    public void setPolicyPatternId(Integer policypatternid) {
        this.policypatternid = policypatternid;
    }

    public Integer getPolicyYear() {
        return policyyear;
    }

    public void setPolicyYear(Integer policyyear) {
        this.policyyear = policyyear;
    }

    public Integer getBranchId() {
        return branchid;
    }

    public void setBranchId(Integer branchid) {
        this.branchid = branchid;
    }

    public String getBranchName() {
        return branchname;
    }

    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }

    public Integer getAgentId() {
        return agentid;
    }

    public void setAgentId(Integer agentid) {
        this.agentid = agentid;
    }

    public String getAgentName() {
        return agentname;
    }

    public void setAgentName(String agentname) {
        this.agentname = agentname;
    }

    public Integer getBrokerId() {
        return brokerid;
    }

    public void setBrokerId(Integer brokerid) {
        this.brokerid = brokerid;
    }

    public String getBrokerName() {
        return brokername;
    }

    public void setBrokerName(String brokername) {
        this.brokername = brokername;
    }

    public String getPolicySaleType() {
        return policysaletype;
    }

    public void setPolicySaleType(String policysaletype) {
        this.policysaletype = policysaletype;
    }

    public String getPolicyStartDate() {
        return policystartdate;
    }      

    public void setPolicyStartDate(String policystartdate) {
        this.policystartdate = policystartdate;
    }

    public String getPolicyEndDate() {
        return policyenddate;
    }      

    public void setPolicyEndDate(String policyenddate) {
        this.policyenddate = policyenddate;
    }

    public String getPolicyDuration() {
        return policyduration;
    }      

    public void setPolicyDuration(String policyduration) {
        this.policyduration = policyduration;
    }    

    public Long getTotalInsured() {
        return totalinsured;
    }

    public void setTotalInsured(Long totalinsured) {
        this.totalinsured = totalinsured;
    }    

    public Integer getPolicyPremium() {
        return policypremium;
    }

    public void setPolicyPremium(Integer policypremium) {
        this.policypremium = policypremium;
    }    

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }    
    
    public Integer getToll() {
        return toll;
    }

    public void setToll(Integer toll) {
        this.toll = toll;
    }    
    
    public Integer getHealthTax() {
        return healthtax;
    }

    public void setHealthTax(Integer healthtax) {
        this.healthtax = healthtax;
    }    
    
    public String getBasePolicyholderName() {
        return basepolicyholdername;
    }      

    public void setBasePolicyholderName(String basepolicyholdername) {
        this.basepolicyholdername = basepolicyholdername;
    }  
    
    public String getBasePolicyholderNumber() {
        return basepolicyholdernumber;
    }      

    public void setBasePolicyholderNumber(String basepolicyholdernumber) {
        this.basepolicyholdernumber = basepolicyholdernumber;
    }      
    
    public Integer getProvinceId() {
        return provinceid;
    }

    public void setProvinceId(Integer provinceid) {
        this.provinceid = provinceid;
    }     
    
    public String getProvinceName() {
        return provincename;
    }      

    public void setProvinceName(String provincename) {
        this.provincename = provincename;
    }      

}

interface PolicyholderInfo {
    Integer getPolicyholderType();
    String getPolicyholderName();
    String getPolicyholderNumber();
    String getPolicyholderBirthdate();
    Integer getPolicyholderGender();
    String getBasePolicyholderNumber();
    String getBasePolicyholderName();
    Integer getPolicyPatternId();
    String getPolicyPatternName();
    String getPolicyholderEconomicCode();
    Integer getFieldId();
    String getFieldName();
    String getPolicyIssueDate();
}

interface PolicyData {
    String getPolicyholderNumber();
    String getPolicyholderName();
    Integer getPolicyholderType();
}