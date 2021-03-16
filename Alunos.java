package Chamada;

public class Alunos {
   String nome;
   String status;

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}



@Override
public String toString() {
    return " - " + nome + ", " + status + "";
}
public Alunos(String nome, String status) {
    this.nome = nome;
    this.status = status;
}
   

   
}
