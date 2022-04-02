package org.example;

import org.example.service.ProvinceService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
public class ConsumerTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});


        context.start();

        ProvinceService provinceService = (ProvinceService) context.getBean("provinceService");


        System.out.println(provinceService.getAllProvinceList().getCode());

        try {

            System.in.read();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

