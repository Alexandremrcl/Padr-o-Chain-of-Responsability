
package padroescomportamentais.chainofresponsibility;

public class SuporteTecnico extends Suporte {

    @Override
    public String atender(int nivel) {
        if (nivel == 2) {
            return "Suporte técnico resolveu o problema.";
        }

        if (proximo != null) {
            return proximo.atender(nivel);
        }

        return "Problema não resolvido.";
    }
}
