package assignments;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] questionnaire = new String[20][2];

        questionnaire[0][0] = "A: Expend energy, enjoy groups";
        questionnaire[0][1] = "B: Conserve energy, enjoy one on one";
        questionnaire[1][0] = "A: Interpret literally";
        questionnaire[1][1] = "B: Look fore meaning and possibilities";
        questionnaire[2][0] = "A: Logical, thinking questioning";
        questionnaire[2][1] = "B: Empathetic, felling , accommodating";
        questionnaire[3][0] = "A: Organized, orderly";
        questionnaire[3][1] = "B: Flexible, adaptable";
        questionnaire[4][0] = "A: More outgoing, think out loud";
        questionnaire[4][1] = "B: More reserved think to yourself";
        questionnaire[5][0] = "A: Practical, realistic, experiential";
        questionnaire[5][1] = "B: Imaginative, innovative, theoretical";
        questionnaire[6][0] = "A: Candid, straight forward, frank";
        questionnaire[6][1] = "B: Tactful, kind, encouraging";
        questionnaire[7][0] = "A: Plan, schedule";
        questionnaire[7][1] = "B: Unplanned, spontaneous";
        questionnaire[8][0] = "A: Seek many task, public activities, interaction with others";
        questionnaire[8][1] = "B: Seek private, solitary activities with quiet to concentrate";
        questionnaire[9][0] = "A: Standard, usual, conventional";
        questionnaire[9][1] = "B: Different, novel, unique";
        questionnaire[10][0] = "A: Firm, tend to criticize, hold the line";
        questionnaire[10][1] = "B: Gentle, tend to appreciate, conciliate";
        questionnaire[11][0] = "A: Regulated, structured";
        questionnaire[11][1] = "B: Easygoing, 'live' and 'let's live'";
        questionnaire[12][0] = "A: External, communicative, express yourself";
        questionnaire[12][1] = "B: Internal, reticent, keep to yourself";
        questionnaire[13][0] = "A: Focus on here-and-now";
        questionnaire[13][1] = "B: Look to the future, global perspective, big picture";
        questionnaire[14][0] = "A: Tough-minded, just";
        questionnaire[14][1] = "B: tender-hearted, merciful";
        questionnaire[15][0] = "A: Preparation, plan ahead";
        questionnaire[15][1] = "B: Go with the flow, adapt as you go";
        questionnaire[16][0] = "A: Active, initiative";
        questionnaire[16][1] = "B: Reflective, deliberate";
        questionnaire[17][0] = "A: Fact, things, 'what is'";
        questionnaire[17][1] = "B: Ideas, dreams, 'what could be', philosophical";
        questionnaire[18][0] = "A: Matter of fact, issue oriented";
        questionnaire[18][1] = "B: Sensitive, people oriented, compassionate";
        questionnaire[19][0] = "A: Control, govern";
        questionnaire[19][1] = "B: Latitude, freedom";

        int A = 0;
        int B = 0;
        int E = 0;
        int I = 0;
        int S = 0;
        int N = 0;
        int T = 0;
        int F = 0;
        int J = 0;
        int P = 0;
        String E_I = null;
        String S_N = null;
        String T_F = null;
        String J_P = null;
        System.out.print("What is your name: ");
        String userName = scanner.nextLine();


        for (String[] strings : questionnaire) {

                System.out.println(Arrays.toString(strings));
                String userInput1 = scanner.nextLine();

                if (Objects.equals(userInput1, "A")) {
                    userInput1 = strings[0];
                    A++;
                } else if (Objects.equals(userInput1, "B")) {
                    userInput1 = strings[1];
                    B++;
                } else {
                while (!userInput1.equals("A") && !userInput1.equals("B")) {
                    System.out.println("Expected  A or B as Response\nI know this is an error, please try again ");
                    System.out.println(Arrays.toString(strings));
                    userInput1 = scanner.nextLine();
                }
            }
            if (Objects.equals(userInput1, questionnaire[0][0]) || Objects.equals(userInput1, questionnaire[4][0])
                    || Objects.equals(userInput1, questionnaire[8][0]) || Objects.equals(userInput1, questionnaire[12][0])
                    || Objects.equals(userInput1, questionnaire[16][0])) {
                E++;
            } else if (Objects.equals(userInput1, questionnaire[0][1]) || Objects.equals(userInput1, questionnaire[4][1])
                    || Objects.equals(userInput1, questionnaire[8][1]) || Objects.equals(userInput1, questionnaire[12][1])
                    || Objects.equals(userInput1, questionnaire[16][1])) {
                I++;
                E_I = Arrays.toString(strings);
            }


            if (Objects.equals(userInput1, questionnaire[1][0]) || Objects.equals(userInput1, questionnaire[5][0])
                    || Objects.equals(userInput1, questionnaire[9][0]) || Objects.equals(userInput1, questionnaire[13][0])
                    || Objects.equals(userInput1, questionnaire[17][0])) {
                S++;
            } else if (Objects.equals(userInput1, questionnaire[1][1]) || Objects.equals(userInput1, questionnaire[5][1])
                    || Objects.equals(userInput1, questionnaire[9][1]) || Objects.equals(userInput1, questionnaire[13][1])
                    || Objects.equals(userInput1, questionnaire[17][1])) {
                N++;
            }
            S_N = userInput1;

            if (Objects.equals(userInput1, questionnaire[2][0]) || Objects.equals(userInput1, questionnaire[6][0])
                    || Objects.equals(userInput1, questionnaire[10][0]) || Objects.equals(userInput1, questionnaire[14][0])
                    || Objects.equals(userInput1, questionnaire[18][0])) {
                T++;
            } else if (Objects.equals(userInput1, questionnaire[2][1]) || Objects.equals(userInput1, questionnaire[6][1])
                    || Objects.equals(userInput1, questionnaire[10][1]) || Objects.equals(userInput1, questionnaire[14][1])
                    || Objects.equals(userInput1, questionnaire[18][1])) {
                F++;
            }
            T_F = userInput1;

            if (Objects.equals(userInput1, questionnaire[3][0]) || Objects.equals(userInput1, questionnaire[7][0])
                    || Objects.equals(userInput1, questionnaire[11][0]) || Objects.equals(userInput1, questionnaire[15][0])
                    || Objects.equals(userInput1, questionnaire[19][0])) {
                J++;
            } else if (Objects.equals(userInput1, questionnaire[3][1]) || Objects.equals(userInput1, questionnaire[7][1])
                    || Objects.equals(userInput1, questionnaire[11][1]) || Objects.equals(userInput1, questionnaire[15][1])
                    || Objects.equals(userInput1, questionnaire[19][1])) {
                P++;
            }
            J_P = userInput1;
        }


        System.out.printf("Hello %s you selected: %n", userName);
        System.out.println(E_I);
        System.out.printf("Number of A selected: %d%n", E);
        System.out.printf("Number of B selected: %d%n", I);




    }

    }

