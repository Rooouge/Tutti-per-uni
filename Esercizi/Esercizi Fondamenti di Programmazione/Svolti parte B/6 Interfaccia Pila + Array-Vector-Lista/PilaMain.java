package eserciziAssegnati;

public class PilaMain {
  
	   public static void main (String[] args) {
	        try {		    	    
			  Pila a = new PilaArray(10);		    
	          System.out.println("La pila 'a' e' " + a);
	          a.push(3);
		      a.push(5);
		      a.push(7);
	          System.out.println("La pila 'a' e' " + a);
		      int x = (Integer)a.pop();
		      System.out.println("Elemento tolto dalla pila 'a': " + x);
	          if (!a.isEmpty()) System.out.println("La pila 'a' e' " + a);	 
	          System.out.println("La pila 'a' ha " + a.size() + " elementi");
	          Pila copiaDi_a = (PilaArray)((PilaArray)a).clone();
	          // provare anche con Pila copiaDi_a = a;
	          System.out.println("La pila 'copiaDi_a' e' " + copiaDi_a);
	          copiaDi_a.pop();
	          System.out.println("La pila 'copiaDi_a' e' " + copiaDi_a);	
	          System.out.println("La pila 'a' e' rimasta invariata: " + a);	 
	          a.clear();
	          System.out.println("La pila 'a' e' " + a + "\n");
	     
			  Pila b = new PilaVector();		    
	          System.out.println("La pila 'b' e' " + b);
	          b.push("aaa");
		      b.push("bbb");
		      b.push("ccc");
	          System.out.println("La pila 'b' e' " + b);
		      System.out.println("Elemento tolto dalla pila 'b': " + b.pop());
	          if (!b.isEmpty()) System.out.println("La pila 'b' e' " + b);	 
	          System.out.println("La pila 'b' ha " + b.size() + " elementi");
	          Pila copiaDi_b = (PilaVector)((PilaVector)b).clone();
	          System.out.println("La pila 'copiaDi_b' e' " + copiaDi_b);
	          copiaDi_b.pop();
	          System.out.println("La pila 'copiaDi_b' e' " + copiaDi_b);	
	          System.out.println("La pila 'b' e' rimasta invariata: " + b);	 
	          b.clear();
	          System.out.println("La pila 'b' e' " + b + "\n");

			  Pila c = new PilaLista();		    
	          System.out.println("La pila 'c' e' " + c);
	          c.push(3.1);
		      c.push(5.4);
		      c.push(2.3);
	          System.out.println("La pila 'c' e' " + c);
		      System.out.println("Elemento tolto dalla pila 'c': " + c.pop());
	          if (!c.isEmpty()) System.out.println("La pila 'c' e' " + c);	 
	          System.out.println("La pila 'c' ha " + c.size() + " elementi");
	          Pila copiaDi_c = (PilaLista)((PilaLista)c).clone();
	          System.out.println("La pila 'copiaDi_c' e' " + copiaDi_c);
	          copiaDi_c.pop();
	          System.out.println("La pila 'copiaDi_c' e' " + copiaDi_c);	
	          System.out.println("La pila 'c' e' rimasta invariata: " + c);	         	          	          
	          c.clear();
	          System.out.println("La pila 'c' e' " + c + "\n");
	          
			  //test metodi specifici di PilaArray
	          Pila a1 = new PilaArray(2);
	          a1.push(1);
	          a1.push(4);
			  ((PilaArray)a1).ensureCapacity(3);  // senza questo, la push genera eccezione
	          a1.push(6);
	          System.out.println("La pila 'a1' e' " + a1);
	          System.out.println("Secondo elemento di pila 'a1': " + ((PilaArray)a1).get(1) + '\n');	          
		      a1.push(8);
		      System.out.println("Sono arrivato qui");
	        }
	        catch (PilaVuota e) {  
	        	System.out.println("Errore: pop su pila vuota\n");
	        }
	        catch (PilaPiena e) {  
	        	System.out.println("Errore: push su pila piena\n");
	        }
	        catch (Throwable e) {    // catch all
	        	System.out.print("Altre eccezioni: ");
	        	System.out.println(e);
	        }
	        		    
	    }   
	}


/* Traccia esecuzione 
	  
La pila 'a' e' []
La pila 'a' e' [3,5,7]
Elemento tolto dalla pila 'a': 7
La pila 'a' e' [3,5]
La pila 'a' ha 2 elementi
La pila 'copiaDi_a' e' [3,5]
La pila 'copiaDi_a' e' [3]
La pila 'a' e' rimasta invariata: [3,5]
La pila 'a' e' []

La pila 'b' e' []
La pila 'b' e' [aaa,bbb,ccc]
Elemento tolto dalla pila 'b': ccc
La pila 'b' e' [aaa,bbb]
La pila 'b' ha 2 elementi
La pila 'copiaDi_b' e' [aaa,bbb]
La pila 'copiaDi_b' e' [aaa]
La pila 'b' e' rimasta invariata: [aaa,bbb]
La pila 'b' e' []

La pila 'c' e' []
La pila 'c' e' [2.3,5.4,3.1]
Elemento tolto dalla pila 'c': 2.3
La pila 'c' e' [5.4,3.1]
La pila 'c' ha 2 elementi
La pila 'copiaDi_c' e' [5.4,3.1]
La pila 'copiaDi_c' e' [3.1]
La pila 'c' e' rimasta invariata: [5.4,3.1]
La pila 'c' e' []

La pila 'a1' e' [1,4,6]
Secondo elemento di pila 'a1': 4

Errore: push su pila piena

*/

