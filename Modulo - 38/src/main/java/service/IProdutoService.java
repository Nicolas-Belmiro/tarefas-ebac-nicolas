package service;

import java.util.List;

import domain.Produto;
import services_generic.IGenericService;


/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}