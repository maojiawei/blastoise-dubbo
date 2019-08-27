package io.jovi.blastoise.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2019
 * </p>
 *
 * @author Jovi
 * @version 1.0
 */
@EnableDubboConfiguration
@SpringBootApplication
public class BlastoiseProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlastoiseProviderApplication.class,args);
    }
}
