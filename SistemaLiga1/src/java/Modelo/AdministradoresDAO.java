/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Juan
 */
public class AdministradoresDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Administradores validar(String nombre_usuario, String contraseña) {
        Administradores adm = new Administradores();
        String sql = "select * from administradores where nombre_usuario=? and contraseña=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre_usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            while (rs.next()) {
                adm.setId(rs.getInt("id"));
                adm.setNombre_usuario(rs.getString("nombre_usuario"));
                adm.setContraseña(rs.getString("contraseña"));
            }
        } catch (Exception e) {
        }
        return adm;
    }
}
