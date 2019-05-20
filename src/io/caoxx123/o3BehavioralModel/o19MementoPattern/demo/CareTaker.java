package io.caoxx123.o3BehavioralModel.o19MementoPattern.demo;

        import java.util.ArrayList;
        import java.util.List;

public class CareTaker {//看门人，看管者
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
