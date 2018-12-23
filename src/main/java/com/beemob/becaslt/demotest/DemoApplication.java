package com.beemob.becaslt.demotest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private final static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Start DemoApplication");
		logger.error("Start Error DemoApplication");

	}


//	@Bean
//	public io.opentracing.Tracer jaegerTracer() {
//		Builder builder = new Builder("spring-boot",
//				new RemoteReporter(new HttpSender("http://jaeger-collector.istio-system:14268/api/traces"), 10,
//						65000, new Metrics(new StatsFactoryImpl(new NullStatsReporter()))),
//				new ConstSampler(true))
//				.registerInjector(Builtin.HTTP_HEADERS, new B3TextMapCodec())
//				.registerExtractor(Builtin.HTTP_HEADERS, new B3TextMapCodec());
//		return builder.build();
//	}



//
//	@Bean
//	public io.opentracing.Tracer zipkinTracer() {
//		OkHttpSender okHttpSender = OkHttpSender.builder()
//				.encoding(Encoding.JSON)
//				.endpoint("http://localhost:9411/api/v1/spans")
//				.build();
//		AsyncReporter<Span> reporter = AsyncReporter.builder(okHttpSender).build();
//		Tracing braveTracer = Tracing.newBuilder()
//				.localServiceName("DemoApplication")
//				.reporter(reporter)
//				.traceId128Bit(true)
//				.sampler(Sampler.ALWAYS_SAMPLE)
//				.build();
//		return BraveTracer.create(braveTracer);
//	}

}

