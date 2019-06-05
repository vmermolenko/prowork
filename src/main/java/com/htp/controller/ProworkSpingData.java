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

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/rest/springdata/")
public class ProworkSpingData {


    @Autowired
    private OrderSpringDataRepository orderSpringDataRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseEntity<List<HibernateOrder>> getOrderSpringData() {
        return new ResponseEntity<>(orderSpringDataRepository.getAllOrders(), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Page<HibernateOrder>> getOrderfindAll(@ApiIgnore Pageable pageable) {
        return new ResponseEntity<>(orderSpringDataRepository.findAll(pageable), HttpStatus.OK);

    }

    @GetMapping("/getOrderById/{orderID}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<HibernateOrder> getOrderSpringDataById(@PathVariable  Long orderID) {
        return new ResponseEntity<HibernateOrder>(orderSpringDataRepository.getOrderSpringDataById(orderID), HttpStatus.OK);
    }

}


