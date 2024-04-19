package Persistencia;

import jakarta.persistence.*;

public class HibernateConfig {

    private EntityManagerFactory EntityManagerFactory;
    private EntityManager EntityManager;

    public HibernateConfig() {
        this.setEntityManagerFactory(Persistence.createEntityManagerFactory("ad_banco_hiber_PU"));
    }

    public void setEntityManagerFactory(EntityManagerFactory factory) {
        this.EntityManagerFactory = factory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return EntityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return EntityManager = new HibernateConfig().getEntityManagerFactory().createEntityManager();
    }

    public void closeConnection() {
        EntityManager.close();
        EntityManagerFactory.close();
    }
}
