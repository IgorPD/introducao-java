public class Main {
    public String name;
    protected int salary;

    public static void main(String[] args) {
        Ser meuSerAnimal = new Cachorro("Mel", 12, "Igor");
        Ser meuSerHumano = new Pessoa("Igor", 22, "Pereira");
        meuSerAnimal.setNome("Igor");
        System.out.println(meuSerHumano.saudacao());
        System.out.println(meuSerAnimal.saudacao());
    }

    private void atualizaSalario() {
        this.salary = 1000;
    }

    public int getSalary() {
        this.atualizaSalario();
        return this.salary;
    }
}
