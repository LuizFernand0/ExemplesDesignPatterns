package state;

import java.util.List;

public class Branca extends Cor {
	 @Override
	void busca(No no, List<No> list) {
		no.setCor(new Cinza(), list);
	}
}
