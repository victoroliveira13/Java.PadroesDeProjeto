package subsystem1.erp;

public class ErpService {
    private ErpService() {
        super();
    }

    public static void setClient(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no ERP:");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
