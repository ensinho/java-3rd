class Casamento {
    // vantagens: menor consulta, mais de atualização
    // caso precisa de constante consulta, checagem de que esta casado.
    // usar em pessoa.

    Pessoa p1,p2;
    boolean valido = true;

    Casamento (Pessoa p1, Pessoa p2) {
        
        this.p1 = p1;
        this.p2 = p2;

        if(this.validar()){
            this.p1.setCasamento(this);
            this.p2.setCasamento(this);
        } else this.valido = false;
    }

    boolean validar() {

        // validaçoes das regras de casamento
        
        if (p1 == p2) return false;
        if (p1.getIdade() < 18 ||
            p2.getIdade() < 18 return false);
        if (p1.getCasamento() != null || 
            p2.getCasamento() != null return false);
        return true;
    }
}