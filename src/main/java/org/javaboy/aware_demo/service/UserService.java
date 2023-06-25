package org.javaboy.aware_demo.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/25 19:52
 */
@Service
public class UserService implements BeanNameAware {
    public void sayHello() {
        System.out.println("hello javaboy");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean name is " + name);
    }
}
