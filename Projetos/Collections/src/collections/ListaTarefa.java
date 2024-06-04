package collections;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        // Inicializa a lista de tarefas
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        // Adiciona uma nova tarefa à lista
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // Cria uma lista temporária para armazenar as tarefas que correspondem à descrição
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        
        // Itera sobre a lista de tarefas
        for (Tarefa t : tarefaList) {
            // Verifica se a descrição da tarefa é igual à descrição fornecida
            if (t.getDescricao().equals(descricao)) {
                // Adiciona a tarefa à lista de tarefas para remover
                tarefasParaRemover.add(t);
            }
        }
        
        // Remove todas as tarefas da lista de tarefas para remover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        // Retorna o número total de tarefas na lista
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        // Imprime a descrição de todas as tarefas na lista
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando algumas tarefas
        System.out.println("Adicionei as tarefas Comprar pao e Estudar para prova");
        listaTarefa.adicionarTarefa("Comprar pão");
        listaTarefa.adicionarTarefa("Estudar para a prova");

        // Imprimindo o número total de tarefas
        System.out.println("O numero de tarefas é: " + listaTarefa.obterNumeroTotalDeTarefas());

        // Removendo uma tarefa
        System.out.println("Aqui removi a tarefa Comprar pao");
        listaTarefa.removerTarefa("Comprar pão");

        // Imprimindo a descrição das tarefas restantes
        System.out.println("Tarefas restantes:");
        listaTarefa.obterDescricaoTarefas();
    }
}
