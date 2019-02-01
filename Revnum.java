class Revnum 
{ 
static int reversDigits(int num) 
{ 
int rev = 0; 
        while(num > 0) 
        { 
            rev = rev * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev; 
    } 
 public static void main (String[] args)  
    { 
        int num = 423; 
        System.out.println("Reverse of no. is " 
                           + reversDigits(num)); 
    } 
} 
