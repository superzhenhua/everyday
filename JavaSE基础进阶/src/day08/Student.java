package day08;

public class Student implements Comparable<Student>{
    private String name ;
    private int Chinese ;
    private int English ;
    private int Math ;

    public Student(String name, int chinese, int english, int math) {
        this.name = name;
        Chinese = chinese;
        English = english;
        Math = math;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", English=" + English +
                ", Math=" + Math +
                '}';
    }
    public int getSum(){
        return getChinese() +getEnglish()+getMath();
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getSum() - o.getSum();
        //总分一样比较语文成绩
        result=result == 0? this.getChinese()-o.getChinese():result;
        //比较数学
        result=result == 0? this.getMath()-o.getMath():result;
        //比较英语
        result=result == 0? this.getEnglish()-o.getEnglish():result;
        //比较姓名
        result=result == 0?this.name.compareTo(o.getName()):result;
        return 0;
    }
}
