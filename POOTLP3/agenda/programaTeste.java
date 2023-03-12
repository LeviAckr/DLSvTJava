import java.util.Scanner;

public class ProgramaTesteAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da agenda: ");
        String nomeAgenda = scanner.nextLine();
        Agenda agenda = new Agenda(nomeAgenda);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Contato " + i + ": ");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            Contato contato = new Contato(nome, telefone, email);
            agenda.adicionarContato(contato);
        }

        System.out.println("-------- Agenda " + agenda.getNome() + " --------");
        System.out.println(agenda.listarContatos());
    }
}
