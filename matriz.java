
public class matriz {

    public static String  [] [] tablero;

	
    public static void main(String [] args){
    	int posicion = 0;
    	tablero      = new String [3][3];    	      
    	for(int i=0;i<3;i++){
    		
    		for(int j=0; j<3;j++){
    			posicion++;    			
    			tablero[i][j] = "f"+i+"c"+j+ " Pos - "+posicion;
    		}    			
    	}
    	
    	for(int i=0;i<3;i++){
    		
    		for(int j=0;j<3;j++){
    			
    			if(j<2)
    			
    				System.out.print(" " + tablero[i][j] + " |");
    			
    			else
    				
    				System.out.print(" " + tablero[i][j] + " ");
    				    				
    		}
    		
    		if(i<2)
    			
    			System.out.println("\n---------------------------------------------");    			 	    				
    	}
      	        	        	         	        	         	
    }	
	
}
