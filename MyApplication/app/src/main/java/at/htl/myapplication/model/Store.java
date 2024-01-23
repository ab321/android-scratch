package at.htl.myapplication.model;

import javax.inject.Inject;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

public class Store {
    public final BehaviorSubject<Model> subject;

    @Inject
    public Store(){
        subject = BehaviorSubject.createDefault(new Model());
    }
}
