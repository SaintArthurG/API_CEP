package entities;

import services.ServicoDeCep;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;

    public Endereco(){

    }

    public Endereco(String logradouro, String bairro, String localidade) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "entities.Endereco{" +
                "logradouo='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }

    public void catchEndereco(String cep) {
        try {
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
            System.out.println("Logradouro: " + endereco.getLogradouro());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("Localidade: " + endereco.getLocalidade());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}