package br.com.caselliti.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proprietario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String nome; 
	private String enderecoresidencial; 
	private String enderecoComercial; 
	private Integer telefonePrincipal; 
	private Integer telefoneAlternativo; 
	private String chaves; 
	private String precoSolicitado; 
	private String avaliacao; 
	private Date data; 
	private String corretor; 
	
	
	public Proprietario() { 
		
	}


	public Proprietario(Long id, String nome, String enderecoresidencial, String enderecoComercial,
			Integer telefonePrincipal, Integer telefoneAlternativo, String chaves, String precoSolicitado,
			String avaliacao, Date data, String corretor) {
		super();
		this.id = id;
		this.nome = nome;
		this.enderecoresidencial = enderecoresidencial;
		this.enderecoComercial = enderecoComercial;
		this.telefonePrincipal = telefonePrincipal;
		this.telefoneAlternativo = telefoneAlternativo;
		this.chaves = chaves;
		this.precoSolicitado = precoSolicitado;
		this.avaliacao = avaliacao;
		this.data = data;
		this.corretor = corretor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEnderecoresidencial() {
		return enderecoresidencial;
	}


	public void setEnderecoresidencial(String enderecoresidencial) {
		this.enderecoresidencial = enderecoresidencial;
	}


	public String getEnderecoComercial() {
		return enderecoComercial;
	}


	public void setEnderecoComercial(String enderecoComercial) {
		this.enderecoComercial = enderecoComercial;
	}


	public Integer getTelefonePrincipal() {
		return telefonePrincipal;
	}


	public void setTelefonePrincipal(Integer telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}


	public Integer getTelefoneAlternativo() {
		return telefoneAlternativo;
	}


	public void setTelefoneAlternativo(Integer telefoneAlternativo) {
		this.telefoneAlternativo = telefoneAlternativo;
	}


	public String getChaves() {
		return chaves;
	}


	public void setChaves(String chaves) {
		this.chaves = chaves;
	}


	public String getPrecoSolicitado() {
		return precoSolicitado;
	}


	public void setPrecoSolicitado(String precoSolicitado) {
		this.precoSolicitado = precoSolicitado;
	}


	public String getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getCorretor() {
		return corretor;
	}


	public void setCorretor(String corretor) {
		this.corretor = corretor;
	}


	@Override
	public String toString() {
		return "Proprietario [id=" + id + ", nome=" + nome + ", enderecoresidencial=" + enderecoresidencial
				+ ", enderecoComercial=" + enderecoComercial + ", telefonePrincipal=" + telefonePrincipal
				+ ", telefoneAlternativo=" + telefoneAlternativo + ", chaves=" + chaves + ", precoSolicitado="
				+ precoSolicitado + ", avaliacao=" + avaliacao + ", data=" + data + ", corretor=" + corretor + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
