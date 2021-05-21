public interface ICourse {
    void study();
}
public class JavaCourse implements ICourse {

    
    public void study() {
        System.out.println("hym 同学正在学习「Java」课程");
    }
}

public class DesignPatternCourse implements ICourse {

    
    public void study() {
        System.out.println("hym 同学正在学习「设计模式」课程");
    }
}
public class hym {

    public void study(ICourse course) {
        course.study();
    }
}
public static void main(String[] args) {
    hym Hym = new hym();
    hym.study(new JavaCourse());
    hym.study(new DesignPatternCourse());
}