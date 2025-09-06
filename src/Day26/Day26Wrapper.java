package Day26;


public class Day26Wrapper {
    public static void main(String[] args) {
        int num1 = 100;
        double num2 = 3.14;
        char ch = 'A';
        boolean flag = true;

        Integer wNum1 = Integer.valueOf(num1);
        Double wNum2 = Double.valueOf(num2);
        char wCh = Character.valueOf(ch);
        Boolean wFlag = Boolean.valueOf(flag);

        System.out.println("Wrapper 객체 출력");
        System.out.println("wNum1 = " + wNum1);
        System.out.println("wNum2 = " + wNum2);
        System.out.println("wCh = " + wCh);
        System.out.println("wFlag = " + wFlag);

        Integer aNum = num1;
        Double aDbl = num2;

        int uNum = aNum;
        double uDbl = aDbl;

        System.out.println("\nAutoboxing & Unboxing 결과");
        System.out.println("uNum = " + uNum);
        System.out.println("uDbl = " + uDbl);

        String s1 = "123";
        String s2 = "45.67";

        int pNum = Integer.parseInt(s1); //객체화 적당히해 ㅆ비ㅏㅇ세야
        double pDbl = Double.parseDouble(s2);

        System.out.println("\nParsing 결과");
        System.out.println("pNum = " + pNum);
        System.out.println("pDbl = " + pDbl);

        String str1 = wNum1.toString();
        String str2 = String.valueOf(flag);

        System.out.println("\n문자열 변환 결과");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println( "\nWrapper 유틸 메서드 예시");
        System.out.println("최대값(max) : " + Integer.max(10,20));
        System.out.println("글자(text) : " + Character.isLetter('가'));

    }
}
