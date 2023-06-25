package samples;

public class sample {

	public static void main(String[] args) {
		/*try {
		      operation_risquée1;
		      opération_risquée2;
	    } catch (ExceptionInteressante e) {
	      traitements
	    } catch (ExceptionParticulière e) {
	      traitements
	    } catch (Exception e) {
	      traitements
	    } finally {
	      traitement_pour_terminer_proprement;
	    }*/
		
		int i = 3;
	    int j = 0;
	    try {
	      System.out.println("résultat = " + (i / j));
	    } catch (ArithmeticException e) {
	      System.out.println("getmessage");
	      System.out.println(e.getMessage());
	      System.out.println(" ");
	      System.out.println("toString");
	      System.out.println(e.toString());
	      System.out.println(" ");
	      System.out.println("printStackTrace");
	      e.printStackTrace();
	    }
	    
	    /*
	    getmessage
		/ by zero
		 
		toString
		java.lang.ArithmeticException: / by zero
		 
		printStackTrace
		java.lang.ArithmeticException: / by zero
			at samples.sample.main(sample.java:22)
			*/

	}

}
