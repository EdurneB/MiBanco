/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import LogicaNegocio.Cuenta;
import jakarta.persistence.EntityManager;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CuentaDAO {

    public abstract void createCuenta(Cuenta cuenta, EntityManager entityManager);

    public abstract ArrayList<Cuenta> readCuenta(EntityManager entityManager);

    public abstract void updateCuenta(Cuenta cuenta, EntityManager entityManager);

    public abstract void deleteCuenta(Cuenta cuenta, EntityManager entityManager);

}

