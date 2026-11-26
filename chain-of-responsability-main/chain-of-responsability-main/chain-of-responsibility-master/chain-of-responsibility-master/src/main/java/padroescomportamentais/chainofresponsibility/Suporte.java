
package padroescomportamentais.chainofresponsibility;

public abstract class Suporte {

    protected Suporte proximo;

    public void setProximo(Suporte proximo) {
        this.proximo = proximo;
    }

    public abstract String atender(int nivel);
}
