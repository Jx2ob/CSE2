//JJ O'Brien
//12/5/14
//hw11 MatrixSorter java program
//
//Program displays unsorted sets of numbers and then displays the numbers sorted
//
//  First compile the program
//      javac MatrixSorter.java
//  run the program
//      java MatrixSorter

public class MatrixSorter{ 
  public static void main(String arg[]){                                       
    int mat3d[][][];
    mat3d = buildMat3d();
    show(mat3d);                                       
    System.out.println("The smallest entry in the 3D matrix is "  +findMin(mat3d) );      
    System.out.println("After sorting the 3rd matrix we get"); sort(mat3d[2]); show(mat3d);   
  }   
   
   public static int[][][] buildMat3d(){
     int[][][] output = new int[3][][];
     for (int a=0; a<output.length; a++){
       output[a] = new int[3+2*a][];
       for(int b=0; b<output[a].length; b++){
         output[a][b] = new int[a + b + 1];
         for(int c=0; c<output[a][b].length; c++){
           output[a][b][c] = (int) (Math.random()*100);
         }
       }
     }
     return output;
   }
   
   public static void show(int[][][] input){
     for(int a=0; a< input.length; a++){
       System.out.println("---------------------------Slab " + (a+1));
       for(int b=0; b<input[a].length; b++){
         for(int c=0; c<input[a][b].length; c++){
           System.out.print(input[a][b][c] + " ");
         }
         System.out.println();
       }
     }
   }
   
   public static int findMin(int[][][] input){
     int minimum = 101;
     for(int a=0; a<input.length; a++){
       for(int b=0;b<input[a].length; b++){
         for(int c=0; c<input[a][b].length; c++){
         if (input[a][b][c] < minimum) minimum = input[a][b][c];
         }
       }
     }
     return minimum;
   }
   
   public static void sort(int[] input){
     for(int a=0; a<input.length; a++){
       int place = a;
       for(int b=a; b<input.length; b++){
         if(input[place] > input[b]){
             place = b;
         }     
       }
       int temp = input[a];
       input[a] = input[place];
       input[place] = temp;
     }
   }
   
   public static void sort(int[][] input){
     for (int b=0; b<input.length; b++)sort(input[b]);
     for(int a=0; a<input.length; a++){                                         
       for(int b=a; b>0; b--){
         if(input[b-1][0] > input[b][0]){
           int[] temp = input[b-1];
           input[b-1] = input[b];
           input[b] = temp;
         }
         else{
          break;
         }
        }
     }
   }
}                            