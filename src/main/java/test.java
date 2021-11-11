import java.util.ArrayList;

/**
 * Project name(项目名称)：多异常捕获
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 19:34
 * Version(版本): 1.0
 * Description(描述)：
 * try{
 * // 可能会发生异常的语句
 * } catch (IOException | ParseException e) {
 * // 调用方法methodA处理
 * }
 * 捕获多种类型的异常时，多种异常类型之间用竖线|隔开。
 * 捕获多种类型的异常时，异常变量有隐式的 final 修饰，因此程序不能对异常变量重新赋值。
 */

public class test
{
    public static void change(ArrayList<Integer> list)
    {
        list.add(2);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        change(list);
        System.out.println(list);

        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两个数相除的结果是：" + c);
        }
        catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException e)
        {
            System.out.println("程序发生了数组越界、数字格式异常、算术异常之一");
            // 捕获多异常时，异常变量默认有final修饰
            // 所以下面代码有错
            //e = new ArithmeticException("test");
        }
        catch (Exception e)
        {
            System.out.println("未知异常");
            // 捕获一种类型的异常时，异常变量没有final修饰
            // 所以下面代码完全正确
            e = new RuntimeException("test");
        }
        test2.main(null);
    }
}
