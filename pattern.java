//Pattern 1

// import java.util.Scanner;
// public class pattern
// {
// 	public static void main(String[] args) {
// 	    Scanner scan = new Scanner(System.in);
// 	    int N = scan.nextInt();
// 	    for(int i = 1;i<=N;i++){
// 	        for(int j=1;j<=i;j++){
// 	            System.out.print("*");
// 	        }
// 	        System.out.println();
// 	    }
	    
// 	}
// }

//Pattern 2
// import java.util.Scanner;
// public class pattern{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         System.out.println();
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 3
// import java.util.Scanner;
// public class pattern{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         System.out.println();
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 4
// import java.util.Scanner;
// public class pattern{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         System.out.println();
//         int k = 1;
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(k +" ");
//                 k++;
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 5
// import java.util.Scanner;
// public class pattern
// {
// 	public static void main(String[] args) {
// 	    Scanner scan = new Scanner(System.in);
// 	    int N = scan.nextInt();
// 	    for(int i = N;i>=1;i--){
// 	        for(int j=1;j<=i;j++){
// 	            System.out.print("*");
// 	        }
// 	        System.out.println();
// 	    }
	    
// 	}
// }

//Pattern 6
// import java.util.Scanner;
// public class pattern
// {
// 	public static void main(String[] args) {
// 	    Scanner scan = new Scanner(System.in);
// 	    int N = scan.nextInt();
// 	    for(int i=1;i<=N;i++){
// 	        for(int j=1;j<=i;j++){
// 	            System.out.print("*");
	            
// 	        }
// 	        System.out.println();
// 	    }
// 	    for(int i=N;i>=1;i--){
// 	        for(int j=1;j<i;j++){
// 	            System.out.print("*");
// 	        }
// 	        System.out.println();
// 	    }
// 	}
// }
	
//Pattern 7
// import java.util.Scanner;
// public class pattern
// {
// 	public static void main(String[] args) {
// 	    Scanner scan = new Scanner(System.in);
// 	    int N = scan.nextInt();
        //upper part of the pattern
// 	    for(int i=1;i<=N;i++){
// 	        for(int j=1;j<=i;j++){
// 	            System.out.print(j +" ");
	            
// 	        }
// 	        System.out.println();
// 	    }
        //second part of the pattern
// 	    for(int i=N;i>=1;i--){
// 	        for(int j=1;j<i;j++){
// 	            System.out.print( j + " ");
// 	        }
// 	        System.out.println();
// 	    }
// 	}
// }

//Pattern 8
// import java.util.Scanner;
// class pattern{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         char ch = 'A';
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 9
//import java.util.Scanner;
// class pattern{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         char ch = 'A';
//         char op;
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=i;j++){
//                 op=(ch%2!=0) ? character.toUpperCase(ch): character.toLowerCase(ch);
//                 System.out.print(op + " ");
                
                
                
//                 ch++;
//             }
//             System.out.println();
//         }
        
//     }
// }

//Harshad Number
// import java.util.Scanner;
// class pattern{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         int sum = 0;
//         int temp = num;
//         while(temp>0){
//             int rem = temp%10;
//             sum=sum+rem;
//             temp=temp/10;
                
//         }
//         if(num%sum==0){
//             System.out.println("Harshad number and answer is:" +sum);
//         }
//         else{
//             System.out.println("-1");
//         }
        
//     }
// }

//Harshad number
import java.util.Scanner;
class pattern{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            int rem = num%i;
            if(rem==0){
                sum=sum+i;
                
            }
            
            
        }
        if(num==sum){
            System.out.println("perfet number");
        }
        else{
            System.out.println("Not perfect");
        }
    }
}



   

	    

