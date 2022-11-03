package developer_vassiljev;
/**
 * Business logic for class {@link Developer}
*/

public class DeveloperLogic {
	//Данный класс, вычисляет часовую ставку и годовой доход разработчика.
	public int calculateHourRate(Developer developer) {
        return developer.getSalary() / 20 / 8;
    }

    public int calculateAnnualSalary(Developer developer) {
        return developer.getSalary() * 12;
    }

}
