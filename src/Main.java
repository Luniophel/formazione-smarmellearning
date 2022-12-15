import animale.specie.Leone;

public class Main {

    public static void main(String[] args) {

        Leone leone = new Leone();
        leone.setNome("Alex");
        leone.setLunghezzaCoda(1.15);

        System.out.println(leone.getNome() + leone.getLunghezzaCoda());
    }
}
