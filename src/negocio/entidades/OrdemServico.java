package negocio.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import negocio.entidades.enums.StatusServico;

public class OrdemServico {

	private Date dataEntrada;
	private Date dataSaida;
	private Integer numOS;
	private int statusServico;
	private Colaborador colaborador;
	private Cliente cliente;
	private Servico servico;
	private double valorTotal;
	private double valorAdiantado;

	private List<Peca> pecas = new ArrayList<Peca>();
	
	

	public OrdemServico() {
		super();
	}

	public OrdemServico(Date dataEntrada, Date dataSaida, Integer numOS, int statusServico,
			Colaborador colaborador, Cliente cliente, Servico servico) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.numOS = numOS;
		this.statusServico = statusServico;
		this.colaborador = colaborador;
		this.cliente = cliente;
		this.servico = servico;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Integer getNumOS() {
		return numOS;
	}

	public void setNumOS(Integer numOS) {
		this.numOS = numOS;
	}

	public int getStatusServico() {
		return statusServico;
	}

	public void setStatusServico(int statusServico) {
		this.statusServico = statusServico;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public List<Peca> getPecas() {
		return pecas;
	}
	public void setPecas(Peca peca) {
		pecas.add(peca);
	}
	public void setListPecas(List<Peca> list) {
		pecas.addAll(list);
	}

	public void setMatricula(String text) {
		// TODO Aretur
		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorAdiantado() {
		return valorAdiantado;
	}

	public void setValorAdiantado(double valorAdiantado) {
		this.valorAdiantado = valorAdiantado;
	}
	
	public double diferenca() {
		double diferenca = 0;
		
		diferenca = getValorTotal() - getValorAdiantado();
		
		return diferenca;
	}
}
