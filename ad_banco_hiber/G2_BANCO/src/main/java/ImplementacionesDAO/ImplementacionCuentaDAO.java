/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacionesDAO;

import DAO.CuentaDAO;
import LogicaNegocio.Cuenta;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class ImplementacionCuentaDAO implements CuentaDAO {

    @Override
    public void createCuenta(Cuenta cuenta, EntityManager entityManager) {
        entityManager.getTransaction().begin();
        entityManager.persist(cuenta);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public ArrayList<Cuenta> readCuenta(EntityManager entityManager) {

        List<Cuenta> cuentas = entityManager.createQuery("Select r FROM Sucursal r", Cuenta.class).getResultList();
        return new ArrayList<Cuenta>(cuentas);
    }

    @Override
    public void updateCuenta(Cuenta cuenta, EntityManager entityManager) {
        Cuenta aux = entityManager.find(Cuenta.class, cuenta.getNumCuenta());
        entityManager.getTransaction().begin();
        aux.setNumCuenta(cuenta.getNumCuenta());
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteCuenta(Cuenta cuenta, EntityManager entityManager) {
        Cuenta aux = entityManager.find(Cuenta.class, cuenta.getNumCuenta());
        entityManager.getTransaction().begin();
        entityManager.remove(aux);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
