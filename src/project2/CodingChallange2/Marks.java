package project2.CodingChallange2;

public abstract class Marks {
    int sum;
    abstract void getPercentage(int [] arr);

}
class A extends Marks{

    @Override
    void getPercentage(int[] arr) {
        for (int i:arr
             ) {
            sum+=i;

        }
       int average= sum/arr.length;
        System.out.println("The average marks of student A is "+average);
    }
}
class B extends Marks{

    @Override
    void getPercentage(int[] arr) {
        for (int i:arr
        ) {
            sum+=i;

        }
        int average= sum/arr.length;
        System.out.println("The average marks of student B is "+average);
    }
}

