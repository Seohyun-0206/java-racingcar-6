package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {

    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String ROUND_RESULT = "%s : %s";
    private static final String DISTANCE_RESULT = "-";
    private static final String WINNER = "최종 우승자 : ";
    private static final String DELIMITER = ",";

    public static void printResultMessage(){
        System.out.println(RESULT_MESSAGE);
    }

    public static void printRoundResult(List<Car> carList){
        for (Car car : carList){
            System.out.printf(ROUND_RESULT, car.getCarName(), DISTANCE_RESULT.repeat(car.getDistance()));
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinner(List<String> winnerList){
        System.out.print(WINNER);

        String winnerResult = String.join(DELIMITER, winnerList);
        System.out.println(winnerResult);
    }
}
