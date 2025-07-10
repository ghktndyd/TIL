package designpattern.observer;

// 주제 인터페이스: 옵저버들을 등록, 삭제, 알림하는 인터페이스이자 주제의 역할을 하는 구현체들이 구현해야 하는 인터페이스
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
