package com.multipolar.bootcamp.kyc.service;

import com.multipolar.bootcamp.kyc.domain.Customer;
import com.multipolar.bootcamp.kyc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //get all customers
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    //get customer by id
    public Optional<Customer> getCustomerById(String id){
        return customerRepository.findById(id);
    }

    //create new customer
    public Customer createOrUpdateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    // delete customer
    public void deleteCustomerById(String id){
        customerRepository.deleteById(id);
    }
}
