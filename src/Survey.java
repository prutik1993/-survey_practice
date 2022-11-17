import com.sun.java_cup.internal.runtime.Symbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        /*
         COMPLETE THIS CLASS AFTER ALL OTHER CLASSES ARE COMPLETED
         */
        /*
        Write a program that will get information from 3 participants and
        -Print information for each participant
        -Print how many participants were male
        -Print how many participants were female
        -Print the age of the youngest person
        -Print the age of the eldest person
         */
        Scanner scanner = new Scanner(System.in);

        ArrayList<Participant> participants = new ArrayList<>(); // creating new arraylist yo store our participants

        int maxAge = 0;
        int minAge = Integer.MAX_VALUE;

        do{
            System.out.println(SurveyQuestions.askToJoin);
            String answer1 = scanner.nextLine();
            //char answer = scanner.nextLine().charAt(0);  -> converting to char

            if(answer1.toLowerCase().startsWith("y")){

                // getting participant name
                System.out.println(SurveyQuestions.askName);
                String name = scanner.nextLine();

               // getting an age
                System.out.println(SurveyQuestions.askAge);
                int age = scanner.nextInt();

                scanner.nextLine(); // cleaning the empty line

                // finding the max and min age of all  the participants
                if(age > maxAge) maxAge = age;

                if(age < minAge) minAge = age;

                // getting a gender
                System.out.println(SurveyQuestions.askGender);
                char gender = scanner.nextLine().toUpperCase().charAt(0); // converting to char

                Participant participant = new Participant(name, age, gender); // creating new object

                participants.add(participant); // adding participants to a list

                if(gender == 'M') Participant.addMaleParticipants(); // checking gender
                else Participant.addFemaleParticipants();
                Participant.addParticipants();
            }

        }while (Participant.totalNumberOfParticipants < 3);

        for (Participant p : participants) {    // printing all participants
            System.out.println(p);
        }
        System.out.println("The total amount of male participants is = " + Participant.totalNumberOfMaleParticipants);
        System.out.println("The total amount of female participants is = " + Participant.totalNumberOfFemaleParticipants);
        System.out.println("Age of the youngest person is = " + minAge);
        System.out.println("Age of the oldest person is = " + maxAge);


       /* do {
            System.out.println(SurveyQuestions.askToJoin);
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Y") ||
                    answer.equalsIgnoreCase("yes")) {

                Participant participant = new Participant();

                System.out.println(SurveyQuestions.askName);
                participant.name = input.nextLine();

                System.out.println(SurveyQuestions.askAge);
                participant.age = input.nextInt();
                input.nextLine();

                System.out.println(SurveyQuestions.askGender);
                participant.gender = input.next().toUpperCase().charAt(0);
                input.nextLine();

                participantList.add(participant);

                if (participant.gender == 'M') Participant.addMaleParticipants();
                else if (participant.gender == 'F') Participant.addFemaleParticipants();
                else System.out.println("Invalid input");

                Participant.addParticipants();

            } else if (answer.equalsIgnoreCase("N") ||
                    answer.equalsIgnoreCase("no")) continue;
        }
        while (Participant.totalNumberOfParticipants < 3);


//       /* for (int i = 0; i < 3; i++) {
//            System.out.println(SurveyQuestions.askToJoin);
//            String answer = input.nextLine();
//              if(answer.equalsIgnoreCase("Y") ||
//                      answer.equalsIgnoreCase("yes")){
//
//                Participant participant = new Participant();
//
//                System.out.println(SurveyQuestions.askName);
//                participant.name = input.nextLine();
//
//                System.out.println(SurveyQuestions.askAge);
//                participant.age = input.nextInt();
//
//                System.out.println(SurveyQuestions.askGender);
//                participant.gender = input.next();
//                input.nextLine();
//
//                participantList.add(participant);
//
//                  if(participant.gender == 'M') Participant.addMaleParticipants();
//                  else if(participant.gender == 'F') Participant.addFemaleParticipants();
//                  else System.out.println("Invalid input");

//                Participant.addParticipants();
//            }
//            else if(answer.equalsIgnoreCase("N") ||
//                      answer.equalsIgnoreCase("no")) i--;
//        }

       /* participantList.forEach(System.out::println);
        System.out.println("The total number of male participants is = " +
                Participant.totalNumberOfMaleParticipants);
        System.out.println("The total number of female participants is = " +
                Participant.totalNumberOfFemaleParticipants);
        System.out.println("The age of the youngest person is = " +
                Math.min(Math.min(participantList.get(0).age, participantList.get(1).age), participantList.get(2).age));
        System.out.println("The age of the eldest person is = " +
                Math.max(Math.max(participantList.get(0).age, participantList.get(1).age), participantList.get(2).age)); */

    }

}



