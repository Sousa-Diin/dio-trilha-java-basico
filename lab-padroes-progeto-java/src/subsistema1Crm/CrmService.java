package subsistema1Crm;

public class CrmService {
    private CrmService(){super();};

    public static void gravarClient(String name, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
