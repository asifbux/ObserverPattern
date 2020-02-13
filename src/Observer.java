public abstract class Observer {

    private Subject theSubject;


    public abstract void update();

    public Subject getTheSubject() {
        return theSubject;
    }

    public void setTheSubject(Subject theSubject) {
        this.theSubject = theSubject;
    }
}
