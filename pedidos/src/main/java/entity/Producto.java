package entity;

public class Producto {
	private Integer id;
	private String marca;
	private String name;
	
	public Producto() {
	}

	public Producto(Integer id, String marca, String name) {
		super();
		this.id = id;
		this.marca = marca;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", marca=" + marca + ", name=" + name + "]";
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
