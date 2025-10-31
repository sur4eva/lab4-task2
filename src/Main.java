//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{ Car car = new Car("m5","dark","bmw",2005,1,1100);
    System.out.println(car);
    car.sell();
    System.out.println("brand "+car.getBrand());
    System.out.println("color "+car.getColor());
    System.out.println("model "+car.getModel());
    System.out.println("quantity "+car.getQuantity());
    System.out.println("year "+car.getYear());
    System.out.println("price "+car.getPrice());
car.setBrand("mazda");
car.setColor("pink");
car.setPrice(10000) ;
    System.out.println(car);

}
