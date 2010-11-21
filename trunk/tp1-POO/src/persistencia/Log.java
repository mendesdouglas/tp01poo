package persistencia;
import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class Log {
    private Logger logger;
	private static Log loginstance;
	private String nomeArquivo = null;

	
	
	/**
	 * Retorna o nome do arquivo de logs
	 * @return O nome do arquivo de logs
	 */
	public String getNomeArquivo() {
		return this.nomeArquivo;
	}

	/**
	 * Seta o nome do arquivo de log para o nome especificado,caso este seja nulo um nome padrão é colocado
	 * @param nomeArquivo o nome do arquivo para configurar
	 */
	private void setNomeArquivo(String nomeArquivo) {
		if(nomeArquivo == null){
			this.nomeArquivo = "logs/Arquivo.log";
		}
		else {
			this.nomeArquivo = nomeArquivo;
		}
	}

	/**
	 * Construtor da classe. Basicamente ele configura um novo Logger e disponibiliza este para ser usado
	 * @param nomeArquivo o nome do arquivo para configurar
	 * @throws IOException em caso de falha na abertura do arquivo de logs
	 */
	private Log (String nomeArquivo) throws IOException {
		this.setNomeArquivo(nomeArquivo);
		this.logger = Logger.getLogger(Log.class);
		Appender fileAppender = new FileAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN),this.nomeArquivo);
		logger.addAppender(fileAppender);
		BasicConfigurator.configure(fileAppender);
	}
	 
	/**
	 * Singleton. Para que haja apenas uma instância escrevendo em arquivos no sistema,isto evita acesso concorrente,e cria uma configuracao única
	 * @param nomeArquivo o nome do arquivo para configurar
	 * @return retorna uma instância do Logger para que esta seja usada no sistema,caso haja problemas na abertura do arquivo um ponteiro nulo é retornado
	 */
	public static Log getLoginstance(String nomeArquivo){
		if( loginstance == null) {
			try {
				loginstance = new Log(nomeArquivo);
			} catch (IOException e) {
				return null;
			}
	    }	    return loginstance;
	 }
	
	/**
	 * Gera uma mensagem de erro no log
	 * @param mensagem A mensagem de erro do sistema
	 */
	public void error(String mensagem){
		this.logger.error(mensagem);
	}
	/**
	 * Gera uma mensagem de warning no log
	 * @param mensagem A mensagem de warning do sistema
	 */	
	public void warn(String mensagem){
		this.logger.warn(mensagem);
	}
	/**
	 * Gera uma mensagem de informação no log
	 * @param mensagem A mensagem de informação do sistema
	 */
	public void info(String mensagem){
		this.logger.info(mensagem);
	}
	/**
	 * Gera uma mensagem de erro fatal no log
	 * @param mensagem A mensagem de erro fatal do sistema
	 */
	public void fatal(String mensagem){
		this.logger.fatal(mensagem);
	}
}
