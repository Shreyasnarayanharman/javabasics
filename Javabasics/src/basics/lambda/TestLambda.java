package basics.lambda;

public class TestLambda {

	public static void main(String[] args) {
		MyDraw myDraw = new MyDraw();
		myDraw.draw();
		//after lambda expression came
		Drawable d2 = () -> {System.out.println("lambda's drawing");		};
		d2.draw();

		Sayable s2 = (name)->{ return "hello "+name; };
		System.out.println(s2.say("Shreyas"));

		//life without lamda
		MySay mySay = new MySay();
		System.out.println(mySay.say("Narayan"));
	}

}
