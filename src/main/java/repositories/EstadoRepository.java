package repositories;

import entities.Estado;
import java.util.ArrayList;
import java.util.List;

public class EstadoRepository {
    private List<Estado> estados;

    public EstadoRepository() {
        this.estados = new ArrayList<>();
    }

    public void adicionarEstado(Estado estado) {
        estados.add(estado);
    }

    public void atualizarEstado(int ddd, Estado novoEstado) {
        for (Estado estado : estados) {
            if (estado.getDdd() == ddd) {
                estado.setNome(novoEstado.getNome());
                estado.setCaminhoImagem(novoEstado.getCaminhoImagem());
                break;
            }
        }
    }

    public List<Estado> listarEstados() {
        return estados;
    }

    public Estado buscarPorDDD(int ddd) {
        for (Estado estado : estados) {
            if (estado.getDdd() == ddd) {
                return estado;
            }
        }
        return null;
    }

    public void removerEstado(int ddd) {
        estados.removeIf(estado -> estado.getDdd() == ddd);
    }
}
