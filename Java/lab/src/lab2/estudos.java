package lab2;
import java.util.Scanner;

class estudos {
  public static void main(String[] args){
    Scanner ent = new Scanner(System.in);
    // obtem os dados
    String nome,cidade,endere�o,curso;
    int idade,nota;
    
    System.out.println("insira seu nome abaixo");
    nome = ent.next();
    System.out.println("insira sua idade abaixo");
    idade = ent.nextInt();
    System.out.println("insira sua cidade abaixo");
    cidade = ent.next();
    System.out.println("insira seu endere�o abaixo");
    endere�o = ent.next();
    System.out.println("insira seu curso abaixo");
    curso = ent.next();
    System.out.println("insira sua nota do ENEM abaixo");
    nota = ent.nextInt();

    //vari�veis auxiliares
    String area = "";
    String situacao;
    // verifica as condi��es de acordo com os dados

    if(curso.equalsIgnoreCase("medicina")|| curso.equalsIgnoreCase("enfermagem")|| curso.equalsIgnoreCase("fisioterapia")|| curso.equalsIgnoreCase("farm�cia")) {
      area = "saude";
    } else if (curso.equalsIgnoreCase("matem�tica")|| curso.equalsIgnoreCase("engenharia")||curso.equalsIgnoreCase("Gti")|| curso.equalsIgnoreCase("CCO")){
      area = "exatas";
    } else if (curso.equalsIgnoreCase("letras")||curso.equalsIgnoreCase("direito")||curso.equalsIgnoreCase("hist�ria")||curso.equalsIgnoreCase("administra��o")){
      area = "humanas";
    } else {
      System.out.println("Curso n�o identificado no sistema");
    }

    //verifica��o da nota
    if(area.equals("saude")) {
      if (nota >= 650) {
        situacao = "aprovado";
      } else if (nota >= 500 && nota<= 649) {
        situacao = "lista de espera";
      } else {
        situacao = "reprovado";
      }
    } else if (area.equals("exatas")){
      if (nota >= 535){
        situacao = "aprovado";
      } else if(nota >= 450 && nota <= 534){
        situacao = "lista de espera";
      } else {
        situacao = "reprovado";
      }
    } else {
      if (nota >= 450) {
        situacao = "aprovado";
      } else if (nota >= 380 && nota <= 449){
        situacao = "lista de espera";
      } else{
        situacao = "reprovado";
      }
    }
    // mostra as informa��es obtidas
    System.out.println();
    System.out.println("-------------------------------------------------------------");
    System.out.println("DADOS: " + situacao);
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(cidade);
    System.out.println(endere�o);
    System.out.println(curso);
    System.out.println(nota);
    System.out.println("----------------------------------------------------------");





  }
}