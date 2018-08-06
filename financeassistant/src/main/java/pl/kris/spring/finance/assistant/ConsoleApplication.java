package pl.kris.spring.finance.assistant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.kris.spring.financeassistant.services.RateConversionServiceToPln;

import java.math.BigDecimal;

public class ConsoleApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RateConversionServiceToPln service = context.getBean(RateConversionServiceToPln.class);
        service.convertAmount(BigDecimal.valueOf(123.00), "EUR");


    }
}
