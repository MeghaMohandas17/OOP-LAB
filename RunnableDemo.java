class Fibonacci implements Runnable{

int n;
public Fibonacci(int n){
this.n = n;
}

public void run(){
int a = 0, b = 1;
for(int i = 0; i < n; i++){
System.out.println(a);
int next = a + b;
a = b;
b = next;
try{
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println(e);
}
}
}
}

class EvenNumbers implements Runnable{
int start, stop;
public EvenNumbers(int start, int stop){
this.start = start;
this.stop = stop;
}

public void run(){
for(int i = start; i < stop; i++){
if(i%2==0){
System.out.println(i);
try{
Thread.sleep(2000);
}catch(InterruptedException e){
System.out.println(e);
}
}
}
}
}

public class RunnableDemo{
public static void main(String args[]){
Runnable f = new Fibonacci(10);
Runnable e = new EvenNumbers(20,30);

Thread fThread = new Thread(f);
Thread eThread = new Thread(e);

fThread.start();
eThread.start();
}
}
