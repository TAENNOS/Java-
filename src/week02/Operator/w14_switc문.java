package week02.Operator;

public class w14_switc문 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";

        //switch문
        switch (month) {
            // case ~~~~ 연산
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "5월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
                monthString = "9월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = "알 수 없음";
        }
        System.out.println(monthString); // 8월 출력

        System.out.println("if문-----------");

        // if 로 변환
        if (month == 1) {
            monthString = "1월";
        } else if (month == 2) {
            monthString = "2월";
        } else if (month == 3) {
            monthString = "3월";
        } else if (month == 4) {
            monthString = "4월";
        } else if (month == 5) {
            monthString = "5월";
        } else if (month == 6) {
            monthString = "6월";
        } else if (month == 7) {
            monthString = "7월";
        } else if (month == 8) {
            monthString = "8월";
        } else if (month == 9) {
            monthString = "9월";
        } else if (month == 10) {
            monthString = "10월";
        } else if (month == 11) {
            monthString = "11월";
        } else if (month == 12) {
            monthString = "12월";
        } else {
            monthString = "알수 없음";
        }
        System.out.println(monthString); // 8월 출력
    }
}
