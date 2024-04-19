/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import LogicaNegocio.Cliente;
import jakarta.persistence.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface ClienteDAO {
       public abstract void createCliente(Cliente cliente, EntityManager entityManager);

    public abstract ArrayList<Cliente> readClientes(EntityManager entityManager);

    public abstract void updateCliente(Cliente cliente, EntityManager entityManager);

    public abstract void deleteCliente(Cliente cliente, EntityManager entityManager); 
}
