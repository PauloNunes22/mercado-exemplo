import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {

		ProdutoRepository repProduto = new ProdutoRepository();
		String prod1id = repProduto.addProduto(new Produto("Leite", "Parmalat"));
		repProduto.addProduto(new Produto("Chocolate", "Garoto"));
		repProduto.addProduto(new Produto("Refrigerante", "Fante"));

		System.out.println(repProduto.recuperaProduto(prod1id));}
}
