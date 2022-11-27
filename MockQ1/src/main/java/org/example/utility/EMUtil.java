package org.example.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;
    static {
        emf= Persistence.createEntityManagerFactory("mockq1");

    }
    public static EntityManager provideEntityManager(){
        return emf.createEntityManager();
    }
}
