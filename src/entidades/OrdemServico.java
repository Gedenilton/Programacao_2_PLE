package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusServico;

public class OrdemServico {

	private Date dataEntrada;
	private Date dataSaida;
	private Integer numOS;
	private StatusServico statusServico;
	private Colaborador colaborador;
	private Cliente cliente;
	private Servico servico;

	private List<Peca> pecas = new ArrayList<Peca>();

	public OrdemServico(Date dataEntrada, Date dataSaida, Integer numOS, StatusServico statusServico,
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

	public StatusServico getStatusServico() {
		return statusServico;
	}

	public void setStatusServico(StatusServico statusServico) {
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
}
