
package padroescomportamentais.chainofresponsibility;

public class Principal {

    public static void main(String[] args) {

        Suporte atendente = new Atendente();
        Suporte tecnico = new SuporteTecnico();
        Suporte gerente = new Gerente();

        atendente.setProximo(tecnico);
        tecnico.setProximo(gerente);

        System.out.println(atendente.atender(1));
        System.out.println(atendente.atender(2));
        System.out.println(atendente.atender(3));
    }
}
