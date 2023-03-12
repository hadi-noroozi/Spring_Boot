package com.example.accessingdatamysql;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EndorsementRepository extends CrudRepository<Endorsement, Integer> {

    @Query( value = "SELECT field_id AS fieldid, field_name AS fieldname, POLICY_NO AS policynumber, "
                    + "ENDORSEMENT_NUMBER AS endorsementnumber, Endorsement_Issue_date AS endorsementissuedate, "
                    + "ENDORSEMENT_START_DATE AS endorsementstartdate, ENDORSEMENT_END_DATE AS endorsementenddate, "
                    + "ENDORSEMENT_TYPE AS endorsementtype, ENDORSEMENT_PREMIUM AS endorsementpremium "
                    + "FROM vw_arzyab_edrs " 
                    + "WHERE POLICY_NO IN (?1)", nativeQuery = true)
    public Iterable<EndorsementList> findEndorsementListByPolicyNumber(
        List<String> policynumbers
    );

    @Query( value = "SELECT * FROM vw_arzyab_edrs " 
                    + "WHERE POLICY_NO = ?1", nativeQuery = true)
    public Iterable<Endorsement> findEndorsementByPolicyNumber(
        String policynumber
    );

}


