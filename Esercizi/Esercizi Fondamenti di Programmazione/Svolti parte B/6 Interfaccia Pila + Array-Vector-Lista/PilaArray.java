package eserciziAssegnati;

public class PilaArray implements Pila {

	private Object[] array;
	private int dim;
	
	public PilaArray(int n) {
		// TODO Auto-generated constructor stub
		this.array = new Object[n];
		this.dim = 0;
	}
	
	public Object get(int i) {
		return this.array[i];
	}
	
	public void ensureCapacity(int m) {
		if(m > this.array.length) {
			Object[] temp = new  Object[this.array.length];
			for(int i = 0; i < this.array.length; i++) {
				temp[i] = this.array[i];
			}
			this.array = new Object[m];
			for(int i = 0; i < temp.length; i++) {
				this.array[i] = temp[i];
			}
		}
	}
	
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub
		if(this.dim == this.array.length) throw new PilaPiena();
		this.array[this.dim] = x;
		this.dim++;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(this.dim == 0) throw new PilaVuota();
		Object o = this.array[this.dim-1];
		this.dim--;
		return o;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.dim == 0) return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.dim;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.array = new Object[0];
		this.dim = 0;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PilaArray p = new PilaArray(this.array.length);
		p.dim = this.dim;
		for(int i = 0; i < this.dim; i++) {
			p.array[i] = this.array[i];
			//System.out.println("[" + i + "] = " + p.array[i]);
		}
		return p;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "[";
		for(int i = 0; i < this.dim; i++) {
			s = s + this.array[i];
			if(i != this.dim-1) s = s + ",";
		}
		s = s + "]";
		return s;
	}
}
