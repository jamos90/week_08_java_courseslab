import db.DBCourse;
import db.DBHelper;
import db.DBMentor;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args){
        Course course1 = new Course("Software Development", "PDA");
        DBHelper.save(course1);

        Mentor mentor1 = new Mentor("Bryan");
        DBHelper.save(mentor1);

        Mentor mentor2 = new Mentor("Louis");
        DBHelper.save(mentor2);

        Student student1 = new Student("James", 28, 567, course1, mentor1);
        DBHelper.save(student1);

        Student student2 = new Student("Helen", 21, 12, course1, mentor2);
        DBHelper.save(student2);

        Lesson lesson1 = new Lesson("Hibernate", 22, course1);
        DBHelper.save(lesson1);

        Lesson lesson2 = new Lesson("Intellij", 22, course1);
        DBHelper.save(lesson2);

        Instructor instructor1 = new Instructor();
        DBHelper.save(instructor1);

        List<Student> studentsOnCourse1 = DBCourse.getStudentsOnCourse(course1);

        List<Lesson> lessondsFromCourse = DBCourse.getLessonsFromCourse(course1);

        Student mentorsStudent1 = DBMentor.getMentorsStudent(mentor1);
    }

}
