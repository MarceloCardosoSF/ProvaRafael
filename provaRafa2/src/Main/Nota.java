package Main;

public class Nota {
	private String razao;
	private String cnpj;
	private String regime;
	private String email;
	private int numnota;
	private String data;
	private String descricao;
	private Double valor;
	
	
	
	public Nota(String razao, String cnpj, String regime, String email, int numnota, String data, String descricao, Double valor) {
		this.razao = razao;
		this.cnpj = cnpj;
		this.regime = regime;
		this.email = email;
		this.numnota = numnota;
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	
	
	
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRegime() {
		return regime;
	}
	public void setRegime(String regime) {
		this.regime = regime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumnota() {
		return numnota;
	}
	public void setNumnota(int numnota) {
		this.numnota = numnota;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
