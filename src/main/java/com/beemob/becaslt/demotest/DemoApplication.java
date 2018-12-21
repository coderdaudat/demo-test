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

//	public io.opentracing.Tracer jaegerTracer() {
//		return new Configuration("DemoApplication", new Configuration.SamplerConfiguration(ProbabilisticSampler.TYPE, 1),
//				new Configuration.ReporterConfiguration())
//				.getTracer();
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

