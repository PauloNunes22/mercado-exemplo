package exemplo;

import java.util.HashMap;

public class ProdutoRepository {
    HashMap<String, Produto> catalogo = new HashMap<>();

    public Produto addProduto(Produto p){
        return catalogo.put(p.getId(), p);
    }

    public Produto recuperaProduto(String id){
        return catalogo.get(id);
    }

    public Produto removeProduto(String id){
        return catalogo.remove(id);
    }

    public void atualizarProduto(Produto p2){
        String id = p2.getId();
        catalogo.put(id, p2);
    }
}
