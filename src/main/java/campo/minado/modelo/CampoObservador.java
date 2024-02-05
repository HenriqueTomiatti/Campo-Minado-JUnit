package campo.minado.modelo;

@FunctionalInterface
public interface CampoObservador {

    void eventoOcorreu(Campo campo, CampoEvento evento);
}
