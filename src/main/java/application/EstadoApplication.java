package application;

import entities.Estado;
import java.util.List;
import repositories.EstadoRepository;

public class EstadoApplication {
    private EstadoRepository estadoRepository;

    public EstadoApplication() {
        this.estadoRepository = new EstadoRepository();
    }

    public void criarEstado(int ddd, String nome, String imagem) {
        Estado estado = new Estado(ddd, nome, imagem);
        estadoRepository.adicionarEstado(estado);
    }

    public void atualizarEstado(int ddd, String nome, String imagem) {
        Estado novoEstado = new Estado(ddd, nome, imagem);
        estadoRepository.atualizarEstado(ddd, novoEstado);
    }

    public List<Estado> listarEstados() {
        return estadoRepository.listarEstados();
    }

    public Estado buscarPorDDD(int ddd) {
        return estadoRepository.buscarPorDDD(ddd);
    }

    public void removerEstado(int ddd) {
        estadoRepository.removerEstado(ddd);
    }
}
