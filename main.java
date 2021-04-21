package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//          data_type [name] = value;
        /*
        int i = 200; // 32bit from -2M to 2M
        byte b = 10; //8 bit from -128 to 127
        short s = 10; //16bit from -32768 to 32767
        long l = 1234213L; //64bit

        double pi = 3.14; //64bit
        float f = 4.15f; //

        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(pi);
        System.out.println(f);
        */

        /*
        double s = 200; //if one is double, then it can be double as result
        int v = 16;
        s = 300; //program runs from top to bottom, so s=300 will be taken for t equation
        double t = s/v;

        int a = 10;
        int b = a+5;
        b = b - 5; //read or assignment goes from right to left. 5 deduct from b (that already 15), then b=10

        System.out.println(t);
        System.out.println(b);
        */

        /*
        double pi = 3.14;
        double radius = 10;
        System.out.println(pi*radius*radius);
        */

        /*
        boolean check = true;
        boolean run = false;
        */

        /*
        String name = "John";
        String surname = "Doe";
        int age = 40;
        System.out.println("Hello, "+name+" "+surname+". Age: "+age);
        System.out.println("Hello world");
        */

        /*
        boolean a = 5 > 7; //false
        boolean b = 10 == 10; //true
        boolean c = 5 != 10; //true
        boolean d = 10 >= 10; //true
        boolean e = true && false; // false
        boolean f = false || true || false; //true
        boolean g = false || false; //false
        */

        /*
        Scanner name_in = new Scanner(System.in);
        double pi = 3.14;
        double radius = name_in.nextDouble();
        System.out.println(pi*radius*radius);
        */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double d = in.nextDouble();
        String s = in.next();
        System.out.println(a);
        System.out.println(d);
        System.out.println(s);
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a: ");
        int a = in.nextInt();
        System.out.println("Insert d: ");
        double d = in.nextDouble();
        System.out.println("Insert s: ");
        String s = in.next();
        System.out.println(a);
        System.out.println(d);
        System.out.println(s);
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your age");
        int age = in.nextInt();
        if(age >= 21){
            System.out.println("WELCOME");
        }else{
            System.out.println("NOT ALLOWED");
        }
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your mark");
        int mark = in.nextInt();
        if(mark >= 90){
            System.out.println("A");
        }else if(mark >= 75){
            System.out.println("B");
        }else if(mark >= 60){
            System.out.println("C");
        }else if(mark >= 50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your mark");
        int mark = in.nextInt();
        if(mark >= 90){
            System.out.println("A");
        }
        if(mark >= 75){
            System.out.println("B"); //when each w IF, then each condition will be checked.
        }
        if(mark >= 60){
            System.out.println("C");
        }
        if(mark >= 50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert day");
        int day = in.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int i = in.nextInt();
        System.out.println("One more: ");
        int j = in.nextInt();
        if(i > j){
            System.out.println(i);
        }else if(i < j) {
            System.out.println(j);
        }else{
            System.out.println("Numbers are equal.");
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n: ");
        int n = in.nextInt();
        if(n > 100 && n < 500) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int i = in.nextInt();
        System.out.println("One more: ");
        int j = in.nextInt();
        if(i - j == 100 || j - i == 100){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n: ");
        int n = in.nextInt();
        if(n % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert month");
        int month = in.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error");
        }

         */
        /*
        int i = 0;
        while(i < 10){
            System.out.println("Hello, World");
            i++;
        }
        */

        /*
        int i = 0;
                do{ //do run program at least once if even condition(while) is false.
            System.out.println(i);
            i++;
        }while(i < 10);
        */

        /*
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = in.nextInt();

        for(int i = 0; i < 10; i++){
            System.out.print(n);
            System.out.print(" ");
        }
        */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = in.next();
        System.out.print("Enter integer n: ");
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(s);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int n = in.nextInt();
        System.out.print("Enter end number: ");
        int m = in.nextInt();

        if(n < m){
            for(int i = n; i <= m; i++){
                System.out.print(i);
                System.out.print(" ");
            }
        }else{
            for(int j = n; j >= m; j--){
                System.out.print(j);
                System.out.print(" ");
            }
        }
         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = in.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
        }else{
            for(int j = 1; j >= n; j--) {
                if(j % 2 == 1 || j % 2 == -1) {
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
        }
          */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int N = in.nextInt();

        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                System.out.print(i);
                System.out.print(" ");
                System.out.println(i * i);
            }
        }else{
            for(int j = 1; j >= N; j--) {
                System.out.print(j);
                System.out.print(" ");
                System.out.println(j * j);;
                }
            }
         */

//        int [] nums = new int[5];
//        int [] nums = {100,90,85,54,60, 4,5,4,32,324,8};
//        System.out.println(nums[2]);
//        System.out.println(nums[4]);
//        System.out.println(nums.length);

        /*
        int [] nums = new int[5];
        nums [0] = 10;
        nums [1] = 20;
        nums [2] = 30;
        nums [3] = 40;
        nums [4] = 50;
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        int [] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert size of array");
        int size = in.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Insert number");
            nums[i] = in.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.print(sum);
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i+" - "+numbers[i]);
        }
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                System.out.print(numbers[i]+" ");
            }
        }

         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i]+" ");
            }
        }
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
