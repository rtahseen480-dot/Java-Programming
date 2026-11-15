public class interface1 {
    public static void main(String[] args) {
        queen q= new queen();
        q.moves();
        beer b= new beer();
        b.eat();
            
        }  
    }
    
interface herbivore{
      void eat();
        
    }
   
interface carnivore{
    void eat();

}

class beer implements herbivore,carnivore{
    public void eat(){
        System.out.println("eat grasses and meat");
    }

}
   interface chessPlayer{
    void moves();

}

class queen implements chessPlayer{
     public void moves(){
        System.out.println("up,down,left.right,diagonal(all 4 direction)");
    }
}

class rook implements chessPlayer{
     public void moves(){
        System.out.println("up,down,left.right");
    }
}

class king implements chessPlayer{
     public void moves(){
        System.out.println("up,down,left.right, diagonal(by 1 step)");
    }
}
