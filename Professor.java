public class Professor extends Funcionario {
  String cadeira;

  public Professor(String nome, String matricula, boolean graduado, String cadeira){
    super(nome, matricula, graduado);
    this.cadeira = cadeira;
  }

  public void DarAula(){
    System.out.println(nome + " está dando aula de " + cadeira);
  }
}