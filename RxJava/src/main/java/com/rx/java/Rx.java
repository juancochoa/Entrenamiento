package com.rx.java;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public class Rx {
	public static void main(String[] args) {
		Observable<String> myObservable = Observable.create(new Observable.OnSubscribe<String>() {

			@Override
			public void call(Subscriber<? super String> t) {
				t.onNext("hello");
				t.onCompleted();
			}

		});
		Subscriber mySubscriber = new Subscriber<String>() {

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub

			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNext(String t) {
				System.out.println(t);
			}
		};
		myObservable.subscribe(mySubscriber);
		Observable<String> otroObservable = Observable.create(new Observable.OnSubscribe<String>() {

			@Override
			public void call(Subscriber<? super String> t) {
				t.onNext("hola");
				t.onCompleted();
			}
		});
		Subscriber otroSubscriber = new Subscriber<String>() {

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub

			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNext(String t) {
				System.out.println(t);

			}
		};
		otroObservable.subscribe(otroSubscriber);
		Observable<String> tercerObservable = Observable.just("hola");
		Action1<String> onNextAction = new Action1<String>() {

			@Override
			public void call(String t) {
				System.out.println(t);
			}
		};
		tercerObservable.subscribe(onNextAction);
		Observable.just("vamos").subscribe(new Action1<String>() {

			@Override
			public void call(String t) {
				System.out.println(t);
			}
		});
		Observable.just("con lambdas").subscribe(s->System.out.println(s));
		Observable.just("Hello, world!")
	    .map(s -> s.hashCode())
	    .subscribe(i -> System.out.println(Integer.toString(i)));
	}
}
