package cui;

import java.io.*;
import java.util.*;
import java.text.*;

public final class Console {

/**
 * Método utilizado para a leitura de valores booleanos
 * @param vazio
 * @return boolean
 */
	public static boolean readBoolean () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         Boolean b = new Boolean (s);
         return b.booleanValue ();
      } catch (IOException e) {
         return false;
      }
  }

/**
 * Método utilizado para a leitura de Bytes
 * 	
 * @return 0
 */
  public static byte readByte () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         return Byte.parseByte (s);
      } catch (IOException e) {
         return 0;
      } catch (NumberFormatException e) {
         return 0;
      }
  }

  /**
   * Método utilizado para a leitura de short
   * 
   * @return 0
   */
  public static short readShort () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         return Short.parseShort (s);
      } catch (IOException e) {
         return 0;
      } catch (NumberFormatException e) {
         return 0;
      }
  }

  /**
   * 
   * Método para a leitura de Integer
   * @return 0
   */
 public static int readInteger () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         return Integer.parseInt (s);
      } catch (IOException e) {
         return 0;
      } catch (NumberFormatException e) {
         return 0;
      }
  }

 /**
  * 
  * Método utilizado para a leitura de long
  * @return 0
  */
 public static long readLong () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         return Long.parseLong (s);
      } catch (IOException e) {
         return 0;
      } catch (NumberFormatException e) {
         return 0;
      }
  }

 /**
  * 
  * Método utilizado para a leitura de float 
  * @return 0
  */
  public static float readFloat () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         Float f = new Float (s);
         return f.floatValue ();
      } catch (IOException e) {
         return 0;
      } catch (NumberFormatException e) {
         return 0;
      }
  }

  /**
   * Método utilizado para a leitura de Double
   * 
   * @return 0
   */
  public static double readDouble () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         Double d = new Double (s);
         return d.doubleValue ();
      } catch (IOException e) {
         return 0;
      } catch (NumberFormatException e) {
         return 0;
      }
  }

  /**
   * 
   *Método utilizado para a leitura de char 
   * @return 0
   */
  public static char readChar () {
      try {
        /* BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         return s.charAt(0); */
         return ((char) System.in.read());
      } catch (IOException e) {
         return '\0';
      }
  }

  /**
   * 
   * Método utilizado para a leitura de String
   * @return 0
   */
  public static String readString () {
      try {
         BufferedReader br = new BufferedReader (
                new InputStreamReader (System.in) );
         String s = br.readLine ();
         return s;
      } catch (IOException e) {
         return "";
      }
  }
  
/**
 * 
 *   
 * @param stx
 * @param formato
 * @return dataUsuario
 */
  public static Date str2date(String stx,String formato){
	  if (formato == null || formato.length() == 0){
		  formato = "dd/MM/yyyy";
	  }
	  SimpleDateFormat sdf1= new SimpleDateFormat(formato);
	  Date dataUsuario;
	try {
		dataUsuario = sdf1.parse(stx);
	} catch (ParseException e) {
		return null;	
	}
	  return dataUsuario;
  }

 /**
  * 
  * 
  * @param data
  * @param formato
  * @return data
  */
  public static String date2str(Date data,String formato){
	  if (formato == null || formato.length() == 0){
		  formato = "dd/MM/yyyy";
	  }
	  if (data == null){
		  data = new Date();
	  }
	  SimpleDateFormat sdf1= new SimpleDateFormat(formato);
	  return sdf1.format(data); 
  }
}
