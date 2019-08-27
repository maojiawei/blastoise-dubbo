package io.jovi.blastoise.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import io.jovi.blastoise.common.proxy.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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
@Service
@Component
public class DemoServiceImpl implements DemoService {
    /**
     * hello 样例
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        log.info("someone is calling me......");
        return "say hello to: " + name;
    }
}
