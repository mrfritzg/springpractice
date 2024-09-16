package springbusinesscalcservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dbsService;

    @Autowired
    public BusinessCalculationService(DataService dbsService) {
        super();
        System.out.println("Constructor Dependency Injection for BusinessCalculationService ");
        this.dbsService = dbsService;
    }

    public int findMax() {
        return Arrays.stream(dbsService.retrieveData()).max().orElse(0);
    }
}
