package com.zpp.lsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zpp.lsp.mapper")
public class LspApplication {

    public static void main(String[] args) {
        SpringApplication.run(LspApplication.class, args);
    }

}
