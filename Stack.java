class Solution {
    public int evalRPN(String[] tokens) {
        //ok i need to reverse this 
        //so how to do this 
        //i will sue stack and if i see operend push into stack 
        //if i see operator i will pop the two last elemnt and perform the opertor the again push into stack 

          Stack<Integer>stack = new Stack<>();

              for(String token : tokens){
        if("+-*/".contains(token)&&token.length()==1){
                  int a = stack.pop();
                  int b = stack.pop();
                switch(token){
                    case "+"->stack.push(b+a);
                    case "-"->stack.push(b-a);
                    case "*"->stack.push(b*a);
                    case "/"->stack.push(b/a);
                }

        }else{ //if not operatore add into stack 
            stack.push(Integer.parseInt(token));
        }
                  
              }
              //top res return 
              return stack.pop();
    }
}
