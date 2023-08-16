package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    // void -> não vou retornar nada

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    // psvm => public static void main
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        // System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        // System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        // System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        // System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefa(); // list.list.operacoesBasicas.operacoesBasicas.Tarefa@3d075dc0 -> adicionar o toString()

    }
}
