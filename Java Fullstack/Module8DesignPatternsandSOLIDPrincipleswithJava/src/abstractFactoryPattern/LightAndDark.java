package abstractFactoryPattern;

//Light Theme Components
class LightButton implements Button {
	public void render() {
		System.out.println("Rendering Light Button");
	}
}

class LightTextField implements TextField {
	public void display() {
		System.out.println("Displaying Light TextField");
	}
}

//Dark Theme Components
class DarkButton implements Button {
	public void render() {
		System.out.println("Rendering Dark Button");
	}
}

class DarkTextField implements TextField {
	public void display() {
		System.out.println("Displaying Dark TextField");
	}
}
