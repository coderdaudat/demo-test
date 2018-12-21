//package com.beemob.becaslt.demotest;
//
//import io.jaegertracing.internal.JaegerTracer;
//import io.jaegertracing.internal.reporters.InMemoryReporter;
//import io.jaegertracing.internal.samplers.ConstSampler;
//import io.jaegertracing.spi.Reporter;
//import io.jaegertracing.spi.Sampler;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by truongnguyen on 12/21/18.
// */
//@ConditionalOnProperty(value = "opentracing.jaeger.enabled", havingValue = "true", matchIfMissing = false)
//@Configuration
//public class MyTracerConfiguration {
//
//    @Bean
//    public io.opentracing.Tracer jaegerTracer() {
//        final Reporter reporter = new InMemoryReporter();
//        final Sampler sampler = new ConstSampler(false);
//        return new JaegerTracer.Builder("DemoService")
//                .withReporter(reporter)
//                .withSampler(sampler)
//                .build();
//    }
//}
//
