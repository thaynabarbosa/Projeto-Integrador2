package data;

public class Fotovoltaico {

    private int id;
    private String fabricante;
    private int qtdPlacas;
    private double potPlacas;
    private double potGerador;
    private double potInversor;
    private String tipoTelhado;
    private String concessionariaEnergia;
    private Clientes cliente_id;

    public Fotovoltaico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQtdPlacas() {
        return qtdPlacas;
    }

    public void setQtdPlacas(int qtdPlacas) {
        this.qtdPlacas = qtdPlacas;
    }

    public double getPotPlacas() {
        return potPlacas;
    }

    public void setPotPlacas(double potPlacas) {
        this.potPlacas = potPlacas;
    }

    public double getPotGerador() {
        return potGerador;
    }

    public void setPotGerador(double potGerador) {
        this.potGerador = potGerador;
    }

    public double getPotInversor() {
        return potInversor;
    }

    public void setPotInversor(double potInversor) {
        this.potInversor = potInversor;
    }

    public String getTipoTelhado() {
        return tipoTelhado;
    }

    public void setTipoTelhado(String tipo_telhado) {
        this.tipoTelhado = tipo_telhado;
    }

    public String getConcessionariaEnergia() {
        return concessionariaEnergia;
    }

    public void setConcessionariaEnergia(String concessionaria_energia) {
        this.concessionariaEnergia = concessionaria_energia;
    }

    public Clientes getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Clientes cliente_id) {
        this.cliente_id = cliente_id;
    }

  

}
