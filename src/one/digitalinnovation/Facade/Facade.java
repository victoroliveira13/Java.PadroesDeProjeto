package one.digitalinnovation.Facade;

import subsystem1.erp.ErpService;
import subsystem2.Cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().getCidade(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        ErpService.setClient(nome, cep, cidade, estado);
    }
}
