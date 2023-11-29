import java.sql.SQLOutput;
import java.util.*;

public class ListaDeTarefas {
    private List<Tarefa> tarefas;
    private Set<String> categoriasValidas;


    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
        this.categoriasValidas = new HashSet<>(Arrays.asList("Compras", "Tarefas", "Estudos", "1", "2", "3"));
    }

    public void adicionarTarefa(String titulo, String descricao, String categoria) {
        if (categoriasValidas.contains(categoria)) {
            Tarefa novaTarefa = new Tarefa(titulo, descricao, categoria);
            tarefas.add(novaTarefa);
            System.out.println("Tarefa adicionada: " + titulo);
        } else {
            System.out.println("Categoria inválida. Escolha uma das categorias padronizadas.");
        }
    }

    public void marcaTarefaConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa Concluída: " + tarefas.get(indice));
        } else {
            System.out.println("Comando incorreto");
        }
    }

    public void desmarcarTarefaConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).desmarcarConcluida();
            System.out.println("Tarefa Desmarcada: " + tarefas.get(indice));
        } else {
            System.out.println("Comando incorreto");
        }
    }

    public void exibirTodasTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Você não tem tarefas");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println("\nTarefa " + (i + 1) + ":\n" + tarefas.get(i));
            }
        }
    }

    public void exibirTarefasTerminadas() {
        boolean tarefasTerminadas = false;
        System.out.println("Tarefas Concluídas:");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                System.out.println("\nTarefa:\n" + tarefa);
                tarefasTerminadas = true;
            }
        }

        if (!tarefasTerminadas) {
            System.out.println("Você não tem tarefas concluídas");
        }
    }


    public void exibirTarefasPorCategoria(String categoria) {
        boolean tarefasEncontradas = false;
        System.out.println("Tarefas da categoria " + categoria + ":");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println("\nTarefa:\n" + tarefa);
                tarefasEncontradas = true;
            }
        } if (!tarefasEncontradas) {
            System.out.println("Não existem tarefas na categoria " + categoria + ".");
        }
    }

    public void exibirTarefasEmAberto() {
        boolean tarefasEmAberto = false;
        System.out.println("Tarefas Em Aberto:");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                System.out.println("\nTarefa:\n" + tarefa);
                tarefasEmAberto = true;
            }
        }

        if (!tarefasEmAberto) {
            System.out.println("Você não tem tarefas em aberto");
        }
    }
    }
