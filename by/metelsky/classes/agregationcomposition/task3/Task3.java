package by.metelsky.classes.agregationcomposition.task3;
/*3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
  */
public class Task3 {

	public static void main(String[] args) {
		Town town1 = new Town(1000,"Town1");
		Town town2 = new Town(12000,"Town2");
		Town town3 = new Town(200,"Town3");
		Town town4 = new Town(202000,"Town4");
		Town town5 = new Town(1000000,"Town5");
		Town town6 = new Town(13000,"Town6");
		Town town7 = new Town(22000,"Town7");
		Town town8 = new Town(17500,"Town8");
		Town town9 = new Town(235980,"Town9");
		Town town10 = new Town(11000,"Town10");
		District district1 = new District();
		district1.addTown(town1);
		district1.addTown(town2);
		district1.addTown(town3);
		district1.addTown(town4);
		district1.setArea(123586);
		District district2 = new District();
		district2.addTown(town5);
		district2.addTown(town6);
		district2.addTown(town7);
		district2.addTown(town8);
		district2.setArea(2501584);
		District district3 = new District();
		district3.addTown(town9);
		district3.addTown(town10);
		district3.setArea(123456);
		Region region1 = new Region();
		region1.addDistrict(district1);
		region1.addDistrict(district2);
		region1.setCapital(town4);
		Region region2 = new Region();
		region2.addDistrict(district3);
		region2.setCapital(town9);
		State state = new State();
		state.addRegion(region1);
		state.addRegion(region2);
		state.setCapital(town5);
		View view = new View();
		view.printTowName(state.getCapital());
		view.printDistrictsNumber(StateLogic.getRegionNumber(state));
		view.printArea(StateLogic.getArea(state));
		view.printTowns(StateLogic.getRegionCapital(state));
		

	}

}
