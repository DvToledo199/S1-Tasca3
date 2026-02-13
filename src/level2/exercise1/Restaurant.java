package level2.exercise1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

  public Restaurant(String name, int score){
      this.name = name;
      this.score = score;
  }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Restaurant other = (Restaurant) obj;
        return Objects.equals(this.name, other.name) && this.score == other.score;
    }
    @Override
    public int hashCode() {
      return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}
