package Main;

public class Pessoa {

	private int pesId;
	private String pesNome;
	private String pesNascimento;
	private String pesSexo;
	private String pesMae;
	private String pesPai;
	private String pesEndereco;
	private String pesEmail;
	private String pesTelefone;
	private String pesFoto;

	
	public Pessoa(int pesId, String pesNome, String pesNascimento, String pesSexo, String pesMae, String pesPai,
			String pesEndereco, String pesEmail, String pesTelefone, String pesFoto) {
		this.pesId = pesId;
		this.pesNome = pesNome;
		this.pesNascimento = pesNascimento;
		this.pesSexo = pesSexo;
		this.pesMae = pesMae; 
		this.pesPai = pesPai;
		this.pesEndereco = pesEndereco;
		this.pesEmail = pesEmail;
		this.pesTelefone = pesTelefone;
		this.setPesFoto(pesFoto);
	}

	
	
	
	
	public int getPesId() {
		return pesId;
	}
	public void setPesId(int pesId) {
		this.pesId = pesId;
	}
	public String getPesNome() {
		return pesNome;
	}
	public void setPesNome(String pesNome) {
		this.pesNome = pesNome;
	}
	public String getPesNascimento() {
		return pesNascimento;
	}
	public void setPesNascimento(String pesNascimento) {
		this.pesNascimento = pesNascimento;
	}
	public String getPesSexo() {
		return pesSexo;
	}
	public void setPesSexo(String pesSexo) {
		this.pesSexo = pesSexo;
	}
	public String getPesMae() {
		return pesMae;
	}
	public void setPesMae(String pesMae) {
		this.pesMae = pesMae;
	}
	public String getPesPai() {
		return pesPai;
	}
	public void setPesPai(String pesPai) {
		this.pesPai = pesPai;
	}
	public String getPesEndereco() {
		return pesEndereco;
	}
	public void setPesEndereco(String pesEndereco) {
		this.pesEndereco = pesEndereco;
	}
	public String getPesEmail() {
		return pesEmail;
	}
	public void setPesEmail(String pesEmail) {
		this.pesEmail = pesEmail;
	}
	public String getPesTelefone() {
		return pesTelefone;
	}
	public void setPesTelefone(String pesTelefone) {
		this.pesTelefone = pesTelefone;
	}
	public String getPesFoto() {
		return pesFoto;
	}

	public void setPesFoto(String pesFoto) {
		this.pesFoto = pesFoto;
	}
}
