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
	 * @return the nomeArquivo
	 */
	public String getNomeArquivo() {
		return this.nomeArquivo;
	}

	/**
	 * @param nomeArquivo the nomeArquivo to set
	 */
	public void setNomeArquivo(String nomeArquivo) {
		if(nomeArquivo == null){
			this.nomeArquivo = "ArquivoLog.log";
		}
		else {
			this.nomeArquivo = nomeArquivo;
		}
	}

	private Log (String nomeArquivo) throws IOException {
		this.setNomeArquivo(nomeArquivo);
		this.logger = Logger.getLogger(Log.class);
		//BasicConfigurator.configure();  //inicializa o sistema de logging com as configurações padrão
		Appender fileAppender = new FileAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN),this.nomeArquivo); // (o primeiro é o Layout das mensagens,o nome do arquivo de log que será criado)
		logger.addAppender(fileAppender);
		BasicConfigurator.configure(fileAppender);  //inicializa o sistema de logging com as configurações padrão
	}
	 
	public static Log getLoginstance(String nomeArquivo){
		if( loginstance== null) {
			try {
				loginstance = new Log(nomeArquivo);
			} catch (IOException e) {
				return null;
			}
	    }
	    return loginstance;
	 }
	
	public void error(String mensagem){
		this.logger.error(mensagem);
	}
	
	public void warn(String mensagem){
		this.logger.warn(mensagem);
	}
	
	public void info(String mensagem){
		this.logger.info(mensagem);
	}
	
	public void fatal(String mensagem){
		this.logger.fatal(mensagem);
	}
}
