package model;

public interface impresora {
    void conectar();
    void desconectar();
    void imprimir(documento doc);
    boolean esconectada();

}
