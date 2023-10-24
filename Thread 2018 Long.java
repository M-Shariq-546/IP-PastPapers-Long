class MyThread extends Thread{
    private int n ;
    
    MyThread(int n ){
        this.n = n;
    }
    @Override
    public void run(){
        if(n%2==0){
            for(int i =0 ; i<=n ; i+=1){
                System.out.println("All Numbers from the given "+ n +" are: "+ i +"\n");
            }
        }
        else{
            System.out.println("Sorry you Entered the Wrong Input.");
            }
        }
    }


class MyThreading{
    public static void main(String[] args){
        int n =100;
        MyThread myth= new MyThread(n);
        
        myth.start();

    }
}
