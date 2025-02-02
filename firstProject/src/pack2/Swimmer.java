package pack2;

	public class Swimmer extends Athlete {
	    double swimTime;

	    public Swimmer(String name, double swimTime) {
	        this.name = name;  
	        this.swimTime = swimTime;
	    }

	    public void swim() {
	        System.out.println("Пловец " + name + " проплыл за " + swimTime + " минут.");
	    }
	}

