public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom sdc = new SimpleDotCom();

        int[] locations = {2,3,4};
        //sdc.setLocationCells(locations);
        String guess = "2";
        String result = sdc.checkYourself(guess);
        String testResult = "Неудача";
        if (result.equals("Попал")){
            testResult = "Пройден";
        }
        System.out.println(testResult);
        System.out.println(sdc.getNumOfHits());
    }
}
