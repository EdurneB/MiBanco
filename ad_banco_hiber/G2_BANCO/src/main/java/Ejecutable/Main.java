package Ejecutable;

import ImplementacionesDAO.ImplementacionSucursalDAO;
import LogicaNegocio.Sucursal;
import Persistencia.HibernateConfig;

public class Main {
    
    public static void main(String[] args) {
        HibernateConfig hc = new HibernateConfig();
        ImplementacionSucursalDAO implementacionSucursal = new ImplementacionSucursalDAO();
        Sucursal sucursal = new Sucursal("España", "Madrid", "Zayas");
        implementacionSucursal.createSucursal(sucursal, hc.getEntityManager());
    }
    
}
