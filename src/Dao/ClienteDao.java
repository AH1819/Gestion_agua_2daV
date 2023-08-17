package Dao;

import Conexion.ConexionBD;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lombok.Setter;

public class ClienteDao {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();
    @Setter
    Cliente cliente;

    public int InsertarCliente() {
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

    public boolean ActualizarCliente() {
        boolean ret;

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

            ret = true;
        } catch (SQLException e) {
            System.out.println("Actualizar: " + e);
            ret = false;
        }
        return ret;
    }

    public ArrayList<Cliente> MostrarClientes(int opcion) {
        ArrayList<Cliente> CL = new ArrayList<>();

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
                cliente = new Cliente();
                cliente.setFolio_cliente(Integer.parseInt(Resultado.getString("folio_cte")));
                cliente.setNombre(Resultado.getString("nombre") + " "
                        + Resultado.getString("apellido_p") + " "
                        + Resultado.getString("apellido_m"));
                cliente.setFecha_nac(Resultado.getDate("fecha_nac"));
                cliente.setCelular(Resultado.getString("celular"));
                cliente.setEmail(Resultado.getString("email"));
                cliente.setStatus(Resultado.getString("status"));
                cliente.setRfc(Resultado.getString("rfc"));
                cliente.setCurp(Resultado.getString("curp"));
                CL.add(cliente);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }

        return CL;
    }

    public boolean DarDeBajaCliente(int folio) {
        boolean ret;
        String status = "inactivo";
        String sql = "update cliente set status = ? where folio_cte = ?";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, status);
            comando.setInt(2, folio);

            comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            ret = false;
        }

        return ret;
    }

    public boolean DarDeAltaCliente(int folio) {
        boolean ret;
        String status = "activo";
        String sql = "update cliente set status = ? where folio_cte = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, status);
            comando.setInt(2, folio);

            comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            ret = false;
        }
        return ret;
    }

    public Cliente SearchClientes(int folio) {
        cliente = new Cliente();
        String sql = "select * from cliente where folio_cte = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                cliente.setFolio_cliente(Integer.parseInt(Resultado.getString("folio_cte")));
                cliente.setNombre(Resultado.getString("nombre"));
                cliente.setApellido_p(Resultado.getString("apellido_p"));
                cliente.setApellido_m(Resultado.getString("apellido_m"));
                cliente.setFecha_nac(Resultado.getDate("fecha_nac"));
                cliente.setTelefono(Resultado.getString("telefono"));
                cliente.setCelular(Resultado.getString("celular"));
                cliente.setEmail(Resultado.getString("email"));
                cliente.setCurp(Resultado.getString("curp"));
                cliente.setRfc(Resultado.getString("rfc"));
                cliente.setMunicipio(Resultado.getString("municipio"));
                cliente.setResidencia(Resultado.getString("residencia"));
                cliente.setNombre_calle(Resultado.getString("nombre_calle"));
                cliente.setCalle_referencia(Resultado.getString("calle_referencia"));
                cliente.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cliente.setNumero_lote(Resultado.getInt("numero_lt"));
                cliente.setStatus(Resultado.getString("status"));
            }

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error -> " + ex);
        }
        return cliente;
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
                cliente = new Cliente();
                cliente.setFolio_cliente(Integer.parseInt(Resultado.getString("folio_cte")));
                cliente.setNombre(Resultado.getString("nombre"));
                cliente.setApellido_p(Resultado.getString("apellido_p"));
                cliente.setApellido_m(Resultado.getString("apellido_m"));
                cliente.setFecha_nac(Resultado.getDate("fecha_nac"));
                cliente.setResidencia(Resultado.getString("residencia"));
                cliente.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cliente.setNumero_lote(Resultado.getInt("numero_lt"));
                lista.add(cliente);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<Cliente> Pagocl_contrato(int folio) {
        ArrayList<Cliente> lista = new ArrayList<>();
        cliente = new Cliente();
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
                cliente.setConsumo(Resultado.getString("tipo_consumo"));
                cliente.setFolio_cliente(Resultado.getInt("folio_cte"));
                cliente.setNombre(Resultado.getString("nombre"));
                cliente.setApellido_p(Resultado.getString("apellido_p"));
                cliente.setApellido_m(Resultado.getString("apellido_m"));
                cliente.setCelular(Resultado.getString("celular"));
                cliente.setMunicipio(Resultado.getString("municipio"));
                cliente.setResidencia(Resultado.getString("residencia"));
                cliente.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cliente.setNumero_lote(Resultado.getInt("numero_lt"));
                cliente.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cliente);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<Cliente> Pagocl_cte(int folio) {
        ArrayList<Cliente> lista = new ArrayList<>();
        cliente = new Cliente();
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
                cliente.setFolio_cliente(Resultado.getInt("folio_cte"));
                cliente.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cliente.setNombre(Resultado.getString("nombre"));
                cliente.setApellido_p(Resultado.getString("apellido_p"));
                cliente.setApellido_m(Resultado.getString("apellido_m"));
                cliente.setCelular(Resultado.getString("celular"));
                cliente.setMunicipio(Resultado.getString("municipio"));
                cliente.setResidencia(Resultado.getString("residencia"));
                cliente.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cliente.setNumero_lote(Resultado.getInt("numero_lt"));
                cliente.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cliente);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<Cliente> Pagocl_num(String numero) {
        ArrayList<Cliente> lista = new ArrayList<>();
        cliente = new Cliente();
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
                cliente.setFolio_cliente(Resultado.getInt("folio_cte"));
                cliente.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cliente.setCelular(Resultado.getString("celular"));
                cliente.setNombre(Resultado.getString("nombre"));
                cliente.setApellido_p(Resultado.getString("apellido_p"));
                cliente.setApellido_m(Resultado.getString("apellido_m"));
                cliente.setTelefono(Resultado.getString("telefono"));
                cliente.setMunicipio(Resultado.getString("municipio"));
                cliente.setResidencia(Resultado.getString("residencia"));
                cliente.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cliente.setNumero_lote(Resultado.getInt("numero_lt"));
                cliente.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cliente);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<Cliente> Pagocl_numT(String numero) {
        ArrayList<Cliente> lista = new ArrayList<>();
        cliente = new Cliente();
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
                cliente.setFolio_cliente(Resultado.getInt("folio_cte"));
                cliente.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cliente.setTelefono(Resultado.getString("telefono"));
                cliente.setNombre(Resultado.getString("nombre"));
                cliente.setApellido_p(Resultado.getString("apellido_p"));
                cliente.setApellido_m(Resultado.getString("apellido_m"));
                cliente.setCelular(Resultado.getString("celular"));
                cliente.setMunicipio(Resultado.getString("municipio"));
                cliente.setResidencia(Resultado.getString("residencia"));
                cliente.setNumero_manzana(Resultado.getInt("numero_mzn"));
                cliente.setNumero_lote(Resultado.getInt("numero_lt"));
                cliente.setDeuda(Resultado.getDouble("deuda"));
                lista.add(cliente);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
}
