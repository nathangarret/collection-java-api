package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        // Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        // Set<LocalDate> dateSet = eventoMap.keySet();
        // Collection<Evento> values = eventoMap.values();
        // eventoMap.get()

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento:" + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
        // System.out.println(dataAtual);
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 15),
                "Evento 1", "Equipe 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 25),
                "Evento 2", "Equipe 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 31),
                "Evento 3", "Equipe 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
