public interface Course {
    public String getCourseName();
}

public class ProgrammingCourse implements Course {
    @Override
    public String getCourseName() {
        return "Java";
    }
}

public class NonProgrammingCourse implements Course {
    @Override
    public String getCourseName() {
        return "DSP";
    }
}

public interface Source {
    public String getSourceName();
}

public class Offline implements Source {
    @Override
    public String getSourceName() {
        return "Books";
    }
}

public class Online implements Source {
    @Override
    public String getSourceName() {
        return "YouTube";
    }
}

public abstract class SourceCourseFactory {
    public abstract Source getSource(String sourceType);

    public abstract Course getCourse(String courseType);
}

public class CourseFactory extends SourceCourseFactory {
    @Override
    public Source getSource(String sourceType) {
        return null;
    }

    @Override
    public Course getCourse(String courseType) {
        if (courseType.equalsIgnoreCase("programming")) {
            return new ProgrammingCourse();
        } else if (courseType.equalsIgnoreCase("non programming")) {
            return new NonProgrammingCourse();
        } else {
            return null;
        }
    }

    public class Ab {
        public static void main(String[] args) {
            SourceCourseFactory course = FactoryCreator.getSourceCourseFactory("course");

            System.out.println(course.getCourse("programming").getCourseName());

            SourceCourseFactory source = FactoryCreator.getSourceCourseFactory("source");
            System.out.println(source.getSource("online").getSourceName());

        }
    }
}