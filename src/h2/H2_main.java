package h2;

public class H2_main {
    public static void main(String[] args) {
        
        int i =678, j=345, k=987, min, max;
        

    
        if (i < j) {
        	
            if (i < k) {
            	
                min=i;   
                
            } 
            
            else {
            	
                min=k;   
            }
        }
        
        else {
        	
            if (j < k) {
            	
                min=j;   
                
            } 
            
            else {
            	
                min=k;   
            }
        }

       
        if (i > j) {
        	
            if (i > k) {
            	
                max=i;  
                
            } else {
            	
                max=k;  
            }
        } 
        
        else {
        	
            if (j > k) {
            	
                max=j; 
                
            } 
            
            else {
            	
                max=k;   
            }
        }

       
       
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}

