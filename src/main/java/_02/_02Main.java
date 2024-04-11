package _02;

import _02.entities.Customer;
import _02.entities.Product;
import _02.entities.Sale;
import _02.entities.StoreLocation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class _02Main {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("CodeFirstEx");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Product product = new Product("asasa", 123 , BigDecimal.TEN);
        Customer customer = new Customer("niki", "nbojkov@abv.bg" , "asasa");
        StoreLocation storeLocation = new StoreLocation("billa");
        Sale sale = new Sale(product,customer,storeLocation);

        entityManager.persist(product);
        entityManager.persist(customer);
        entityManager.persist(storeLocation);
        entityManager.persist(sale);



        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
