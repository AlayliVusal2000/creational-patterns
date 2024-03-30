package builder;
public class Human {


	private String name;
	private String surname;
	private int age;
	private String email;
	private String phoneNumber;
	private boolean car;

	public Human(HumanBuilder humanBuilder) {
		this.name = humanBuilder.name;
		this.surname = humanBuilder.surname;
		this.age = humanBuilder.age;
		this.email = humanBuilder.email;
		this.phoneNumber = humanBuilder.phoneNumber;
		this.car = humanBuilder.car;
	}

	public static class HumanBuilder{

		private String name;
		private String surname;
		private int age;
		private String email;
		private String phoneNumber;
		private boolean car;


		public HumanBuilder(String name, String surname, int age) {
			this.name = name;
			this.surname = surname;
			this.age = age;
		}
		public HumanBuilder setEmail(String email){
			this.email=email;
			return this;
		}

		public HumanBuilder setPhoneNumber( String phoneNumber){
			this.phoneNumber=phoneNumber;
			return this;
		}
		public HumanBuilder isCar(boolean car){
			this.car=car;
			return this;
		}

		public Human build(){
			return new Human(this);
		}

	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", car=" + car +
				'}';
	}
}