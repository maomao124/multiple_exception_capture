import java.io.*;
import java.util.Objects;

/**
 * Project name(项目名称)：多异常捕获
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 19:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public static void main(String[] args)
    {
        //String path = FindMaxInteger.class.getClassLoader().getResource("").getPath();
        String path = Objects.requireNonNull(FindMaxInteger.class.getClassLoader().getResource("")).getPath();
        File file = new File(path + "data.txt");
        BufferedReader in = null;

        try
        {
            in = new BufferedReader(new FileReader(file));
            String line;
            int maxValue = 0;
            while ((line = in.readLine()) != null)
            {
                int inputValue = Integer.parseInt(line);
                if (inputValue > maxValue)
                {
                    maxValue = inputValue;
                }
            }
            System.out.println("Max int is: " + maxValue);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件不存在。");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("输入输出错误。");
            e.printStackTrace();
        }
        catch (NumberFormatException e)
        {
            System.out.println("数字格式错误。");
            e.printStackTrace();
        }
    }

    private static class FindMaxInteger
    {

    }
}
