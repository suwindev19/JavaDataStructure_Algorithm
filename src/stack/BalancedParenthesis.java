package stack;

import java.util.Stack;

/*
{} [] ()

input s = ([])
output yes

input s = ((( ))
output No

input s = [{ ]}
output No

input {}[()]
output yes

 */
public class BalancedParenthesis {
    public static void main(String[] args) {

    }

//    boolean isBalanced(String str) {
//        Stack<Integer> st = new Stack<Integer>();
//        for (int i = 0; i < str.length(); i++) {
//            if (str[i] == "(" || str[i] == "{" || str[i] == "[") {
//                st.push(str[i]);
//            } else {
//                if (st.isEmpty() == true)
//                    return false;
//                else if (matching(st.top(), str[i]) == false) {
//                    return false;
//                } else {
//                    st.pop();
//                }
//            }
//        }
//        return (st.isEmpty() == true);
//    }

    boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}' || (a == '[' && b == ']')));
    }
}
