package data;

import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FotovoltaicoDAO {

    private Conexao conexao;
    private Connection conn;

    public FotovoltaicoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserirFV(Fotovoltaico fv) {
        String sql = "INSERT INTO fotovoltaico(fabricante, qtdPlacas, potPlacas,potGerador,potInversor,tipoTelhado,concessionariaEnergia,cliente_id) VALUES " + "(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, fv.getFabricante());
            stmt.setInt(2, fv.getQtdPlacas());
            stmt.setDouble(3, fv.getPotPlacas());
            stmt.setDouble(4, fv.getPotGerador());
            stmt.setDouble(5, fv.getPotInversor());
            stmt.setString(6, fv.getTipoTelhado());
            stmt.setString(7, fv.getConcessionariaEnergia());
            stmt.setInt(8, fv.getCliente_id().getId());
            stmt.execute();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void editar(Fotovoltaico fv) {
        String sql = "UPDATE fotovoltaico SET fabricante=?, qtdPlacas=?, potPlacas=?, potGerador=?, potInversor=?,tipoTelhado=?,concessionariaEnergia=?,cliente_id=? WHERE id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setString(1, fv.getFabricante());
            stmt.setInt(2, fv.getQtdPlacas());
            stmt.setDouble(3, fv.getPotPlacas());
            stmt.setDouble(4, fv.getPotGerador());
            stmt.setDouble(5, fv.getPotInversor());
            stmt.setString(6, fv.getTipoTelhado());
            stmt.setString(7, fv.getConcessionariaEnergia());
            stmt.setInt(8, fv.getCliente_id().getId());
            stmt.setInt(9, fv.getId());

            stmt.execute();

        } catch (Exception e) {
            System.out.println("erro editar" + e.getMessage());
        }

    }

    public void Excluir(int id) {
        String sql = "DELETE FROM fotovoltaico WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public List<Fotovoltaico> getFV() {
        String sql = "SELECT f.id, f.fabricante, f.qtdPlacas, f.potPlacas, f.potGerador, f.potInversor, f.tipoTelhado,f.concessionariaEnergia, c.nome from fotovoltaico f, clientes c WHERE f.cliente_id=c.id;";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Fotovoltaico> listaFotovoltaico = new ArrayList<>();

            while (rs.next()) {
                Fotovoltaico fv = new Fotovoltaico();

                fv.setId(rs.getInt("id"));
                fv.setFabricante(rs.getString("fabricante"));
                fv.setQtdPlacas(rs.getInt("qtdPlacas"));
                fv.setPotPlacas(rs.getDouble("potPlacas"));
                fv.setPotGerador(rs.getDouble("potGerador"));
                fv.setPotInversor(rs.getDouble("potInversor"));
                fv.setTipoTelhado(rs.getString("tipoTelhado"));
                fv.setConcessionariaEnergia(rs.getString("concessionariaEnergia"));

                Clientes cliente = new Clientes();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));

                fv.setCliente_id(cliente);

                listaFotovoltaico.add(fv);
            }
            return listaFotovoltaico;

        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public Fotovoltaico getFotovoltaico(int id) {
        String sql = "SELECT f.id, f.fabricante, f.qtdPlacas, f.potPlacas, f.potGerador, f.potInversor, f.tipoTelhado, f.concessionariaEnergia, c.id AS cliente_id FROM fotovoltaico f INNER JOIN clientes c ON f.cliente_id = c.id WHERE f.id = ?;";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Fotovoltaico fv = new Fotovoltaico();

            rs.next();
            fv.setId(id);
            fv.setFabricante(rs.getString("fabricante"));
            fv.setQtdPlacas(rs.getInt("qtdPlacas"));
            fv.setPotPlacas(rs.getDouble("potPlacas"));
            fv.setPotGerador(rs.getDouble("potGerador"));
            fv.setPotInversor(rs.getDouble("potInversor"));
            fv.setTipoTelhado(rs.getString("tipoTelhado"));
            fv.setConcessionariaEnergia(rs.getString("concessionariaEnergia"));

            Clientes cliente = new Clientes();

            cliente.setId(rs.getInt("cliente_id"));
            fv.setCliente_id(cliente);
                                   
            return fv;

        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public Clientes VerificacaoCliente(int id) {

        int clienteId = id;

        String sql = "SELECT * FROM clientes WHERE id = ?";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, clienteId);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Clientes cliente = new Clientes();
                cliente.setId(rs.getInt("id"));
                System.out.println("Cliente encontrado no banco de dados.");
                return cliente;
            } else {
                System.out.println("Cliente não encontrado no banco de dados.");
                return null;
            }

        } catch (Exception e) {
                 System.out.println("erro: " + e.getMessage());
            return null;
        }

    }
}
