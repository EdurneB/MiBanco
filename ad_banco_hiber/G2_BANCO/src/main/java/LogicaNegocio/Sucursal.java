package LogicaNegocio;

import com.sun.istack.Nullable;
import jakarta.persistence.*;

@Entity(name = "Sucursales")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDSucursal;
    @Column(nullable = false, length = 25)
    private String pais;
    @Column(nullable = false, length = 30)
    private String ciudad;
    @Column(nullable = false, length = 50)
    private String direccion;

    public Sucursal(int IDSucursal, String pais, String ciudad, String direccion) {
        this.IDSucursal = IDSucursal;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Sucursal(String pais, String ciudad, String direccion) {
        this.IDSucursal = IDSucursal;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "IDSucursal=" + IDSucursal + ", pais=" + pais + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }

    public int getIDSucursal() {
        return IDSucursal;
    }

    public void setIDSucursal(int IDSucursal) {
        this.IDSucursal = IDSucursal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
