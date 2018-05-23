package eserciziAssegnati;

public class StructLista {

	private Object info;
	private StructLista punt;
	
	public StructLista() {
		// TODO Auto-generated constructor stub
		this.info = null;
		this.punt = null;
	}

	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public StructLista getPunt() {
		return punt;
	}

	public void setPunt(StructLista punt) {
		this.punt = punt;
	}
}
