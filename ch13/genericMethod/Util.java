package ch13.genericMethod;

public class Util {
	// generic method test
	public static <T> Box<T> boxing(T t) {
		// static : no new using method
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
