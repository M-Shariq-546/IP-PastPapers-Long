//Class of MyThread to implements the logic and function via overriding
class MyThread extends Thread{
    private int n ;
    private boolean isEven;
    //Constructor of MyThread class
    MyThread(int n , boolean isEven){
        this.n = n;
        this.isEven = isEven;
    }
    @Override
    public void run(){
      //if got true even thread runs otherwise odd thread will be in action  
      if(isEven){
            for(int i =0 ; i<n ; i+=2){
                System.out.println("Even Numbers: "+ i);
            }
        }
        else{
            for(int i=1 ; i<=n ; i+=2){
                System.out.println("Odd Numbers: "+ i);
            }
        }
    }
}
//Driver Class
class MyThreading{
    public static void main(String[] args){
        int n =100 , m = 100;
        MyThread evenTh = new MyThread(n , true);
        MyThread oddTh = new MyThread(m , false);
        //Initializing the multi-threading logic
        evenTh.start();
        oddTh.start();
    }
}
