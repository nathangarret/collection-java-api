package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    };

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("Contato 1", 123456);
        agendaContato.adicionarContato("Contato 2", 324153);
        agendaContato.adicionarContato("Contato 3", 153616);
        agendaContato.adicionarContato("Contato 4", 636266);
        agendaContato.adicionarContato("Contato 5", 984827);
        agendaContato.adicionarContato("Contato 6", 543825);
        agendaContato.adicionarContato("Contato 7", 327847);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Contato 1"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Contato 1", 825471));

        agendaContato.exibirContato();
    }

}
