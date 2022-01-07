package subsystem2.Cep;

import one.digitalinnovation.Singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCidade(String cep) {
        return "Uberlândia";
    }

    public String getEstado(String cep) {
        return "MG";
    }
}
