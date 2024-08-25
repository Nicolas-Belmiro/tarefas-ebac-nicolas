package dao;

import domain.Cliente;

import java.util.List;

public interface IClienteDAO {

    public Cliente cadastrar(Cliente cliente);

    public Cliente buscarPorID(Long id);

    public void excluir(Cliente cliente);

    public Cliente alterar(Cliente cliente);

    public List<Cliente> buscarTodos();
}