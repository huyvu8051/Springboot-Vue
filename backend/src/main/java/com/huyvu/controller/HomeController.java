package com.huyvu.controller;

import com.github.javafaker.Faker;
import com.huyvu.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Slf4j
@RestController
@RequestMapping("api")
public class HomeController {

    private Faker faker;

    {
        faker = new Faker(new Locale("vi-VN"));
    }


    //@GetMapping("/product")
    public List<Product> getListProduct(){

        List<Product> l = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            l.add(Product.builder()
                            .id(faker.idNumber().hashCode())
                            .name(faker.hacker().noun())
                            .unitPrice(faker.number().randomDigit())

                    .build());
        }

        return l;
    }



}
