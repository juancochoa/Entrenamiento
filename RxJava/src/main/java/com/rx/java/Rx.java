package com.rx.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
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
		Observable.just("con lambdas").subscribe(s -> System.out.println(s));
		Observable.just("Hello, world!").map(s -> s.hashCode()).subscribe(i -> System.out.println(Integer.toString(i)));
		Observable.just(1, 2).first().subscribe(s -> System.out.println(s));

		Observable<Integer> obs = Observable.just(1);
		Subscriber<Integer> subs = (Subscriber<Integer>) obs.subscribe(t -> System.out.println(t));
		Observable.empty();
		Throwable error = new Throwable("error de prueba");
		Observable.error(error).subscribe(t -> System.out.println(t), s -> System.out.println(s.getMessage()));
		Callable<Integer> task = () -> {
			try {
				TimeUnit.SECONDS.sleep(10);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);

		System.out.println("future done? " + future.isDone());
		//Observable.from(future, 2, TimeUnit.SECONDS).subscribe(s -> System.out.println(s), t -> System.err.println(t));
		//Observable.interval(5, 2, TimeUnit.SECONDS).subscribe(s->System.out.println(s));
		//Observable.interval(2, TimeUnit.SECONDS).subscribe(s->System.out.println(s));
		List<Integer>enteros=new ArrayList<Integer>();
		enteros.add(3);
		enteros.add(4);
		enteros.add(45);
		//Observable.just(enteros).subscribe(e->System.out.println(e.toString()));
		//Observable.range(-34, 10).subscribe(s->System.out.println(s), t->System.out.println(t));
		//Observable.just(enteros).repeat(5).subscribe(s->System.out.println(s));
		// System.out.println("future done? " + future.isDone());
		// System.out.print("result: " + result);
		// System.out.println("future done? " + future.isDone());
		// System.out.print("result: " + result);
		Observable.timer(20, TimeUnit.SECONDS).subscribe(t->System.out.println(t));
		Observable.just(1,2,3,4,5).scan(5,(x,y)->x+y).subscribe(t->System.out.println(t));

	}
	public static void prueba(){
		System.out.println("esta entrando a la función");
	}
}
