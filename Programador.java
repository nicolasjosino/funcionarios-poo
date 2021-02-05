public class Programador extends Funcionario {
  String linguagem_favorita;

  public Programador(String nome, String matricula, boolean graduado, String linguagem_favorita){
    super(nome, matricula, graduado);
    this.linguagem_favorita = linguagem_favorita;   
  }

  public void Programar(){
    System.out.println(nome + " está programando em " + linguagem_favorita);    
  }
}