package DAO;

import Interfaces.DAOactividadfavorito;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOactividadfavoritoImplementacion extends Conexion implements DAOactividadfavorito {
    @Override
    public boolean Modificar(boolean favorito, int idActividad, int idCliente) throws Exception {
        boolean respuesta = false;
        this.conectar();
        
        try {
            // Verificar si ya existe el registro
            String verificarSql = "SELECT COUNT(*) FROM TBactividad_favorito WHERE idActividad = ? AND idCliente = ?";
            PreparedStatement psVerificar = conexion.prepareStatement(verificarSql);
            psVerificar.setInt(1, idActividad);
            psVerificar.setInt(2, idCliente);
            ResultSet rs = psVerificar.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                // Si existe, actualizar
                String sql = "UPDATE TBactividad_favorito SET favorito = ? WHERE idActividad = ? AND idCliente = ?";
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.setBoolean(1, favorito);
                ps.setInt(2, idActividad);
                ps.setInt(3, idCliente);
                int modificacion = ps.executeUpdate();
                if (modificacion > 0) {
                    respuesta = true;
                }
                ps.close();
            } else {
                // Si no existe, insertar
                String sqlInsert = "INSERT INTO TBactividad_favorito (idActividad, idCliente, favorito) VALUES (?, ?, ?)";
                PreparedStatement psInsert = conexion.prepareStatement(sqlInsert);
                psInsert.setInt(1, idActividad);
                psInsert.setInt(2, idCliente);
                psInsert.setBoolean(3, favorito);
                int insercion = psInsert.executeUpdate();
                if (insercion > 0) {
                    respuesta = true;
                }
                psInsert.close();
            }

            rs.close();
            psVerificar.close();
        } catch (SQLException ex) {
            throw new Exception("Error en Modificar: " + ex.getMessage());
        }

        return respuesta;
    }

    @Override
    public boolean Buscar(int idActividad, int idCliente) throws Exception {
        boolean favorito = false;
        this.conectar();
        try {
            String sql = "SELECT favorito FROM TBactividad_favorito WHERE idCliente = ? AND idActividad = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setInt(2, idActividad);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                favorito = rs.getBoolean("favorito");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
        }
        return favorito;
    }
}
