package springbusinesscalcservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalcLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (BusinessCalcLauncherApplication.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
