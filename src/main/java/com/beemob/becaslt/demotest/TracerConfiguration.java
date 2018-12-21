//package com.beemob.becaslt.demotest;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.regex.Pattern;
//
///**
// * Created by truongnguyen on 12/21/18.
// */
//@Configuration
//public class TracerConfiguration implements javax.servlet.ServletContextListener {
//
//    @Bean
//    public io.opentracing.Tracer tracer() {
//        return io.opentracing.contrib.metrics.Metrics.decorate(
//                io.opentracing.contrib.tracerresolver.TracerResolver.resolveTracer(),
//                PrometheusMetricsReporter.newMetricsReporter()
//                        .withBaggageLabel("transaction", "n/a")
//                        .build());
//    }
//
//    @Override
//    public void contextInitialized(javax.servlet.ServletContextEvent sce) {
//        sce.getServletContext().setAttribute(io.opentracing.contrib.web.servlet.filter.TracingFilter.SKIP_PATTERN, Pattern.compile("/metrics"));
//    }
//}
