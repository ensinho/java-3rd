class Universidade {
    private String nome;

    public Universidade(String nome) {
        this.nome = nome;
    }
    
  // metodo para informar o nome ( obvio )
    public String informaNome() {
        return nome;
    }
}

class Pessoa {
    private String nome;
    private Universidade universidade;
    
   // de maneira mais basica sempre vao haver os this.x = x
    public Pessoa(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }

    public String informaNome() {
        return nome;
    }

    public String informaUniversidade() {
        return universidade.informaNome();
    }
}

public class Main {
    public static void main(String[] args) {
      // criaçao de dois exemplos pedidos numa questao 
      // onde se adicionavam duas pessoas e suas respectivas universidades
        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        Pessoa einstein = new Pessoa("Albert Einstein", princeton);
        Pessoa newton = new Pessoa("Isaac Newton", cambridge);

        System.out.println(einstein.informaNome() + " trabalhou como professor de física em " + einstein.informaUniversidade());
        System.out.println(newton.informaNome() + " trabalhou como professor de matemática em " + newton.informaUniversidade());
    }
}
