package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void itShouldPrintHello() {
        System.out.println("hello");
        Assertions.assertThat(true).isEqualTo(true);

    }

}


