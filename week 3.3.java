import java.util.Arrays;
import java.util.Scanner;
public class ArrayProcessor{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        
        int[]array=new int[size];
        
        for(int i= 0;i<size;i++){
            array[i]=scanner.nextInt();
            
        }
        
        int [] processedArray = processArray(array);
        for(int num : processedArray){
            System.out.print(num +" ");
        }
        System.out.println();
        scanner.close();
    }
    public static int[] processArray(int[] arr){
        if(arr == null||arr.length==0){
            return new int[0];
        }
        
        int maxNum =findMax(arr);
        
        int[] finalArray = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            finalArray[i]=maxNum*(arr[i]-maxNum);
        }
        return finalArray;
        }
        private static int findMax(int[] arr){
            int max =arr[0];
            for(int num : arr){
                if (num>max){
                    max=num;
                }
            }
         return max;
        }
    }
