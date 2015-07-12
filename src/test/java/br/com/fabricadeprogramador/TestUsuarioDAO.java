package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDao;

public class TestUsuarioDAO {

	public static void main(String[] args){
		testExcluir();

	}
	
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(3);
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.excluir(usu);
		
		System.out.println("Excluido com Sucesso!");
	}
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Camilia Bueno Pereira");
		usu.setLogin("cbueno");
		usu.setSenha("123");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.alterar(usu);
		
		System.out.println("Alteração com Sucesso!");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		usu.setNome("Camilia Bueno");
		usu.setLogin("cbueno");
		usu.setSenha("123");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.cadastrar(usu);
		
		System.out.println("Cadastrado com Sucesso!");
	}
}
