package com.example.accessingdatamysql;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PolicyInfoRepository extends CrudRepository<PolicyInfo, Integer> {

    @Query( value = "SELECT COUNT(DISTINCT(POLICYHOLDER_NUMBER)) " 
                    + "FROM vw_arzyab_plcy WHERE " 
                    + "POLICY_ISSUE_DATE >= ?1 AND POLICY_ISSUE_DATE <= ?2 " 
                    + "AND (?3 IS NULL OR POLICYHOLDER_NUMBER = ?3) " 
                    + "AND (?4 IS NULL OR POLICYHOLDER_NAME LIKE "+ "%" + "?4" + "%) " 
                    + "AND (FIELD_ID IN (?5) OR COALESCE(?5) IS NULL) "
                    + "AND (?6 IS NULL OR POLICY_NO = ?6) "
                    + "AND (?7 IS NULL OR province_id = ?7) "
                    + "AND (?8 IS NULL OR BRANCH_ID = ?8) "
                    + "AND (?9 IS NULL OR AGENT_ID = ?9) "
                    + "AND (?10 IS NULL OR BROKER_ID = ?10) "
                    + "AND (?11 IS NULL OR BASE_POLICYHOLDER_NUMBER = ?11) " 
                    + "AND (?12 IS NULL OR BASE_POLICYHOLDER_NAME LIKE "+ "%" + "?12" + "%) "
                    + "AND (?13 IS NULL OR POLICY_PATTERN_ID = ?13) " 
                    + "AND (?14 IS NULL OR POLICY_PATTERN_NAME LIKE "+ "%" + "?14" + "%) " , nativeQuery = true)
    public int findCountOfIndividual(
        String lowdate
        , String highdate
        , Optional<String> policyholdernumber
        , Optional<String> policyholdername
        , Optional<List<Long>> fieldid
        , Optional<String> policynumber
        , Optional<Long> provinceid
        , Optional<Long> branchid
        , Optional<Long> agentid
        , Optional<Long> brokerid
        , Optional<String> basepolicyholdernumber
        , Optional<String> basepolicyholdername
        , Optional<Long> policypatternid
        , Optional<String> policypatternname
    );

    @Query( value = "SELECT POLICYHOLDER_TYPE AS policyholdertype, POLICYHOLDER_NAME AS policyholdername, " 
                    + "POLICYHOLDER_NUMBER AS policyholdernumber, POLICYHOLDER_BIRTHDATE AS policyholderbirthdate, " 
                    + "POLICYHOLDER_GENDER AS policyholdergender, BASE_POLICYHOLDER_NUMBER AS basepolicyholdernumber, " 
                    + "BASE_POLICYHOLDER_NAME AS basepolicyholdername, POLICY_PATTERN_ID AS policypatternid, " 
                    + "POLICY_PATTERN_NAME AS policypatternname, POLICYHOLDER_ECONOMICCODE AS policyholdereconomiccode, " 
                    + "FIELD_ID AS fieldid, FIELD_NAME AS fieldname, POLICY_ISSUE_DATE AS policyissuedate " 
                    + "FROM vw_arzyab_plcy WHERE " 
                    + "POLICY_ISSUE_DATE >= ?1 AND POLICY_ISSUE_DATE <= ?2 " 
                    + "AND (?3 IS NULL OR POLICYHOLDER_NUMBER = ?3) "
                    + "AND (?4 IS NULL OR POLICYHOLDER_NAME LIKE "+ "%" + "?4" + "%) " 
                    + "AND (FIELD_ID IN (?5) OR COALESCE(?5) IS NULL) "
                    + "AND (?6 IS NULL OR POLICY_NO = ?6) "
                    + "AND (?7 IS NULL OR province_id = ?7) "
                    + "AND (?8 IS NULL OR BRANCH_ID = ?8) "
                    + "AND (?9 IS NULL OR AGENT_ID = ?9) "
                    + "AND (?10 IS NULL OR BROKER_ID = ?10) "
                    + "AND (?11 IS NULL OR BASE_POLICYHOLDER_NUMBER = ?11) " 
                    + "AND (?12 IS NULL OR BASE_POLICYHOLDER_NAME LIKE "+ "%" + "?12" + "%) "
                    + "AND (?13 IS NULL OR POLICY_PATTERN_ID = ?13) " 
                    + "AND (?14 IS NULL OR POLICY_PATTERN_NAME LIKE "+ "%" + "?14" + "%) "  , nativeQuery = true)
    public Iterable<PolicyholderInfo> findPolicyholderInfo(
        String lowdate
        , String highdate
        , Optional<String> policyholdernumber
        , Optional<String> policyholdername
        , Optional<List<Long>> fieldid
        , Optional<String> policynumber
        , Optional<Long> provinceid
        , Optional<Long> branchid
        , Optional<Long> agentid
        , Optional<Long> brokerid
        , Optional<String> basepolicyholdernumber
        , Optional<String> basepolicyholdername
        , Optional<Long> policypatternid
        , Optional<String> policypatternname
    );

    @Query( value = "SELECT FIELD_ID AS fieldid, FIELD_NAME AS fieldname, POLICY_NO AS policynumber, " 
                    + "POLICY_SALE_TYPE AS policysaletype, POLICY_ISSUE_DATE AS policyissuedate, " 
                    + "POLICY_START_DATE AS policystartdate, POLICY_END_DATE AS policyenddate, " 
                    + "TOTAL_INSURED AS totalinsured, POLICY_PREMIUM AS policypremium, " 
                    + "BRANCH_ID AS branchid, BRANCH_NAME AS branchname, AGENT_ID AS agentid, " 
                    + "AGENT_NAME AS agentname, BROKER_ID AS brokerid, BROKER_NAME AS brokername " 
                    + "FROM vw_arzyab_plcy WHERE " 
                    + "POLICY_ISSUE_DATE >= ?1 AND POLICY_ISSUE_DATE <= ?2 " 
                    + "AND (?3 IS NULL OR POLICYHOLDER_NUMBER = ?3) "
                    + "AND (?4 IS NULL OR POLICYHOLDER_NAME LIKE "+ "%" + "?4" + "%) " 
                    + "AND (FIELD_ID IN (?5) OR COALESCE(?5) IS NULL) "
                    + "AND (?6 IS NULL OR POLICY_NO = ?6) "
                    + "AND (?7 IS NULL OR province_id = ?7) "
                    + "AND (?8 IS NULL OR BRANCH_ID = ?8) "
                    + "AND (?9 IS NULL OR AGENT_ID = ?9) "
                    + "AND (?10 IS NULL OR BROKER_ID = ?10) "
                    + "AND (?11 IS NULL OR BASE_POLICYHOLDER_NUMBER = ?11) " 
                    + "AND (?12 IS NULL OR BASE_POLICYHOLDER_NAME LIKE "+ "%" + "?12" + "%) "
                    + "AND (?13 IS NULL OR POLICY_PATTERN_ID = ?13) " 
                    + "AND (?14 IS NULL OR POLICY_PATTERN_NAME LIKE "+ "%" + "?14" + "%) " , nativeQuery = true)
    public Iterable<PolicyList> findPoliciesListByPolicyNumber(
        String lowdate
        , String highdate
        , Optional<String> policyholdernumber
        , Optional<String> policyholdername
        , Optional<List<Long>> fieldid
        , Optional<String> policynumber
        , Optional<Long> provinceid
        , Optional<Long> branchid
        , Optional<Long> agentid
        , Optional<Long> brokerid
        , Optional<String> basepolicyholdernumber
        , Optional<String> basepolicyholdername
        , Optional<Long> policypatternid
        , Optional<String> policypatternname
    );

    @Query( value = "SELECT * FROM vw_arzyab_plcy " 
                    + "WHERE POLICY_NO = ?1", nativeQuery = true)
    public Iterable<PolicyInfo> findPolicyByPolicyNumber(
        String policynumber
    );

}


