package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatamysql.Policy;
import com.example.accessingdatamysql.PolicyholderInfo;

import java.util.List;
import java.util.Arrays;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface PolicyRepository extends CrudRepository<Policy, Integer> {
    @Query(value = "SELECT COUNT(*) FROM policy", nativeQuery = true)
    public int findCountUsingNative();

    @Query(value="SELECT * FROM policy WHERE id = ?1", nativeQuery = true)
    public Iterable<Policy> findPolicyById(Integer id);

    @Query(value="SELECT policyholdername FROM policy WHERE id = 0", nativeQuery = true)
    public String findNamePolicy();

    @Query(value="SELECT * FROM policy WHERE policyholdernumber = ?1", nativeQuery = true)
    public List<Policy> findPolicyByPolicyholderNumber(String policyholdernumber);

    @Query(value="SELECT policyholdernumber, policyholdername, policyholdertype FROM policy WHERE policyholdernumber = ?1", nativeQuery = true)
    public List<PolicyholderInfo> findsomeByPolicyholderNumber(String policyholdernumber);

}