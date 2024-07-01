package chap05;

import java.util.Scanner;

public class ArrayScoresExam {

    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받기 위해 준비합니다.
        Scanner input = new Scanner(System.in);
        
        // 사용자에게 학생 수를 입력하도록 요청합니다.
        System.out.println("성적표");
        System.out.print("학생수를 입력하세요: ");
        
        // 학생 수를 입력받아 변수 count에 저장합니다.
        int count = input.nextInt();
        // 입력받은 학생 수를 기준으로 점수를 저장할 배열을 생성합니다.
        int[] scores = new int[count]; 
        System.out.println("배열의 길이: " + scores.length); // 배열의 길이를 출력합니다.
        
        // 학생 수만큼 반복하면서 각 학생의 점수를 입력받아 배열에 저장합니다.
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번째 학생의 점수를 입력하세요: ");    
            scores[i] = input.nextInt();
        }
        
        // 현재 입력된 점수를 출력합니다.
        System.out.println("현재 입력된 점수는 다음과 같습니다:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println(); // 줄바꿈을 위해 사용합니다.

        // 수정할 학생 번호를 입력받습니다.
        System.out.print("수정할 학생 번호를 입력하세요: ");
        int select = input.nextInt();
        // 수정할 점수를 입력받습니다.
        System.out.print("수정할 점수를 입력하세요: ");
        int newScore = input.nextInt();
        
        // 입력받은 학생 번호에 해당하는 점수를 새 점수로 수정합니다.
        scores[select - 1] = newScore;
        
        // 수정된 점수를 출력합니다.
        System.out.println("수정된 점수는 다음과 같습니다:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println(); // 줄바꿈을 위해 사용합니다.
        
        // 총점을 계산하여 출력합니다.
        int sum = total(scores);
        System.out.println("총점은 " + sum + "입니다.");
        
        // 평균을 계산하여 출력합니다.
        double ave = average(sum, count);
        System.out.println("평균은 " + ave + "점입니다.");
        
        // Scanner 객체를 닫아줍니다.
        input.close();
    } // main() 메서드 종료
    
    // scores 배열을 받아서 총점을 계산하는 메서드입니다.
    static int total(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // scores 배열의 모든 값을 sum에 더합니다.
        }
        return sum; // 총점을 반환합니다.
    }
    
    // 총점과 학생 수를 받아서 평균을 계산하는 메서드입니다.
    static double average(int sum, int count) {
        return (double) sum / count; // 총점을 학생 수로 나누어 평균을 계산합니다.
    }//main
}//class