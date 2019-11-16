import java.util.List;

public class Cell {

  private boolean alive = false;
  
  public Cell() {
    this.alive = false;
  }
  
  public Cell(boolean alive) {
    this.alive = alive;
  }
  
  public String print() {
    if(alive) {
      return "o";
    } else {
      return "x";
    }
  }

  public void liveBasedOn(List<Cell> neighbors) {
    int livingNeighborCount = 0;
    for(int i=0;i<neighbors.size();i++) {
      Cell neighbor = neighbors.get(i);
      if(neighbor.isAlive()) {
        livingNeighborCount++;
      }
    }
    
    if(livingNeighborCount >=2 && livingNeighborCount <= 3) {
      this.alive = true;
    } else {
      this.alive = false;
    }
  }
  
  private boolean isAlive() {
    return alive;
  }
  
}
