package Objects;

public class Brick2HP extends Brick {
    public Brick2HP(int x, int y){
        super(x, y);
        HP = 2;
        score = HP*10;
        this.updateImage();
       }   
    @Override
    public void updateImage(){
      if(HP ==2)
        SetPath("src/PNG/03-Breakout-Tiles.png");
      else if(HP == 1)
        SetPath("src/PNG/04-Breakout-Tiles.png");
        
        super.loadImage();
    }
}
