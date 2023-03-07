package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface PolicyInfoRepository extends CrudRepository<PolicyInfo, Integer> {

    @Query(value="SELECT * FROM vw_arzyab_plcy WHERE  POLICY_NO = ?1", nativeQuery = true)
    public Iterable<PolicyInfo> findPolicyByPolicyNumber(String policynumber);

    @Query( value = "SELECT POLICYHOLDER_TYPE AS policyholdertype, POLICYHOLDER_NAME AS policyholdername, " +
                    "POLICYHOLDER_NUMBER AS policyholdernumber, POLICYHOLDER_BIRTHDATE AS policyholderbirthdate, " + 
                    "POLICYHOLDER_GENDER AS policyholdergender, BASE_POLICYHOLDER_NUMBER AS basepolicyholdernumber, " +
                    "BASE_POLICYHOLDER_NAME AS basepolicyholdername, POLICY_PATTERN_ID AS policypatternid, " +
                    "POLICY_PATTERN_NAME AS policypatternname, POLICYHOLDER_ECONOMICCODE AS policyholdereconomiccode, " +
                    "FIELD_ID AS fieldid, FIELD_NAME AS fieldname, POLICY_ISSUE_DATE AS policyissuedate " +
                    "FROM vw_arzyab_plcy WHERE POLICYHOLDER_NUMBER = ?1 AND " +
                    "POLICY_ISSUE_DATE >= ?2 and POLICY_ISSUE_DATE <= ?3", nativeQuery = true)
    public Iterable<PolicyholderInfo> findPolicyholderInfo(String policyholdernumber, String lowdate, String highdate);

    @Query(value = "SELECT COUNT(DISTINCT(POLICYHOLDER_NUMBER)) " + 
                    "FROM vw_arzyab_plcy WHERE POLICYHOLDER_NUMBER = ?1 AND " +
                    "POLICY_ISSUE_DATE >= ?2 AND POLICY_ISSUE_DATE <= ?3", nativeQuery = true)
    public int findCountOfIndividual(String policyholdernumber, String lowdate, String highdate);

}


