package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.laptop;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
        public static void main(String[] args) {
            //Student
            Session session = FactoryConfiguration.getInstance().getSession();

            FullName fullName = new FullName("minidu", "Kumasaru");
            Student student = new Student();
            student.setId(1);
            student.setName(fullName);
            student.setAddress("Panadura");
            //Open Transaction
            Transaction transaction = session.beginTransaction();

            //save student
            session.save(student);

            //delete student
            session.delete(student);

            //get student
            Student student1 = session.get(Student.class, 1);
            System.out.println(student1.toString());

            //commit
            transaction.commit();

            //Laptop
            Session session1 = FactoryConfiguration.getInstance().getSession();
            laptop laptop = new laptop();
            laptop.setId("l001");
            laptop.setName("vivabook");
            laptop.setBrand("lenavo");
            //Open Transaction
            Transaction transaction1 = session1.beginTransaction();

            //save laptop
            session1.save(laptop);

            //update laptop
            session1.update(laptop);

            //delete laptop
            session1.delete(laptop);

            //get laptop
            laptop laptop1 = session1.get(laptop.class, 1);
            System.out.println(laptop1.getId()+ " "+ laptop1.getName() + " " + laptop1.getBrand() + " ");
            transaction1.commit();
            session.close();
        }
    }