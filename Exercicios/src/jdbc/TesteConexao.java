package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// imports para testar se o arquivo eh encontrado
//import java.util.Locale;
//import java.util.ResourceBundle;

/*
 * Para conectar com qualquer banco, necessariamente precisa ter o Driver do banco a ser conectado instalado
 * na máquina, servidor e etc. Para isso, pode ser acessado o site do Banco que foi instalado e baixar o 
 * Driver para o JDBC e instalar na máquina.
 * 
 * No caso do MySQL:
 * 1- Deverá ser baixado o arquivo idependente .zip
 * 2- Criar pasta(Folders) para o Driver dentro do Projeto chamadas 'libs' para adicionar as bibliotecas novas para o projeto
 * 3- Copiar o arquivo .jar pra dentro do pasta do projeto
 * 4- Clicar com o botao direito em cima de Driver e Adicionar o Build Path, isso irá criar uma Referencia para a biblioteca
 * 
 * */

public class TesteConexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

//      **************************************************************************************************
//		****** Teste para ver se o arquivo com o erro esta sendo encontrado e carregado na aplicacao *****
//			
//		String nomeBundle = "com.mysql.cj.LocalizedErrorMessages";
//
//		try {
//		    ResourceBundle bundle = ResourceBundle.getBundle(
//		        nomeBundle,
//		        Locale.ROOT,
//		        TesteConexao.class.getClassLoader()
//		    );
//
//		    System.out.println("ResourceBundle carregado!");
//		    System.out.println("Mensagens disponíveis: " + bundle.keySet().size());
//
//		} catch (Exception e) {
//		    e.printStackTrace();
//		}
//		
//		
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//      **************************************************************************************************s		
		
		// String com a conexao
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";   // URL do Servidor que ira se conectar
		final String usr = "root";
		final String password = "123456";
		
		// Cria a conexao com o servidor MySQL, detalhe que ela sempre ira lançar uma excessao 'checked', neste exemplo foi colocado no metodo main
		// 'Connection' usado sempre sera do 'java.sql' 
		Connection conexao = DriverManager.getConnection(url, usr, password);
		
		System.out.println("Conexao executada");
		
		// Fecha a conexao
		conexao.close();
		
	}
	
}
