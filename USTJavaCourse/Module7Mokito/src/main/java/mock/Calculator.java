package mock;


public class Calculator {
    private final DataService dataService;

    public Calculator(DataService dataService) {
        this.dataService = dataService;
    }
    public void processData(int input) {
        dataService.someMethod(input);
    }

    public int addData() {
        int[] data = dataService.retrieveData();
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }
}

interface DataService {
	
    int[] retrieveData();
	void someMethod(Integer capture);

}

