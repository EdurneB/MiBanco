/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacionesDAO;


import DAO.ClienteDAO;
import LogicaNegocio.Cliente;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ImplementacionClienteDAO implements ClienteDAO{

    @Override
    public void createCliente(Cliente cliente, EntityManager entityManager) {
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public ArrayList<Cliente> readClientes(EntityManager entityManager) {
         List<Cliente> clientes = entityManager.createQuery("Select r FROM Sucursal r", Cliente.class).getResultList();
        return new ArrayList<Cliente>(clientes);
    }

    @Override
    public void updateCliente(Cliente cliente, EntityManager entityManager) {
        Cliente aux = entityManager.find(Cliente.class, cliente.getId_cliente());
        entityManager.getTransaction().begin();
        aux.setId_cliente(cliente.getId_cliente());
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    @Override
    public void deleteCliente(Cliente cliente, EntityManager entityManager) {
         Cliente aux = entityManager.find(Cliente.class, cliente.getId_cliente());
        entityManager.getTransaction().begin();
        aux.setId_cliente(cliente.getId_cliente());
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
}
