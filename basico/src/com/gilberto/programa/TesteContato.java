package com.gilberto.programa;

public class TesteContato {

	public static void main(String[] args) {
		
		
		Contato contato = new Contato();
		
		contato.setNome("Person");
		//contato.setEndereco("Cabo Verde");
		//contato.setTelefone("1198444444");
		
		// relacionamento tem- um ,Criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Luta Continua");
		end.setNumero("N-127");
		end.setComplemento("--");
		end.setCidade("Cabinda");
		end.setEstado("Angola");
		end.setCep("999-999");
		
		contato.setEndereco(end);
		
		// relacionamento tem- um ,Criar objeto Telefone
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("999-999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("11");
		telefone2.setNumero("8888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0]=telefone;
		telefones[1]=telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
	
		// Saida no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());

		if(contato!= null && contato.getEndereco()!=null) {
			System.out.println(contato.getEndereco().getCidade());
			
		}
		/*if(contato!= null && contato.getTelefone()!=null) {
			System.out.println(contato.getTelefone().getDdd()+ contato.getTelefone().getNumero());
		*/
	
    if(contato!=null && contato.getTelefones()!=null) {
    	for(Telefone t: contato.getTelefones()) {
    		System.out.println(t.getDdd() + " " + t.getNumero());
    	}
}
}
}