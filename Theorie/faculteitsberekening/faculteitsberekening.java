public class HelloWorld {
  public static void main(String[] args) {
    
    int n = 10;
    int resultaat = 1;
    
    if(n == 0){
    
    	System.out.println("Faculteit van 0 is: 1");

    } 
    else 
    {
    
    	for(int i = 1; i <= n; i++){
    	
    	resultaat = resultaat * i;
    
    }
    
    System.out.println("Resultaat is: " + resultaat);
    
    }
    
    
    
  }
}
