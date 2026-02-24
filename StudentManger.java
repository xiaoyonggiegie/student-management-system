import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.查看学生成绩");
            System.out.println("3.删除学生成绩");
            System.out.println("0.退出");
            System.out.print("请选择操作：");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("请输入学生姓名:");
                String name = scanner.next();
                System.out.print("请输入学生分数:");
                int score = scanner.nextInt();
                students.add(new Student(name, score));
                System.out.println("添加成功！");
                
            } else if (choice == 2) {
                System.out.println("---成绩列表---");
                for (Student student : students) {
                    student.score();
                }
                System.out.println("------------");
                
            } else if (choice == 0) {
                System.out.println("退出程序");
                break;
                
            
               } else if (choice == 3) {
                System.out.print("请输入要删除学生的姓名:");
                String nameToDelete = scanner.next();
                boolean found = false;
                for (Student s : students) {
                    if (s.name.equals(nameToDelete)) {  
                        students.remove(s);
                        System.out.println("删除成功！");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("未找到该学生！");
                }
                
            }  else {
                System.out.println("无效的选择，请重新输入");
            }
        }
        
        scanner.close();
    }
}