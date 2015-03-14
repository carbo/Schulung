package UebPattern.observer;

import java.util.ArrayList;

public class Headhunter implements Subject1 {

    // define a list of users, such as Mike, Bill, etc.
    private final ArrayList<Observer1> userList;
    private final ArrayList<String> jobs;

    public Headhunter() {
        userList = new ArrayList<Observer1>();
        jobs = new ArrayList<String>();
    }

    @Override
    public void registerObserver(Observer1 o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer1 o) {
    }

    @Override
    public void notifyAllObservers() {
        for (Observer1 o : userList) {
            o.update(this);
        }
    }

    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObservers();
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    @Override
    public String toString() {
        return jobs.toString();
    }
}
