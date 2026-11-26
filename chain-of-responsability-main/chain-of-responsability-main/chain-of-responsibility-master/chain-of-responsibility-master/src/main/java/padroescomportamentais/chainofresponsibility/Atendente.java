
package padroescomportamentais.chainofresponsibility;

public class Atendente extends Suporte {

    @Override
    public String atender(int nivel) {
        if (nivel == 1) {
            return "Atendente resolveu o problema simples.";
        }

        if (proximo != null) {
            return proximo.atender(nivel);
        }

        return "Problema não resolvido.";
    }
}
