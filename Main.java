public class Main {
  public static void main(String[] args) {
    Programador Nic = new Programador("Nicolas", "123456", false, "Java");
    Professor Alex = new Professor("Alex", "789101", true, "POO");
    Nic.Programar();
    Alex.DarAula();
  }
}