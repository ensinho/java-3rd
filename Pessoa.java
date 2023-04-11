abstract class Pessoa{
    private String nome;
    private int idade;
    private char sexo;
    private Casamento casamento;

    Pessoa(){
        this("sem nome", 0, ' ');
    }

    Pessoa(String nome){
        this(nome,0,' ');
    }

    Pessoa(String nome, int idade){
        this(nome,idade,' ');
    }   

    Pessoa(String nome, int idade, char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    String getNome(){
        this.nome = nome;
    }
    void setNome(String nome){
        return this.nome;
    }

    int getIdade(){
        return this.idade;
    }

    void  setIdade(int idade){
        this.idade = idade;
    }  

    void setCasamento(Casamento casamento){
        this.casamento = casamento;
    }
    Casamento getCasamento(){
        return this.casamento;
    }
}
