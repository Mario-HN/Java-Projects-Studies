
public class Carro {
	String marca;
	String modelo;
	Proprietario proprietario;
	Placa placa;
	Motor motor;
	
	Carro(){
		this("","",null,null,null);
	}
	Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
		this.marca = marca;
		this.modelo = modelo;	
		this.proprietario = proprietario;
		this.placa = placa;
		this.motor = motor;
	}
	String getDescricao() {
		String descricao = "Carro " + this.marca + "/" + this.modelo + ". " + proprietario.getDescricao() + placa.getDescricao() + motor.getDescricao();
		return descricao;
	}
}
