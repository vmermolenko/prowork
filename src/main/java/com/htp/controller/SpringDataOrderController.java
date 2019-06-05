package com.htp.controller;

import com.htp.domain.hibernate.HibOrder;
import com.htp.repository.springdata.OrderSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/rest/springdata/")
public class SpringDataOrderController {


    @Autowired
    private OrderSpringDataRepository orderSpringDataRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseEntity<List<HibOrder>> getOrderSpringData() {
        return new ResponseEntity<>(orderSpringDataRepository.getAllOrders(), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Page<HibOrder>> getOrderfindAll(@ApiIgnore Pageable pageable) {
        return new ResponseEntity<>(orderSpringDataRepository.findAll(pageable), HttpStatus.OK);

    }

    @GetMapping("/getOrderById/{orderID}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<HibOrder> getOrderSpringDataById(@PathVariable  Long orderID) {
        return new ResponseEntity<HibOrder>(orderSpringDataRepository.getOrderSpringDataById(orderID), HttpStatus.OK);
    }

}


