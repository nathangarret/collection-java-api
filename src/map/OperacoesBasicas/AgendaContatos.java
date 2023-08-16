package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        /* Ordem aleatória -> */
        agendaContatos.adicionarContato("Camilla", 123456);
        agendaContatos.adicionarContato("Nathan", 123456);
        agendaContatos.adicionarContato("Kaene", 123456);
        agendaContatos.adicionarContato("Evandro", 123456);
        agendaContatos.adicionarContato("Wellington", 123456);
        agendaContatos.adicionarContato("Gusbic", 123456);
        agendaContatos.adicionarContato("Filipe", 153156);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Gusbic");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Kaene"));

    }
}
