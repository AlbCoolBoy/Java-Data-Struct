package 数据结构.线性结构.堆栈.计算器实现;

public class Caculator {
    public static void main(String[] args) {
        NumStack numStack = new NumStack(10);
        OpeStack opeStack = new OpeStack(10);
        String expresion = "31*7-6+6*5+8";
        int num1 = 0;
        int num2 = 0;
        int index = 0;
        int result = 0;
        char oper = ' ';
        char ch = ' ';
        String keepnumber = "";
        while (true) {
            //substring方法是一个返回子串的方法，具体介绍可见如下
            // https://www.runoob.com/java/java-string-substring.html
            ch = expresion.substring(index, index + 1).charAt(0);
            if (opeStack.isop(ch)) {          //如果输入的是符号
                if (opeStack.isEmpty()) {     //如果符号栈为空就直接入栈
                    opeStack.Push(ch);
                } else                       //如果符号栈不为空分两种情况
                {
                    //如果输入的运算符的优先级小于等于栈中的运算符优先级,就进行一次计算
                    if (opeStack.pripority(ch) <= opeStack.pripority(opeStack.Gettop())) {
                        num1 = numStack.Pop();
                        num2 = numStack.Pop();
                        oper = opeStack.Pop();
                        result = opeStack.cal(num1, num2, oper);
                        numStack.Push(result);//将得到的运算结果入栈到数栈中
                        opeStack.Push(ch);//将当前的符号入符号栈
                    } else {
                        opeStack.Push(ch);
                    }
                }
            } else {                           //如果输入的是数字
                //当处理的是多位数的时候就不能发现是一个属就立即将数入栈，应该要判断他的后面有没有数字了
                //处理数的时候，需要向expresion后面再看一位
                //因此需要定义一个字符串变量用于拼接
                keepnumber += ch;
                if (index == expresion.length() - 1) {
                    numStack.Push(Integer.parseInt(keepnumber));
                } else {
                    if (opeStack.isop(expresion.substring(index + 1, index + 2).charAt(0))) {  //后一位是运算符,这里可能会发生数组越界
                        numStack.Push(Integer.parseInt(keepnumber));
                        //再这里拼接完之后要将keepnumber清空
                        keepnumber = "";
                    }
                }
            }
            index++;
            if (index >= expresion.length()) {
                break;
            }
        }
        while (true) {
            if (opeStack.isEmpty()) {
                break;
            }
            num1 = numStack.Pop();
            num2 = numStack.Pop();
            oper = opeStack.Pop();
            result = opeStack.cal(num1, num2, oper);
            numStack.Push(result);
        }
        System.out.println(numStack.Pop());
    }


}

class NumStack {
    private int MaxSize;
    private int[] stack;
    private int top = -1;
    ;


    public NumStack(int MaxSize) {
        this.MaxSize = MaxSize;
        stack = new int[this.MaxSize];
    }

    public boolean isFull() {
        return top == MaxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void Push(int value) {
        if (isFull()) {
            System.out.println("stack is full,cant push any element");
            return;
        }
        top = top + 1;
        stack[top] = value;

    }

    //出栈
    public int Pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -32768;
        }
        int result = stack[top];
        top--;
        return result;
    }

    public int Gettop() {
        return stack[top];
    }

    //遍历栈
    public void Traverse() {
        int mid = top;
        while (mid != -1)              //此处不能直接改变top的值，应该设置一个中间变量，让其值等于top
        {
            System.out.print(stack[mid] + "  ");
            mid--;
        }
        System.out.println();
        System.out.println("traverse finished");
    }

    public int priority(char ope) {
        if (ope == '*' || ope == '/') {
            return 2;
        } else if (ope == '+' || ope == '-') {
            return 1;
        } else {
            return 0;       //暂时只包含这四种运算符，不能输入其他的运算符
        }
    }


}

class OpeStack {
    private int maxsize;
    private char[] stack;
    private int top = -1;

    public OpeStack(int maxsize) {
        this.maxsize = maxsize;
        stack = new char[this.maxsize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxsize;
    }

    public void Push(char value) {
        if (isFull()) {
            System.out.println("stack is full,cant push any element");
            return;
        }
        top = top + 1;
        stack[top] = value;
    }

    public char Pop() {
        if (isEmpty()) {
            System.out.println("stack is empty,pop nothing");
            return ' ';
        }
        char result = stack[top];
        top--;
        return result;
    }

    public char Gettop() {
        return stack[top];
    }

    public int pripority(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else return 0;         //暂时只能支持四种运算，加减乘除
    }

    public boolean isop(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public int cal(int num1, int num2, char ope) {
        int result = 0;
        switch (ope) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 / num1;
                break;
            default:
                break;
        }
        return result;
    }

}


