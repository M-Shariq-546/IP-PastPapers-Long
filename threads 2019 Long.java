import java.util.Scanner;


class MyThread extends Thread{
    private int n ;
    
    MyThread(int n ){
        this.n = n;
    }
    @Override
    public void run(){
        if(n>0){
            for(int i =1 ; i<=n ; i+=2){
                System.out.println("All Odd Numbers from the given "+ n +" are: "+ i +"\n");
            }
        }
        else{
            System.out.println("Sorry you Entered the negative Input.");
            }
        }
    }


class MyThreading{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        MyThread myth= new MyThread(n);
        myth.start();

    }
}
