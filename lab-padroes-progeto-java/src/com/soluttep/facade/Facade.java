package com.soluttep.facade;

import subsistema1Crm.CrmService;
import subsistema2Cep.CepApi;

public class Facade {
    public void migrarClient(String name, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarClient(name, cep, cidade, estado);
    }
}
