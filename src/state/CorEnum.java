package state;

import java.util.List;
/**
 * Padrao state delega o estado da classe para ser tratado em Enum implementando comportamentos independentes de cada estado
 * @author Fernando
 *
 */
public enum CorEnum {
	BRANCO{
		public void busca(No no, List<No> list) {
			no.setCor(CINZA, list);
		}
	},
	CINZA{
		void assumiu(No no, List<No> list){
			for(No adj : no.getAdjacentes())
				adj.buscaProfundidade(list);
			
			no.setCor(PRETO, list);
		}
	},
	PRETO{
		void assumiu(No no, List<No> list){
			list.add(no);
		}
	};
	
	void busca(No no, List<No> list){}
	void assumiu(No no, List<No> list){}
}
