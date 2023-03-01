package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;



@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
        // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    // @Autowired
    // private PolicyRepository policyRepository;

    @Autowired
    private PolicyInfoRepository policyInfoRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
        , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path="/users")
    public @ResponseBody int getUsers() {
        return userRepository.findCountUsingNative();
    }

    // @GetMapping(path="/policy")
    // public @ResponseBody int getCountPolicies() {
    //     return policyRepository.findCountUsingNative();
    // }

    // @GetMapping(path="/policies")
    // public @ResponseBody Iterable<Policy> getAllPolicies() {
    //     // This returns a JSON or XML with the users
    //     return policyRepository.findAll();
    // }

    // @GetMapping(path="/policy/id")
    // public @ResponseBody Iterable<Policy> getPolicies(@RequestParam("id") Integer id) {
    //     // This returns a JSON or XML with the users
    //     return policyRepository.findPolicyById(id);
    // }

    // @GetMapping(path="/policy/name")
    // public @ResponseBody String getNamePolicies() {
    //     return policyRepository.findNamePolicy();
    // }

    // @GetMapping(path="/policy/policyholdernumber")
    // public @ResponseBody List<Policy> getPoliciesByPolicyholderNmmber(@RequestParam("policyholdernumber") String policyholdernumber) {
    //     // This returns a JSON or XML with the users
    //     return policyRepository.findPolicyByPolicyholderNumber(policyholdernumber);
    // }

    // @GetMapping(path="/policy/idname")
    // public @ResponseBody List<PolicyData> getSomeByPolicyholderNmmber(@RequestParam("policyholdernumber") String policyholdernumber) {
    //     // This returns a JSON or XML with the users
    //     return policyRepository.findsomeByPolicyholderNumber(policyholdernumber);
    // }

    @GetMapping(path="/policy/policynumber")
    public @ResponseBody Iterable<PolicyInfo> findPolicy(@RequestParam("policynumber") String policynumber) {
        // This returns a JSON or XML with the users
        return policyInfoRepository.findPolicyByPolicyNumber(policynumber);
    }

    @GetMapping(path="/policyholder")
    public @ResponseBody Iterable<PolicyholderInfo> getSomeByPolicyholderNmmber(
        @RequestParam("policyholdernumber") String policyholdernumber,
        @RequestParam("lowdate") String lowdate,
        @RequestParam("highdate") String highdate
        ) {
        // This returns a JSON or XML with the users
        return policyInfoRepository.findPolicyholderInfo(policyholdernumber, lowdate, highdate);
    }
    
}