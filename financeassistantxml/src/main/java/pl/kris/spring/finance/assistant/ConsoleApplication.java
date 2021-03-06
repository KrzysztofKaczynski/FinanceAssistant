package pl.kris.spring.finance.assistant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.kris.spring.financeassistant.services.RateConversionServiceToPln;

import java.math.BigDecimal;

public class ConsoleApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("pl.kris.spring/finance/assistant/appconfig.xml");
        RateConversionServiceToPln service = context.getBean(RateConversionServiceToPln.class);
        service.convertAmount(BigDecimal.valueOf(1.00), "EUR");


    }
}
