package Dao;

import Conexion.ConexionBD;
import Entity.Cat_Consumo;
import Entity.Cat_descuento;
import Entity.Cat_pago;
import Entity.Cat_periodo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatalogosDao {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();

    public int InsertarConsumo(Cat_Consumo cc) {
        int ret = 0;
        return ret;
    }

    public int InsetarPeriodo(Cat_periodo cp) {
        int ret = 0;
        return ret;
    }

    public int ActualizarConsumo(Cat_Consumo cc) {
        int ret = 0;
        return ret;
    }

    public int ActualizarPeriodo(Cat_periodo cp) {
        int ret = 0;
        return ret;
    }

    public int EliminarConsumo(int id) {
        int ret = 0;
        return ret;
    }

    public int EliminarPeriodo(int id) {
        int ret = 0;
        return ret;
    }
    ///////////////////////////////////////Consumo

    public boolean Insertar_Consumo(String tipo) {

        boolean status = false;

        String sql = "insert into cat_consumo (tipo_consumo) values (?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo);
            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public List<Cat_Consumo> GetConsumo() {
        List<Cat_Consumo> CC = new ArrayList<>();

        String sql = "select * from cat_consumo order by id_consumo";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_Consumo cc = new Cat_Consumo();
                cc.setId_consumo(Resultado.getInt("id_consumo"));
                cc.setTipo_consumo(Resultado.getString("tipo_consumo"));
                CC.add(cc);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CC;
    }

    public int GetIdconsumo(String consumo) {
        int ret = 0;

        String sql = "select id_consumo from cat_consumo where tipo_consumo = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, consumo);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                ret = Resultado.getInt(1);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    ///////////////////////////////////////Periodo
    public boolean Insertar_Periodo(String tipo, int mes){
        boolean status = false;

        String sql = "insert into cat_periodo (tipo_periodo,meses) values (?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo);
            comando.setInt(2, mes);
            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    public List<Cat_periodo> GetPeriodo() {
        List<Cat_periodo> CP = new ArrayList<>();

        String sql = "select * from cat_periodo order by id_periodo";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_periodo cp = new Cat_periodo();
                cp.setId_periodo(Resultado.getInt("id_periodo"));
                cp.setTipo_periodo(Resultado.getString("tipo_periodo"));
                CP.add(cp);
            }
            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CP;
    }

    public int GetIdperiodo(String periodo) {
        int ret = 0;

        String sql = "select id_periodo from cat_periodo where tipo_periodo = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, periodo);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                ret = Resultado.getInt(1);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    //////////////////////////////////////Tipo de pago
    public List<Cat_pago> Tipo_pago() {
        List<Cat_pago> CP = new ArrayList<>();

        String sql = "select * from cat_pago order by id_tipo_pago";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_pago cp = new Cat_pago();
                cp.setId_pago(Resultado.getInt("id_tipo_pago"));
                cp.setTipo_pago(Resultado.getString("tipo_pago"));
                CP.add(cp);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CP;
    }

    public List<Cat_pago> Tipo_pagos() {
        List<Cat_pago> CP = new ArrayList<>();

        String sql = "select * from cat_pago";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_pago cp = new Cat_pago();
                cp.setId_pago(Resultado.getInt("id_tipo_pago"));
                cp.setTipo_pago(Resultado.getString("tipo_pago"));
                CP.add(cp);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CP;
    }

    public List<Cat_descuento> Cat_descuento() {
        List<Cat_descuento> CP = new ArrayList<>();

        String sql = "select porcentaje from cat_descuento order by id_desc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_descuento cd = new Cat_descuento();
                cd.setId_desc(Resultado.getInt("porcentaje"));
                CP.add(cd);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }
}
