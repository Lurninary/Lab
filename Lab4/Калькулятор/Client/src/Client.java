import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("127.0.0.1",1111);

            System.out.println("Local port: " +  s.getLocalPort());
            System.out.println("Remote port: " + s.getPort());

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            System.out.println("Введите два числа и оператор через пробел");
            System.out.println("Пример: 4 + 2");
            System.out.println("Для выхода введите слово стоп");

            while (true) {
                String in = sc.nextLine();
                if (in.equals("Стоп") || in.equals("стоп"))
                    break;
                dos.writeUTF(in);

                String answ = dis.readUTF();
                System.out.println("Ответ: " + answ);
            }
            dis.close();
            dos.close();
            s.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}