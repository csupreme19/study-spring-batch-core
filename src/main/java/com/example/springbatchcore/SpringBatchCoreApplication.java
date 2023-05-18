package com.example.springbatchcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableBatchProcessing
public class SpringBatchCoreApplication {

//    @Bean
//    ApplicationRunner conditionEvaluationReportRunner(ListableBeanFactory listableBeanFactory) {
//        return args -> {
//            Arrays.stream(listableBeanFactory.getBeanDefinitionNames())
//                    .forEach(beanName -> System.out.printf("%s=%s%n", beanName, listableBeanFactory.getBean(beanName)));
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchCoreApplication.class, args);
    }

}
