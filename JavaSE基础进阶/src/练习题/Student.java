package 练习题;

public class Student {
    private String name;
    private int age;
    private int ChineseScore;
    private int EnglishScore;
    private int MathScore;

    public Student() {
    }

    public Student(String name, int age, int chineseScore, int englishScore, int mathScore) {
        this.name = name;
        this.age = age;
        ChineseScore = chineseScore;
        EnglishScore = englishScore;
        MathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ChineseScore=" + ChineseScore +
                ", EnglishScore=" + EnglishScore +
                ", MathScore=" + MathScore +
                '}';
    }
    public int getScoreSum (){
        return this.ChineseScore+this.MathScore+this.EnglishScore;
    }
}
