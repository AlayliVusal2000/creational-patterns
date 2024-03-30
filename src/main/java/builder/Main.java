package builder;

public class Main {
	public static void main(String[] args) {
		Human human=new Human.HumanBuilder("John","Alex",23)
				.setEmail("john0@mail.ru").isCar(false).build();
		System.out.println(human.toString());
		
	}

}