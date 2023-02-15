package com.elmiraantipina.spring.rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//вместо web.xml
public class MyWebInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{MyConfig.class};//из web.xml прошлого проекта <param-value>/WEB-INF/applicationContext.xml</param-value>
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //из web.xml прошлого проекта <url-pattern>/</url-pattern>
    }
}
