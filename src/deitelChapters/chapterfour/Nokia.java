package deitelChapters.chapterfour;

import java.util.Scanner;

class Nokia {
    public static void main(String[] args) {
        int menuBar;
        int menuBar2;
        int menuBar3;
        int menuBar4;

        Scanner input = new Scanner(System.in);
        System.out.println(" NOKIA...");
        System.out.print ("""
                 PRESS:
                 1 * PHONE BOOK
                 2 * MESSAGE
                 3 * CHAT
                 4 * CALL REGISTER
                 5 * TONE
                 6 * SETTINGS
                 7 * CALL DIVERT
                 8 * GAMES
                 9 * CALCULATOR
                 10 * REMINDER
                 11 * CLOCK
                 12 * PROFILES
                 13 * SIM SERVICE :
                """); menuBar = input.nextInt();
                switch (menuBar){
                case 1:   System.out.println("""
                PRESS:
                1 * Search.
                2 * Service Numbers.
                3 * Add name
                4 * Erase
                5 * Edit
                6 * Assign tone
                7 * Send b'card
                8 * Option.
                9 * Speed dial.
                10 * Voice tags.
                """); menuBar = input.nextInt();
                switch (menuBar){
                    case 8:
                     System.out.println("""
                            PRESS:
                            1 * Type of view.
                            2 * Memory status.
                            """);
                    break;}}
                switch (menuBar){
                case 2  :
                    System.out.println("""
                PRESS:
                1 * Write message.
                2 * Inbox.
                3 * Outbox.
                4 * Picture message.
                5 * Templates.
                6 * Smileys.
                7 * Message settings.
                8 * Info service.
                9 * Voice mailbox number.
                10 * Service command editor.
                """); menuBar2 = input.nextInt();
                switch (menuBar2){
                            case 7: System.out.println("""
                            PRESS:
                            1 * Set 1.
                            2 * Common 3.
                            """);}
                            int menuBar72 = input.nextInt();
                            switch (menuBar72){
                                 case 1:
                                     System.out.println("""
                                             PRESS:
                                             1 * Message center number.
                                             2 * Message sent as.
                                             3 * Message validity.
                                                 
                                             """); }
                                     switch (menuBar72) {
                                         case 2:{
                                             System.out.println("""
                                                     PRESS:
                                                     1 * Delivery reports.
                                                     2 * Reply via same center.
                                                     3 * Character support.
                                                     """); }}break;
                    case 3:{
                        System.out.println("""
                                        * Chats.
                                        """  ); break;}

//
                 case 4 :
                    System.out.println("""
                            PRESS:
                            1 * Missed calls.
                            2 * Received calls.
                            3 * Dialled numbers.
                            4 * Erase recent call list.
                            5 * Show call duration.
                            6 * Show call cost.
                            7 * Call cost setting.
                            8 * Prepaid credit.
                            """); menuBar3 = input.nextInt();
                switch (menuBar3){
                    case 5:  System.out.println("""
                            PRESS:
                            1 * Last call duration.
                            2 * All calls' duration.
                            3 * Received calls duration.
                            4 * Dialled calls' duration.
                            5 *  Clear timers.
                            """);}
                     switch (menuBar3){
                        case 6:   System.out.println("""
                          PRESS:
                          1 * Last call cost.
                          2 * All calls cost.
                          3 * Clear counter.
                           """); }
                     switch (menuBar3){
                         case 7:System.out.println("""
                            PRESS:
                            1 * Call cost limit.
                            2 * Show cost in.
                           """);}break;
                    case 5:
                        System.out.println("""
                                PRESS:
                                1 * Ringing tone.
                                2 * Ringing volume.
                                3 * Incoming call alert.
                                4 * Composer.
                                5 * Message alert tone.
                                6 * Keypad tones.
                                7 * Warning and games tones.
                                8 * Vibrating alert.
                                9 * Screen saver.
                                                                                        
                                """);break;
                    case 6:
                        System.out.println("""
                                PRESS:
                                1 * Call settings.
                                2 * Phone settings.
                                3 * Security setting.
                                4 * Restore factory setting.
                                """); menuBar4 = input.nextInt();
                                switch (menuBar4){
                                    case 1:  System.out.println("""
                                PRESS:
                                1 * Automatic redial.
                                2 * Speed dialing.
                                3 * Call waiting option.
                                4 * Own number sending.
                                5 * Phone line in use.
                                6 * Automatic answer.
                                """); break;
                                }switch (menuBar4){
                                    case 2: System.out.println("""
                                PRESS:
                                1 * Language.
                                2 * Cell info display.
                                3 * Welcome note.
                                4 * Network selection.
                                5 * Lights-2.
                                6 * Confirm sim service actions.
                                """); break;}
                        switch (menuBar4){
                            case 3:  System.out.println("""
                                PRESS:
                                1 * Pin code request.
                                2 * Call barring service.
                                3 * Fixed dialing.
                                4 * Close user group.
                                5 * Phone security.
                                6 * Change access codes.
                                """); }break;
                    case 7:
                        System.out.println("""
                                1 * Call divert.""");break;
                                case 8:
                        System.out.println("""
                                1 * Games.""");break;
                    case 9:
                        System.out.println("""
                                1 * Calculator.""");break;
                    case 10:
                        System.out.println("""
                                1 * Reminder.""");break;
                    case 11:
                        System.out.println("""
                                PRESS:
                                1 * Alarm clock.
                                2 * Clock settings.
                                3 * Date settings.
                                4 * Stopwatch.
                                5 * Countdown timer.
                                6 * Auto update of date and time.
                                """);break;
                    case 12:
                        System.out.println("""
                                1 * Profiles.""");break;

                    case 13:
                        System.out.println("""
                                1 * SIM Service - 3.""");break;


                }


                }}







