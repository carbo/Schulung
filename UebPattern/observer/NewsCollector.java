package UebPattern.observer;

import java.util.ArrayList;

public class NewsCollector implements Subject1 {

    private final ArrayList<Observer1> abonenntenList;
    private final ArrayList<String> news;

    public NewsCollector() {
        abonenntenList = new ArrayList<Observer1>();
        news = new ArrayList<String>();
    }

    @Override
    public void registerObserver(Observer1 o) {
        abonenntenList.add(o);
    }

    @Override
    public void removeObserver(Observer1 o) {
    }

    @Override
    public void notifyAllObservers() {
        for (Observer1 o : abonenntenList) {
            o.update(this);
        }
    }

    public void addNews(String news) {
        this.news.add(news);
        notifyAllObservers();
    }

    public ArrayList<String> getNews() {
        return news;
    }

    @Override
    public String toString() {
        return news.toString();
    }
}
