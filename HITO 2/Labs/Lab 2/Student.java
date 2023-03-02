package ejercisio;

public class Student {


        private String fulname;
        private String lastname;
        private int age;

        public Student(String fulname,String lastname,int age)
        {
            this.fulname = fulname;
            this.lastname = lastname;
            this.age = age;
        }
        public String getFullName()
        {
            return this.fulname;
        }
        public void setlastname(String lastname)
        {
            this.lastname =  lastname;
        }

        public  String getLastname()
        {
            return this.lastname;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public int getAge()
        {
            return this.age;
        }

        public void setFulname(String fulname)
        {
            this.fulname = fulname;
        }
        // uso get permite cambiar un valor que retorna algo

    }

