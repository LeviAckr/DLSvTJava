import java.util.ArrayList;

public class Agenda {
    private String nome;
    private ArrayList<Contato> contatos;

    public Agenda(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public String listarContatos() {
        String listaContatos = "";
        for (Contato contato : this.contatos) {
            listaContatos += contato.toString() + "\n";
        }
        return listaContatos;
    }

    public String listarContato(int indice) {
        if (indice < 0 || indice >= this.contatos.size()) {
            return "Contato não encontrado.";
        }
        return this.contatos.get(indice).toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
}
