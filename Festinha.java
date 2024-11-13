import java.util.Scanner;

public class Festinha {

   
    private int pessoas;
    private String horario;
    private String endereco;
    private boolean entradaRecebida;
    private boolean consomeBebida;


    public static void main(String[] args) {
        Festinha festinha = new Festinha();
        festinha.perguntarPessoas();
        festinha.informarHorario();
        festinha.informarEndereco();
        festinha.perguntarEntrada();
        festinha.perguntarConsumo();
    }


    public void perguntarPessoas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas irão? ");
        setPessoas(scanner.nextInt());
        System.out.println("Número de pessoas: " + getPessoas());
    }


    public void informarHorario() {
        setHorario("20:00");
        System.out.println("A festa começa às: " + getHorario());
    }

    public void informarEndereco() {
        setEndereco("Via cerejeiras, 134, jardim hokkaido");
        System.out.println("O endereço da festa é: " + getEndereco());
    }


    public void perguntarEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você recebeu a entrada? (true/false): ");
        setEntradaRecebida(scanner.nextBoolean());

        if (isEntradaRecebida()) {
            System.out.println("Entrada recebida! Você pode entrar na festa.");
        } else {
            System.out.println("Você não recebeu a entrada. Por favor, procure o organizador.");
        }
    }


    public void perguntarConsumo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você consome bebida alcoólica? (true/false): ");
        setConsomeBebida(scanner.nextBoolean());

        if (isConsomeBebida()) {
            System.out.println("Bebidas alcoólicas serão servidas na festa!");
        } else {
            System.out.println("Teremos opções sem álcool disponíveis.");
        }
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isEntradaRecebida() {
        return entradaRecebida;
    }

    public void setEntradaRecebida(boolean entradaRecebida) {
        this.entradaRecebida = entradaRecebida;
    }

    public boolean isConsomeBebida() {
        return consomeBebida;
    }

    public void setConsomeBebida(boolean consomeBebida) {
        this.consomeBebida = consomeBebida;
    }
}
