package com.htp.controller;

import com.htp.domain.hibernate.HibernateOrder;
import com.htp.repository.springdata.OrderSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/springdata/")
public class ProworkSpingData {


    @Autowired
    private OrderSpringDataRepository orderSpringDataRepository;


    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Page<HibernateOrder>> getOrderSpringData(@ApiIgnore Pageable pageable) {
        return new ResponseEntity<>(orderSpringDataRepository.findAll(pageable), HttpStatus.OK);
    }

    /*
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public Optional getOrderSpringDataById(@PathVariable  Long orderID) {
        final Optional optional = new Optional<>(orderSpringDataRepository.findById(orderID), HttpStatus.OK);
        return optional;
    }

     */
}


