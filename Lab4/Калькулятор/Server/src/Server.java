import java.net.*;
import java.io.*;
import java.util.StringTokenizer;

public class Server {
    public static void main(String args[])
    {
        try
        {
            System.out.println("Ожидание подключения...");

            ServerSocket ss = new ServerSocket(1111);
            Socket s = ss.accept();

            System.out.println("Local port: " +  s.getLocalPort());
            System.out.println("Remote port: " + s.getPort());

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while(true) {
                String in = dis.readUTF();
                if(in.equals("Стоп") || in.equals("стоп"))
                    break;
                double res = 0;

                StringTokenizer st = new StringTokenizer(in);
                double a = Double.parseDouble(st.nextToken());
                String op = st.nextToken();
                double b = Double.parseDouble(st.nextToken());

                if(op.equals("+")){
                    res = a + b;
                }
                else if(op.equals("-")){
                    res = a - b;
                }
                else if(op.equals("*")){
                    res = a * b;
                }
                else if(op.equals("/")){
                    if(b != 0) {
                        res = a / b;
                    }
                    else dos.writeUTF("На ноль делить нельзя");
                }
                dos.writeUTF(Double.toString(res));
            }
            s.close();
            ss.close();
            System.out.println("Finish");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}