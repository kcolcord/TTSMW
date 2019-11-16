import java.util.ArrayList;
import java.util.List;

public class ConwayGameOfLife {

  public static void main(String[] args) {
    
    Cell[] row1 = {new Cell(true), new Cell(), new Cell(true)};
    Cell[] row2 = {new Cell(), new Cell(true), new Cell()};
    Cell[] row3 = {new Cell(), new Cell(), new Cell(true)};
    
    Cell[][] grid = { row1, row2, row3 };
    
    print(grid);
    
    System.out.println("---");

    grid = nextRound(grid);
    print(grid);
    
    System.out.println("---");

    grid = nextRound(grid);
    print(grid);
    
    System.out.println("---");

    grid = nextRound(grid);
    print(grid);
  }

  public static void print(Cell[][] tron) {
    for(int i=0;i<3;i++) {
      for(int j=0;j<3;j++) {
        System.out.print(tron[i][j].print());
      }
      System.out.println("");
    }
  }
  
  public static Cell[][] nextRound(Cell[][] oldGrid) {
    Cell[] row1 = {new Cell(), new Cell(), new Cell()};
    Cell[] row2 = {new Cell(), new Cell(), new Cell()};
    Cell[] row3 = {new Cell(), new Cell(), new Cell()};
    
    Cell[][] newGrid = { row1, row2, row3 };
    
    for(int i=0;i<3;i++) {
      for(int j=0;j<3;j++) {
        List<Cell> neighbors = new ArrayList<>();
        if(i > 0) {
          neighbors.add(oldGrid[i-1][j]);
        }
        if(j > 0) {
          neighbors.add(oldGrid[i][j-1]);
        }
        if(i < 2) {
          neighbors.add(oldGrid[i+1][j]);
        }
        if(j < 2) {
          neighbors.add(oldGrid[i][j+1]);
        }
        
        newGrid[i][j].liveBasedOn(neighbors);
      }
    }
    
    return newGrid;
  }
}