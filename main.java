class Main {
    public static void main (String args[])  {

    // uso ideal definindo desde o começo
    Feminino p1;
    Masculino p2;

    p1 = new Feminino("Monique",18);
    p2 = new Masculino("Enzo", 18);

    Casamento c = new Casamento (p1,p2);

    // type casting, uso nao ideal, pois começaca com Pessoa p1,p2;
    // Casamento c = new Casamento ((Feminino)p1,(Masculino)p2);

    System.out.println(p1.getNome());
    System.out.println(p2.getNome());
    }
}


