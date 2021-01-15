package strings;

/**
 * 657. Robot Return to Origin
 * https://leetcode.com/problems/robot-return-to-origin/
 */

public class W1_657_RobotReturnOrigin {
    public static void main(String[] args) {
        System.out.println(robotTo_Origin_1("LRLRUDUDDDU"));
        System.out.println(robotTo_Origin_10("LRLRUDUDDDUU"));
    }
    public static boolean robotTo_Origin_1(String moves){
        int x = 0;
        int y = 0;
        for(char move : moves.toCharArray()){
            if(move == 'U'){
                y += 1;
            }else if(move == 'D'){
                y-= 1;
            }else if(move == 'L'){
                x -= 1;
            }else if(move == 'R'){
                x += 1;
            }
        }
        return (x == 0 && y == 0);
    }

    /**
     * This is a counting problem.
     * To check whether the Robot returns to the origin, there must be a complementary move
     * L <-> R
     * U <-> D
     * Need to check whether the string has same number of L and R characters
     * same thing for U and D characters
     * If the number of characters are the same, the robot will return to the same position
     * Otherwise, it won't.
     * Time Complexity : O(n)
     * Space: O(1)
     */
    public static boolean robotTo_Origin_10(String moves){
        int UD = 0;
        int LR = 0;
        for(int i = 0; i < moves.length() ; i++){
            char current = moves.charAt(i);
            if(current == 'U'){
                UD ++;
            }else if(current == 'D'){
                UD --;
            }else if(current == 'L'){
                LR --;
            }else if(current == 'R'){
                LR ++;
            }
        }
        return UD == 0 && LR == 0;
    }
}
