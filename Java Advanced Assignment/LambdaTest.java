package test;
@FunctionalInterface  
interface Sayable{  
    String say(int number);  
}  
  
public class LambdaTest{  
    public static void main(String[] args) {  
    	String[] tensNames = {
    		    "",
    		    " ten",
    		    " twenty",
    		    " thirty",
    		    " forty",
    		    " fifty",
    		    " sixty",
    		    " seventy",
    		    " eighty",
    		    " ninety"
    		  };
    	
    	String[] numNames = {
    		    "",
    		    " one",
    		    " two",
    		    " three",
    		    " four",
    		    " five",
    		    " six",
    		    " seven",
    		    " eight",
    		    " nine",
    		    " ten",
    		    " eleven",
    		    " twelve",
    		    " thirteen",
    		    " fourteen",
    		    " fifteen",
    		    " sixteen",
    		    " seventeen",
    		    " eighteen",
    		    " nineteen"
    		  };
    	
    
 
        Sayable person = (number)-> {  
        	

        	String ans;
        	
		    if (number % 100 < 20){
		      ans = numNames[number % 100];
		      number /= 100;
		    }
		    else {
		      ans = numNames[number % 10];
		      number /= 10;

		      ans = tensNames[number % 10] + ans;
		      number /= 10;
		    }
		    if (number == 0) return ans;
		    return numNames[number] + " hundred" + ans;
        		  

        		  

        };  
            System.out.println(person.say(10));  
    }

	
}  