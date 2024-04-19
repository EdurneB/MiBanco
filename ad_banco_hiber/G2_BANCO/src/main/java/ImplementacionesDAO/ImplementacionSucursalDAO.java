package ImplementacionesDAO;

import DAO.SucursalDAO;
import LogicaNegocio.Sucursal;
import jakarta.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionSucursalDAO implements SucursalDAO {

    @Override
    public void createSucursal(Sucursal sucursal, EntityManager entityManager) {
        entityManager.getTransaction().begin();
        entityManager.persist(sucursal);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public ArrayList<Sucursal> readSucursal(EntityManager entityManager) {
        List<Sucursal> sucursales = entityManager.createQuery("Select r FROM Sucursal r", Sucursal.class).getResultList();
        return new ArrayList<Sucursal>(sucursales);
    }

    @Override
    public void updateSucursal(Sucursal sucursal, EntityManager entityManager) {
        Sucursal aux = entityManager.find(Sucursal.class, sucursal.getIDSucursal());
        entityManager.getTransaction().begin();
        aux.setIDSucursal(sucursal.getIDSucursal());
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void deleteSucursal(Sucursal sucursal, EntityManager entityManager) {
        Sucursal aux = entityManager.find(Sucursal.class, sucursal.getIDSucursal());
        entityManager.getTransaction().begin();
        entityManager.remove(aux);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
