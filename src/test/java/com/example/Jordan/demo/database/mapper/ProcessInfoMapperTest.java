package com.example.Jordan.demo.database.mapper;

import com.example.Jordan.demo.DemoApplication;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {DemoApplication.class})
public class ProcessInfoMapperTest {

    @Autowired
    private ProcessInfoMapper processInfoMapper;

    @Test
    public void testCount() {
        List<String> allProductIds = processInfoMapper.findAllProductIds();
        System.out.println(allProductIds.size());
        Assert.assertTrue(allProductIds.size()<10);
    }

}
