package lesson;

public class test2 { 

    public class Destination {
        String name;
        String country;
        double distance;

        public Destination(String name, String country, double distance) {
            this.name = name;
            this.country = country;
            this.distance = distance;
      
            System.out.println("Destination name: " + name + ", country: " + country + ", distance: " + distance + " km");
        }

        public Destination(String name, String country) {
            this(name, country, 0); 
        }

     
        public Destination() {
            this.name = "Неизвестное место";
            this.country = "Неизвестная страна";
            this.distance = 0;
       
            System.out.println("Destination name: " + name + ", country: " + country + ", distance: " + distance + " km");
        }
    }
}
