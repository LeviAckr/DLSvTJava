// Classe Empregado
public class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}

// Classe Patrão
public class Patrao {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Patrao(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
}

// Classe principal que mostra as informações do empregado e do patrão
public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Programador", 5000.0);
        Patrao patrao = new Patrao("José", "CEO", 100000.0, "Tecnologia");

        // Mostra as informações do empregado
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Cargo: " + empregado.getCargo());
        System.out.println("Salário: " + empregado.getSalario());

        // Mostra as informações do patrão
        System.out.println("Nome: " + patrao.getNome());
        System.out.println("Cargo: " + patrao.getCargo());
        System.out.println("Salário: " + patrao.getSalario());
        System.out.println("Departamento: " + patrao.getDepartamento());
    }
}