package Dao;

import Conexion.ConexionBD;
import Entity.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDaoR {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();

    public int InsertarCliente(Cliente cliente) {
        int id = 0;
        String sql = "insert into cliente (nombre,apellido_p,apellido_m,fecha_nac,telefono,celular,email,curp,rfc,municipio,residencia,nombre_calle,calle_referencia,numero_mzn,numero_lt,status) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, cliente.getNombre());
            comando.setString(2, cliente.getApellido_p());
            comando.setString(3, cliente.getApellido_m());
            comando.setDate(4, cliente.getFecha_nac());
            comando.setString(5, cliente.getTelefono());
            comando.setString(6, cliente.getCelular());
            comando.setString(7, cliente.getEmail());
            comando.setString(8, cliente.getCurp());
            comando.setString(9, cliente.getRfc());
            comando.setString(10, cliente.getMunicipio());
            comando.setString(11, cliente.getResidencia());
            comando.setString(12, cliente.getNombre_calle());
            comando.setString(13, cliente.getCalle_referencia());
            comando.setInt(14, cliente.getNumero_manzana());
            comando.setInt(15, cliente.getNumero_lote());
            comando.setString(16, cliente.getStatus());

            comando.executeUpdate();
            Resultado = comando.getGeneratedKeys();

            if (Resultado.next()) {
                id = Resultado.getInt(1);
            }

            conexion.conectar().close();
            comando.close();

            return id;
        } catch (SQLException e) {
            System.out.println("" + e.getSQLState());
            System.out.println("" + e.getMessage());
            return -1;
        }
    }

    public int ActualizarCliente(Cliente cliente) {
        int ret = 0;

        String sql = "update cliente set nombre = ? , apellido_p = ?, apellido_m = ?,"
                + "fecha_nac = ?, telefono = ?,celular = ?,email = ?,curp = ?, rfc = ?,"
                + "municipio = ?, residencia = ?,nombre_calle = ?,calle_referencia = ?,"
                + "numero_mzn = ?,numero_lt = ?"
                + "where folio_cte = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, cliente.getNombre());
            comando.setString(2, cliente.getApellido_p());
            comando.setString(3, cliente.getApellido_m());
            comando.setDate(4, cliente.getFecha_nac());
            comando.setString(5, cliente.getTelefono());
            comando.setString(6, cliente.getCelular());
            comando.setString(7, cliente.getEmail());
            comando.setString(8, cliente.getCurp());
            comando.setString(9, cliente.getRfc());
            comando.setString(10, cliente.getMunicipio());
            comando.setString(11, cliente.getResidencia());
            comando.setString(12, cliente.getNombre_calle());
            comando.setString(13, cliente.getCalle_referencia());
            comando.setInt(14, cliente.getNumero_manzana());
            comando.setInt(15, cliente.getNumero_lote());
            comando.setInt(16, cliente.getFolio_cliente());
            System.out.println("comando:" + comando);
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();

            ret = 1;
        } catch (SQLException e) {
            System.out.println("Actualizar: " + e);
            ret = -1;
        }
        return ret;
    }

    public List<Cliente> MostrarClientes(int opcion) {
        List<Cliente> CL = new ArrayList<>();

        String opcionTipo = "";
        switch (opcion) {
            case 0:
                opcionTipo = " ";
                break;
            case 1:
                opcionTipo = "where status = 'activo'";
                break;
            case 2:
                opcionTipo = "where status = 'inactivo'";
                break;
        }

        String sql = "select * from cliente "
                + opcionTipo
                + " order by folio_cte";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setFolio_cliente(Integer.parseInt(Resultado.getString("folio_cte")));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setFecha_nac(Resultado.getDate("fecha_nac"));
                cl.setCelular(Resultado.getString("celular"));
                cl.setEmail(Resultado.getString("email"));
                cl.setStatus(Resultado.getString("status"));
                cl.setRfc(Resultado.getString("rfc"));
                cl.setCurp(Resultado.getString("curp"));
                CL.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }

        return CL;
    }

    public int DarDeBajaCliente(int folio) {
        int ret = 0;
        String status = "inactivo";
        String sql = "update cliente set status = ? where folio_cte = ?";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, status);
            comando.setInt(2, folio);

            ret = comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex.getMessage());

        }

        return ret;
    }

    public int DarDeAltaCliente(int folio) {
        int ret = 0;
        String status = "activo";
        String sql = "update cliente set status = ? where folio_cte = ?";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, status);
            comando.setInt(2, folio);

            ret = comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex.getMessage());

        }

        return ret;
    }

    public List<Cliente> SearchClientes(int folio) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "select * from cliente where folio_cte = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setFolio_cliente(Integer.parseInt(Resultado.getString("folio_cte")));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setFecha_nac(Resultado.getDate("fecha_nac"));
                cl.setTelefono(Resultado.getString("telefono"));
                cl.setCelular(Resultado.getString("celular"));
                cl.setEmail(Resultado.getString("email"));
                cl.setCurp(Resultado.getString("curp"));
                cl.setRfc(Resultado.getString("rfc"));
                cl.setMunicipio(Resultado.getString("municipio"));
                cl.setResidencia(Resultado.getString("residencia"));
                cl.setNombre_calle(Resultado.getString("nombre_calle"));
                cl.setCalle_referencia(Resultado.getString("calle_referencia"));
                cl.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cl.setNumero_lote(Resultado.getInt("numero_lt"));
                cl.setStatus(Resultado.getString("status"));
                lista.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error -> " + ex);
        }
        return lista;
    }

    public List<Cliente> ClientesC(int folio) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "select cl.folio_cte,cl.nombre,cl.apellido_p,cl.apellido_m,cl.fecha_nac,cl.residencia,cl.numero_mzn,cl.numero_lt "
                + "from cliente cl "
                + "inner join contrato ct "
                + "on ct.folio_cte = cl.folio_cte "
                + "where folio_contrato = ? ";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setFolio_cliente(Integer.parseInt(Resultado.getString("folio_cte")));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setFecha_nac(Resultado.getDate("fecha_nac"));
                cl.setResidencia(Resultado.getString("residencia"));
                cl.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cl.setNumero_lote(Resultado.getInt("numero_lt"));
                lista.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public List<Cliente> Pagocl_contrato(int folio) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "select tc.tipo_consumo,cl.folio_cte,cl.nombre, cl.apellido_p, cl.apellido_m,cl.celular,"
                + "ct.municipio,ct.residencia,ct.numero_mzn,ct.numero_lt,ct.deuda "
                + "from contrato ct "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "inner join cat_consumo tc "
                + "on tc.id_consumo = ct.id_consumo "
                + "where ct.folio_contrato = ? and cl.status = 'activo' ";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setConsumo(Resultado.getString("tipo_consumo"));
                cl.setFolio_cliente(Resultado.getInt("folio_cte"));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setCelular(Resultado.getString("celular"));
                cl.setMunicipio(Resultado.getString("municipio"));
                cl.setResidencia(Resultado.getString("residencia"));
                cl.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cl.setNumero_lote(Resultado.getInt("numero_lt"));
                cl.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public List<Cliente> Pagocl_cte(int folio) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "select cl.folio_cte,ct.folio_contrato,cl.nombre, cl.apellido_p, cl.apellido_m,cl.celular,ct.municipio,ct.residencia,ct.numero_mzn,ct.numero_lt,ct.deuda "
                + "from contrato ct "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "where ct.folio_cte = ? and cl.status = 'activo'";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setFolio_cliente(Resultado.getInt("folio_cte"));
                cl.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setCelular(Resultado.getString("celular"));
                cl.setMunicipio(Resultado.getString("municipio"));
                cl.setResidencia(Resultado.getString("residencia"));
                cl.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cl.setNumero_lote(Resultado.getInt("numero_lt"));
                cl.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public List<Cliente> Pagocl_num(String numero) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "select cl.folio_cte,ct.folio_contrato,cl.celular,cl.nombre, cl.apellido_p, cl.apellido_m,cl.telefono,ct.municipio,ct.residencia,ct.numero_mzn,ct.numero_lt,ct.deuda "
                + "from contrato ct "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "where cl.celular = ? and cl.status = 'activo' ";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, numero);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setFolio_cliente(Resultado.getInt("folio_cte"));
                cl.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cl.setCelular(Resultado.getString("celular"));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setTelefono(Resultado.getString("telefono"));
                cl.setMunicipio(Resultado.getString("municipio"));
                cl.setResidencia(Resultado.getString("residencia"));
                cl.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cl.setNumero_lote(Resultado.getInt("numero_lt"));
                cl.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public List<Cliente> Pagocl_numT(String numero) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "select cl.folio_cte,ct.folio_contrato,cl.telefono,cl.celular,cl.nombre, cl.apellido_p, cl.apellido_m,cl.celular,ct.municipio,ct.residencia,ct.numero_mzn,ct.numero_lt,ct.deuda "
                + "from contrato ct "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "where cl.telefono = ? and cl.status = 'activo' ";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, numero);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Cliente cl = new Cliente();
                cl.setFolio_cliente(Resultado.getInt("folio_cte"));
                cl.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cl.setTelefono(Resultado.getString("telefono"));
                cl.setNombre(Resultado.getString("nombre"));
                cl.setApellido_p(Resultado.getString("apellido_p"));
                cl.setApellido_m(Resultado.getString("apellido_m"));
                cl.setCelular(Resultado.getString("celular"));
                cl.setMunicipio(Resultado.getString("municipio"));
                cl.setResidencia(Resultado.getString("residencia"));
                cl.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cl.setNumero_lote(Resultado.getInt("numero_lt"));
                cl.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cl);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoR.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
}
