package level2.exercise2;
import java.util.Objects;

public class Restaurant implements Comparable <Restaurant>{
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

    @Override
    public int compareTo(Restaurant other) {
        int result = this.name.compareTo(other.name);
        if (result != 0){
            return result;
        }
        return Integer.compare(other.score, this.score);
    }
}
