package org.framework;

import org.framework.Generators.Annotation.ConfigurationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application{

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    private static HashMap<Integer,String> collection = new HashMap();

    public static HashMap<Integer, String> getCollection() {
        return collection;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        HashMap<Integer,String> collection = new HashMap();
        ClassPathScanningCandidateComponentProvider scanner =
                new ClassPathScanningCandidateComponentProvider(false);
        int count = 0;
        scanner.addIncludeFilter(new AnnotationTypeFilter(ConfigurationInfo.class));
        List<String> collect = scanner
                .findCandidateComponents("org.framework.Generators")
                .stream()
                .map(BeanDefinition::getBeanClassName)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        for(String item:collect){
            collection.put(++count, item);
        }
    }
}
