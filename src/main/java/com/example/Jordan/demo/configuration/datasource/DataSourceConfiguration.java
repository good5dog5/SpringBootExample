package com.example.Jordan.demo.configuration.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration("DataSourceConfiguration")
@EnableJpaRepositories(basePackages = {"com.example.Jordan.demo.database.mapper"})
@MapperScan(basePackages = {"com.example.Jordan.demo.database.mapper"})

public class DataSourceConfiguration {
}
