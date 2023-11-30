public class Tarefa {
    private final String titulo;
    private final String descricao;
    private final String categoria;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, String categoria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.concluida = false;
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
        return "titulo= " + titulo +
                "\ndescricao=" + descricao +
                "\ncategoria=" + categoria +
                "\nconcluida=" + concluida;
    }


}
