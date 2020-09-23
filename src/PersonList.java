import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PersonList {

    private List persons= new ArrayList<>();
    public void add(String p){
        persons.add(p);
    }

    public void remove(String p){
        if (!persons.contains(p))
            throw new NoSuchElementException();
        persons.remove(p);
    }

    public int size(){
        return persons.size();
    }

    public void removeAll(){
        persons.clear();
    }
}
