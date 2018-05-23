package eserciziAssegnati;

import java.util.Vector;

public class PilaVector implements Pila {

	Vector<Object> vector;
	
	public PilaVector() {
		// TODO Auto-generated constructor stub
		this.vector = new Vector<Object>(0);
	}
	
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub
		this.vector.add(x);
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(this.vector.isEmpty()) throw new PilaVuota();
		return this.vector.remove(this.vector.size()-1);		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.vector.isEmpty()) return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.vector.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.vector.clear();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PilaVector p = new PilaVector();
		for(int i = 0; i < this.vector.size(); i++) {
			p.vector.add(this.vector.get(i));
		}
		return p;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "[";
		if(this.vector != null) {
			for(int i = 0; i < this.vector.size(); i++) {
				s = s + this.vector.get(i);
				if(i != this.vector.size()-1) s = s + ",";
			}
		}
		s = s + "]";
		return s;
	}
}
