public class Tarefa {
    private String titulo;
    private String descricao;
    private String categoria;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, String categoria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.concluida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida (){
        this.concluida = true;
    }
    public void desmarcarConcluida (){
        this.concluida = false;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria='" + categoria + '\'' +
                ", concluida=" + concluida +
                '}';
    }


}
