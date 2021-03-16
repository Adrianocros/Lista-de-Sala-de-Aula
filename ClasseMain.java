package Chamada;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ClasseMain {
    public static void main(String[] args) {

       Alunos aluno1 = new Alunos("Adriano","Faltou");
       Alunos aluno2 = new Alunos("Marcos","Presente");
       Alunos aluno3 = new Alunos("Maria","Faltou");
       Alunos aluno4 = new Alunos("Luiz","Presente");
       Alunos aluno5 = new Alunos("Fernanda","Presente");
       Alunos aluno6 = new Alunos("Luiza","Presente");
       Alunos aluno7 = new Alunos("Ricardo","Faltou");
       Alunos aluno8 = new Alunos("João","Presente");
       Alunos aluno9 = new Alunos("Aline","Faltou");
       Alunos aluno10 = new Alunos("Tamires","Presente");

       List<Alunos> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6,aluno7,aluno8,aluno9,aluno10);
        
       System.out.println("|---------------Menu--------------|");
       System.out.println("|       ---Lista de alunos---     |");
       System.out.println("|                                 |");
       System.out.println("|       1. Alunos Presentes       |");
       System.out.println("|       2. Alunos Faltantes       |");
       System.out.println("|       3. Alunos da sala         |");
       System.out.println("|---------------------------------|");
       Scanner menu = new Scanner(System.in);

       System.out.println("Selecione a opção: ");
       int opcao = menu.nextInt();

      
       switch(opcao){
       
        case 1:
        System.out.println("-----Alunos Presentes-----");
        for(Alunos aluno : alunos){
            if(aluno.getStatus() == "Presente"){
            System.out.println("Alunos presente" + aluno);
            }
       }
        break;

        case 2:
        System.out.println("-----Alunos Faltantes-----");
        for(Alunos aluno : alunos){
            if(aluno.getStatus() == "Faltou"){
            System.out.println("Alunos faltantes" + aluno);
            }
       }
       break;
       case 3:
       System.out.println("-----Alunos da sala-----");
       for(Alunos aluno :alunos){
        System.out.println(aluno.getNome());
       }
       break;

       default:
       System.out.println("Opção invalida");
       
        }
    }


}
