
    public class Participant {

         /*
        Declare static instance variables to store below information
        total number of participants -> variable name can be totalNumberOfParticipants
        total number of male participants -> variable name can be totalNumberOfMaleParticipants
        total number of female participants -> variable name can be totalNumberOfFemaleParticipants
         */

        //  Instance variables
        // Static -> belong to the Class. What does every sword has?
        public static int totalNumberOfParticipants;
        public static int totalNumberOfMaleParticipants;
        public static int totalNumberOfFemaleParticipants;

        /*
        Declare instance variables for each participant as below
        name -> can be String
        age -> can be int
        gender -> can be char
         */

        // Noo-static -> belong to the Object. What changing sword by sword?
        public String name;
        public int age;
        public char gender;

        public Participant(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        //Create a static void method addParticipants() that will increase totalNumberOfParticipants by 1
        public static void addParticipants(){
            totalNumberOfParticipants++;
        }
        //Create a static void method addMaleParticipants() that will increase totalNumberOfMaleParticipants by 1
        public static void addMaleParticipants(){
            totalNumberOfMaleParticipants++;
        }
        //Create a static void method addFemaleParticipants() that will increase totalNumberOfFemaleParticipants by 1
        public static void addFemaleParticipants(){
            totalNumberOfFemaleParticipants++;
        }
        //Override toString() method and implement a new body that will return all information about a Participant
        @Override
        public String toString() {
            return "Participant{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }


