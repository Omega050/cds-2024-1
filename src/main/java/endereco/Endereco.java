package endereco;

public class Endereco {
    public int numero;
    public String Complemento;
    public String CEP;
    public Bairro bairro;
    public Logradouro logradouro;

    public Endereco(int numero, String Complemento, String CEP, Bairro bairro, Logradouro logradouro) {
        this.numero = numero;
        this.Complemento = Complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this. logradouro = logradouro;
    }
}
