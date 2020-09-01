package com.example.Jordan.demo.database.mapper;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ProcessInfoMapper")
public interface ProcessInfoMapper {
    List<String> findAllProductIds();
}
