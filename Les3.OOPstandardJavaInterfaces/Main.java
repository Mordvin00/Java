public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Artem", "Vladimirovich", "Mordvinov");
        Student student2 = new Student(2, "Stepan", "Artemovich", "Mordvinov");
        Student student3 = new Student(3, "Kirill", "SecondName", "Moiseev");
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(student3);
        studentGroup.add(student1);
        studentGroup.add(student2);
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFio()) {
            System.out.println(student);
        }
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }
    }
}
