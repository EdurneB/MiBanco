package DAO;

import LogicaNegocio.Sucursal;
import jakarta.persistence.EntityManager;
import java.util.ArrayList;

public interface SucursalDAO {

    public abstract void createSucursal(Sucursal sucursal, EntityManager entityManager);

    public abstract ArrayList<Sucursal> readSucursal(EntityManager entityManager);

    public abstract void updateSucursal(Sucursal sucursal, EntityManager entityManager);

    public abstract void deleteSucursal(Sucursal sucursal, EntityManager entityManager);

}
