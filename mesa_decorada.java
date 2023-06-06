// Interface que define o comportamento da Mesa
interface Mesa {
    void decorar();
}

// Implementação básica da Mesa
class MesaBasica implements Mesa {
    @Override
    public void decorar() {
        System.out.println("Mesa básica");
    }
}

// Decorator abstrato que implementa a interface Mesa
abstract class MesaDecorator implements Mesa {
    protected Mesa mesaDecorada;

    public MesaDecorator(Mesa mesaDecorada) {
        this.mesaDecorada = mesaDecorada;
    }

    public void decorar() {
        mesaDecorada.decorar();
    }
}

// Decorator para adicionar rodas à Mesa
class MesaComRodas extends MesaDecorator {
    public MesaComRodas(Mesa mesaDecorada) {
        super(mesaDecorada);
    }

    @Override
    public void decorar() {
        super.decorar();
        adicionarRodas();
    }

    private void adicionarRodas() {
        System.out.println("Adicionando rodas à mesa");
    }
}

// Decorator para adicionar toalha à Mesa
class MesaComToalha extends MesaDecorator {
    public MesaComToalha(Mesa mesaDecorada) {
        super(mesaDecorada);
    }

    @Override
    public void decorar() {
        super.decorar();
        adicionarToalha();
    }

    private void adicionarToalha() {
        System.out.println("Adicionando toalha à mesa");
    }
}

// Decorator para adicionar rede de ping pong à Mesa
class MesaComRedePingPong extends MesaDecorator {
    public MesaComRedePingPong(Mesa mesaDecorada) {
        super(mesaDecorada);
    }

    @Override
    public void decorar() {
        super.decorar();
        adicionarRedePingPong();
    }

    private void adicionarRedePingPong() {
        System.out.println("Adicionando rede de ping pong à mesa");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        // Cria uma mesa básica
        Mesa mesa = new MesaBasica();
        
        // Decora a mesa com rodas
        mesa = new MesaComRodas(mesa);
        
        // Decora a mesa com toalha
        mesa = new MesaComToalha(mesa);
        
        // Decora a mesa com rede de ping pong
        mesa = new MesaComRedePingPong(mesa);
        
        // Exibe a mesa decorada
        mesa.decorar();
    }
}
