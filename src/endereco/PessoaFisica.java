package endereco;

import java.util.*;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private List<Endereco> enderecos;

    public PessoaFisica(String nome, String sexo, Date dataNascimento, Endereco end) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.enderecos = new ArrayList<Endereco>();
        this.enderecos.add(end);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco1() {
        return enderecos.get(0);
    }
}
