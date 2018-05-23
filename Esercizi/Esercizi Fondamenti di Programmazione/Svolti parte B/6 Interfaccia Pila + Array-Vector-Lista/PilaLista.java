package eserciziAssegnati;

public class PilaLista implements Pila {

	private StructLista lista;
	
	public PilaLista() {
		// TODO Auto-generated constructor stub
		this.lista = null;
	}
	
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub
		StructLista s = new StructLista();
		s.setInfo(x);
		s.setPunt(this.lista);
		this.lista = s;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		StructLista t = this.lista.getPunt();
		Object info = this.lista.getInfo();
		this.lista = t;
		return info;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.lista == null) return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		StructLista t = this.lista;
		int n = 0;
		while(t != null) {
			t = t.getPunt();
			n++;
		}
		return n;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.lista = null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PilaLista p = new PilaLista();
		StructLista t = this.lista;
		for(int i = 0; i < size(); i++) {
			for(int j = 0; j < size() - i; j++) {
				if(t.getPunt() != null && j != (size()-i-1)) t = t.getPunt();
			}
			p.push(t.getInfo());
			t = this.lista;
		}
		return p;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "[";
		StructLista t = this.lista;
		while(t != null) {
			s = s + t.getInfo();
			if(t.getPunt() != null) s = s + ",";
			t = t.getPunt();
		}
		s = s + "]";
		return s;
	}
}
