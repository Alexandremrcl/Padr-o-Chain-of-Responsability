
package padroescomportamentais.chainofresponsibility;

public class Gerente extends Suporte {

    @Override
    public String atender(int nivel) {
        if (nivel == 3) {
            return "Gerente resolveu o problema complexo.";
        }

        return "Problema não resolvido.";
    }
}
