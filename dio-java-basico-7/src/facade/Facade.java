package facade;

import subsistema1crm.CrmService;
import subsistema2cep.CepApi;

public class Facade {
    public void migrarCliente(String nome,String cep){
       String cidade = CepApi.getInstancia().recuperarCidade(cep);
       String estado =  CepApi.getInstancia().recuperaEstado(cep);
        CrmService.gravarCliente(nome,cep, estado,cidade);

    }

}
