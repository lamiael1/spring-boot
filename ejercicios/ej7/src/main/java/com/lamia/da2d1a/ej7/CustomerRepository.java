package com.lamia.da2d1a.ej7;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findCustomerById(Integer id);
}