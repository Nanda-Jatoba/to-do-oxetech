import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        boolean continuar = true;
        while (continuar) {
            System.out.println("*********************************************************************");
            System.out.println("*                             Escolha uma opção:                    *");
            System.out.println("* 1. Adicionar Tarefa                                               *");
            System.out.println("* 2. Marcar Tarefa como Concluída                                   *");
            System.out.println("* 3. Desmarcar Conclusão de Tarefa                                  *");
            System.out.println("* 4. Exibir Todas as Tarefas                                        *");
            System.out.println("* 5. Exibir Tarefas em Aberto                                       *");
            System.out.println("* 6. Exibir Tarefas Concluídas                                      *");
            System.out.println("* 7. Exibir Tarefas por Categoria                                   *");
            System.out.println("* 8. Sair                                                           *");
            System.out.println("*********************************************************************");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String tituloTarefa = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    System.out.print("Digite a categoria da tarefa entre: \n1.Lista de Compras \n2.Lista de Tarefas \n3.Lista de Estudos \n");
                    String categoriaTarefa = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(tituloTarefa, descricaoTarefa, categoriaTarefa);
                    break;
                case 2:
                    listaDeTarefas.exibirTodasTarefas();
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indiceConcluir = scanner.nextInt();
                    listaDeTarefas.marcaTarefaConcluida(indiceConcluir - 1);
                    break;
                case 3:
                    listaDeTarefas.exibirTodasTarefas();
                    System.out.print("Digite o índice da tarefa para desmarcar a conclusão: ");
                    int indiceDesmarcar = scanner.nextInt();
                    listaDeTarefas.desmarcarTarefaConcluida(indiceDesmarcar - 1);
                    break;
                case 4:
                    System.out.println("                Tarefas");
                    listaDeTarefas.exibirTodasTarefas();
                    break;
                case 5:
                    listaDeTarefas.exibirTarefasEmAberto();
                    break;
                case 6:
                    listaDeTarefas.exibirTarefasTerminadas();
                    break;
                case 7:
                    System.out.print("Digite a categoria para exibir as tarefas: \n1.Lista de Compras \n2.Lista de Tarefas \n3.Lista de Estudos \n");
                    String categoriaExibir = scanner.nextLine();
                    listaDeTarefas.exibirTarefasPorCategoria(categoriaExibir);
                    break;
                case 8:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}