/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Main {

    static ArrayList<BigInteger> arr = new ArrayList<>();
    public static void main(String[] args) {
        arr.add(BigInteger.ZERO);
        arr.add(new BigInteger("2"));
        arr.add(new BigInteger("5"));
        arr.add(new BigInteger("13"));
        Scanner sc = new Scanner(System.in);
            for(int i=4; i<=1001; i++){
                BigInteger val = (arr.get(i-1).multiply(BigInteger.valueOf(2))).add(arr.get(i-2)).add(arr.get(i-3));
                arr.add(val);   
        }        
            while(sc.hasNext()){
                int n= sc.nextInt();
                System.out.println(arr.get(n));
            }
        
    }
}
