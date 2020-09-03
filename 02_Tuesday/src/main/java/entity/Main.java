package entity;

import dbfacade.CustomerFacade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        CustomerFacade customerFacade = CustomerFacade.getCustomerFacade(emf);

        customerFacade.addCustomer("Kenneth", "sumosan");
        System.out.println(customerFacade.findCustomerById(1).getFirstName());
        List customerByLastName = customerFacade.findCustomerByLastName("kolort");

        for (Object object : customerByLastName) {
            System.out.println(object);
        }
        

    }

}
