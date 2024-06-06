public class ServicoRoupas {
    public void CalcularImpostos(Roupas roupa){
        if(roupa instanceof Vestido){
            System.out.println("Imposto para vestido: " + ((Vestido) roupa).CalcularImpostos());
        } else if (roupa instanceof Camisa){
            System.out.println("Imposto para camisa: " + ((Camisa) roupa).CalcularImpostos());
        } else if(roupa instanceof Calca){
            System.out.println("Imposto para calça: " + ((Calca) roupa).CalcularImpostos());
        }
    }
     }

