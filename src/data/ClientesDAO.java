package data;

import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {

    private Conexao conexao;
    private Connection conn;

    public ClientesDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserirCliente(Clientes cliente) {
        String sql = "INSERT INTO clientes(nome, cpf_cnpj, endereco,numero,complemento,bairro,cidade,uf,cep,email,telefone) VALUES " + "(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf_cnpj());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getNumero());
            stmt.setString(5, cliente.getComplemento());
            stmt.setString(6, cliente.getBairro());
            stmt.setString(7, cliente.getCidade());
            stmt.setString(8, cliente.getUF());
            stmt.setString(9, cliente.getCep());
            stmt.setString(10, cliente.getEmail());
            stmt.setString(11, cliente.getTelefone());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }

    }

    public Clientes getClientes(int id) {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Clientes cliente = new Clientes();

            rs.next();

            cliente.setId(id);
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setComplemento(rs.getString("complemento"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setUF(rs.getString("uf"));
            cliente.setCep(rs.getString("cep"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));

            return cliente;

        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public void editar(Clientes cliente) {
        String sql = "UPDATE clientes SET nome=?, cpf_cnpj=?, endereco=?, numero=?, complemento=?,bairro=?,cidade=?,uf=?,cep=?,email=?,telefone=? WHERE id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf_cnpj());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getNumero());
            stmt.setString(5, cliente.getComplemento());
            stmt.setString(6, cliente.getBairro());
            stmt.setString(7, cliente.getCidade());
            stmt.setString(8, cliente.getUF());
            stmt.setString(9, cliente.getCep());
            stmt.setString(10, cliente.getEmail());
            stmt.setString(11, cliente.getTelefone());
            stmt.setInt(12, cliente.getId());

            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao editar usuario: " + e.getMessage());
        }

    }

    public Clientes getNomeCliente(String nomeCliente) {
        String sql = "SELECT * FROM clientes WHERE nome LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,"%" + nomeCliente + "%");
            ResultSet rs = stmt.executeQuery();

            Clientes cliente = new Clientes();

            rs.next();

            cliente.setId(rs.getInt("id"));
            cliente.setNome(nomeCliente);
            cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setComplemento(rs.getString("complemento"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setUF(rs.getString("uf"));
            cliente.setCep(rs.getString("cep"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));

            return cliente;

        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public void Excluir(int id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao excluir empresa: " + e.getMessage());
        }

    }

    public List<Clientes> getCliente(String nomeCliente) {
        String sql = "SELECT * FROM clientes WHERE nome LIKE ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,"%" + nomeCliente + "%");
            ResultSet rs = stmt.executeQuery();

            List<Clientes> listaClientes = new ArrayList<>();

            while (rs.next()) {
                Clientes cliente = new Clientes();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUF(rs.getString("uf"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));

                listaClientes.add(cliente);
            }
            return listaClientes;
            
        } catch (Exception e) {
            return null;
        }
    }

}
