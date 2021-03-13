public class Person{

        // instance variables
        private String name;
        private int age;
        private String placeOfBirth;
        private int idNumber;

        // constructor
        public Person(String name, int age, String placeOfBirth, int idNumber) {

            this.name = name;
            this.age = age;
            this.placeOfBirth = placeOfBirth;
            this.idNumber = idNumber;

        }
        // getter and setter methods

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return age
         */
        public int getAge() {
            return this.age;
        }

        /**
         * @return placeOfbirth
         */
        public String getPlaceOfBirth() {
            return this.placeOfBirth;

        }


        /**
         * @return IdNUmber
         */
        public int getIDNumber() {
            return this.idNumber;
        }

        /**
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @param age
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * @param placeOfBirth
         */
        public void setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
        }



        /**
         * @param idNumber
         */
        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        // toString methods to print out all instance variables values
        @Override
        public String toString() {
            return "Person [Age=" + age + ", idNumber=" + idNumber + ", name=" + name
                    + ", placeOfBirth=" + placeOfBirth + "]";
        }




}