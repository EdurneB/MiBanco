/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import jakarta.persistence.*;

@Entity(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;

    @Column(nullable = false, length = 25)
    private String Nombre;
    @Column(nullable = false, length = 25)
    private String Apellido1;
    @Column(nullable = false, length = 25)
    private String Apellido2;
    @ManyToOne
    @JoinColumn(name = "IDSucursal")
    private int id_sucursal;
    @Column(nullable = false, length = 11)
    private String fecha_alta;
    @Column(nullable = false, length = 25)
    private String password;
    @Column(unique = true)
    private int tlf;

    public Cliente(int id_cliente, String Nombre, String Apellido1, String Apellido2, int id_sucursal, String fecha_alta, String password, int tlf) {
        this.id_cliente = id_cliente;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.id_sucursal = id_sucursal;
        this.fecha_alta = fecha_alta;
        this.password = password;
        this.tlf = tlf;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + ", id_sucursal=" + id_sucursal + ", fecha_alta=" + fecha_alta + ", password=" + password + ", tlf=" + tlf + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

}
