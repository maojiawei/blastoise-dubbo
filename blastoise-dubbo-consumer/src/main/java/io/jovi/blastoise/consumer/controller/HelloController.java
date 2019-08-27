package io.jovi.blastoise.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.jovi.blastoise.common.proxy.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@Slf4j
public class HelloController {
    @Reference
    private DemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(defaultValue = "xkcoding") String name) {
        log.info("i'm ready to call someone......");
        return demoService.sayHello(name);
    }
}
