package ch13.multitype;

public class Product <T,M>{
	//field
	private T kind; // Car, Tv
	private M Model;
	
	
	//constructor
	
	
	//method
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return Model;
	}
	public void setModel(M model) {
		Model = model;
	}
}
