import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> observerList;
    private int number;

    public Subject() {
        observerList = new ArrayList <Observer>();
    }

    public void registerObserver(Observer o) {
        observerList.add(o);
        o.setTheSubject(this);
    }

    public void removeObserver(Observer o) {
        observerList.remove(o);

    }

    public void notifyAllObserver() {
        for(Observer o: observerList) {
            o.update();
        }

    }

    public ArrayList<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(ArrayList<Observer> observerList) {
        this.observerList = observerList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
