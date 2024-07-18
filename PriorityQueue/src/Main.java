
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
    private String isim;
    private int id;
    
    public Player(String isim, int id){
        this.id=id;
        this.isim=isim;
    }

    @Override
    public int compareTo(Player player1) {
        if(this.id<player1.id){
            return 1;
        }
        else if(this.id>player1.id){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }
}
public class Main {

    
    public static void main(String[] args) {
        //bu kuyruk öncelikli  kuyruk.
        Queue<Player> queue = new PriorityQueue<Player>();
        
        queue.offer(new Player("eren", 5));
        queue.offer(new Player("Melih", 1));
        queue.offer(new Player("mehmet", 100));
        
        while (!queue.isEmpty()) {            
            System.out.println("Eleman çıkarılıyor:"+queue.poll());
        }
        
        
        /*
        queue.offer(2);
        queue.offer(1);
        queue.offer(100);
        queue.offer(5);
        
        //Foreach döngüsünde istediğimiz sopnucu alamıyoruz.
        for(Integer i:queue){
            System.out.println(i);
        }
        
        
        System.out.println(queue.peek());
        //burada kuyruğun en başındai elemanı döndürüyor.
        
        while(!queue.isEmpty()){
            System.out.println("Eleman çıkarılıyor:" + queue.poll());
        }
        //burada gördüğümüz gibi öncelikli oalrak çıkıyor.
        */
    }
    
}
