package data;

import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Conexao conexao;
    private Connection conn;

    public UsuarioDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public Usuarios validarUsuario(Usuarios usuario) {

        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha= ?";

        Usuarios usuarioEncontrado = null;

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuarios();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setPermissao(rs.getString("permissao"));
            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }
        return usuarioEncontrado;
    }

    public void inserirUsuario(Usuarios user) {
        String sql = "INSERT INTO usuarios(nome, login, senha, permissao) VALUES " + "(?,?,?,?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getLogin());
            stmt.setString(3, user.getSenha());
            stmt.setString(4, user.getPermissao());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir usuario: " + e.getMessage());

        }

    }

    public Usuarios getUsuario(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Usuarios usuario = new Usuarios();

            rs.next();
            usuario.setId(id);
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPermissao(rs.getString("permissao"));

            return usuario;

        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public void editar(Usuarios usuario) {
        String sql = "UPDATE usuarios SET nome=?, login=?, senha=?, permissao=? WHERE id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getPermissao());
            stmt.setInt(5, usuario.getId());

            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao editar usuario: " + e.getMessage());
        }

    }

    public Usuarios getNomeUsuario(String nomeUsuario) {
        String sql = "SELECT * FROM usuarios WHERE nome LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nomeUsuario);
            ResultSet rs = stmt.executeQuery();

            Usuarios usuario = new Usuarios();

            rs.next();

            usuario.setId(rs.getInt("id"));
            usuario.setNome(nomeUsuario);
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPermissao(rs.getString("permissao"));

            return usuario;

        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public void Excluir(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao excluir empresa: " + e.getMessage());
        }

    }

    public List<Usuarios> getUsuario(String nomeusuario) {
        String sql = "SELECT * FROM usuarios WHERE nome LIKE ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,"%" + nomeusuario + "%");
            ResultSet rs = stmt.executeQuery();

            List<Usuarios> listaUsuarios = new ArrayList<>();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPermissao(rs.getString("permissao"));
                
                listaUsuarios.add(usuario);
            }
            return listaUsuarios;
        } catch (Exception e) {
            return null;
        }
    }

}
