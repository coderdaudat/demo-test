//package com.beemob.becaslt.demotest;
//
//import io.prometheus.client.exporter.MetricsServlet;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by truongnguyen on 12/21/18.
// */
//@Configuration
//@ConditionalOnClass(CollectorRegistry.class)
//public class PrometheusConfiguration {
//
//    @Bean
//    @ConditionalOnMissingBean
//    CollectorRegistry metricRegistry() {
//        return CollectorRegistry.defaultRegistry;
//    }
//
//    @Bean
//    ServletRegistrationBean registerPrometheusExporterServlet(CollectorRegistry metricRegistry) {
//        return new ServletRegistrationBean(new MetricsServlet(metricRegistry), "/metrics");
//    }
//}
