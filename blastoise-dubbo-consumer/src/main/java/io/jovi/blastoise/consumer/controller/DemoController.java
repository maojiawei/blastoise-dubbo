package io.jovi.blastoise.consumer.controller;

import io.jovi.blastoise.common.proxy.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    /**
     *
     * @param name
     * @return
     */
    @GetMapping("/get")
    public String get(String name){
        String str = demoService.sayHello("mercyblitz");
        log.info(str);
        return str;
    }
}
