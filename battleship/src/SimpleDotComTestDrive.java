public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom sdc = new DotCom();

        int[] locations = {2,3,4};
        //sdc.setLocationCells(locations);
        String guess = "2";
        String result = sdc.checkYourself(guess);
        String testResult = "Неудача";
        if (result.equals("Попал")){
            testResult = "Пройден";
        }
        //123123
        System.out.println(testResult);
    }
}
