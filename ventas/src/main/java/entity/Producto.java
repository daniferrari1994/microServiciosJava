package entity;

public class Producto {
	private Integer id;
	private String marca;
	private String name;
	private Integer cantidad;
	
	public Producto() {
	}

	public Producto(Integer id, String marca, String name, Integer cantidad) {
		super();
		this.id = id;
		this.marca = marca;
		this.name = name;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", marca=" + marca + ", name=" + name + ", cantidad=" + cantidad + "]";
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
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}