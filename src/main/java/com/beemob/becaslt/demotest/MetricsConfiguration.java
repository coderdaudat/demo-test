//package com.beemob.becaslt.demotest;
//
//import io.opentracing.contrib.metrics.MetricLabel;
//import io.opentracing.contrib.metrics.label.BaggageMetricLabel;
//import io.opentracing.contrib.metrics.label.ConstMetricLabel;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by truongnguyen on 12/21/18.
// */
//@Configuration
//public class MetricsConfiguration {
//
//    @Bean
//    public MetricLabel transactionLabel() {
//        return new BaggageMetricLabel("transaction", "n/a");
//    }
//
//    @Bean
//    public MetricLabel versionLabel() {
//        return new ConstMetricLabel("version", System.getenv("VERSION"));
//    }
//
//}
