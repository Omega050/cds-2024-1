package endereco;

public class Endereco {
    private int numero;
    private String Complemento;
    private String CEP;
    private Bairro bairro;
    private Logradouro logradouro;
    private TipoEndereco tipoEndereco;

    public Endereco(int numero, String Complemento, String CEP, Bairro bairro, Logradouro logradouro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.Complemento = Complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this. logradouro = logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCEP() {
        return this.CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Bairro getBairro() {
        return this.bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public TipoEndereco getTipoEndereco() {
        return this.tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
