import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();

        Endereco(cep);



    }
    public static void Endereco (String cep){
        try {
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
            System.out.println("Logradouro: " + endereco.getLogradouro());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("Localidade: " + endereco.getLocalidade());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
