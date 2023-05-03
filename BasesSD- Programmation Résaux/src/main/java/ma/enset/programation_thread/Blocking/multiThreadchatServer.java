package ma.enset.programation_thread.Blocking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class multiThreadchatServer extends Thread{
    private List<Conversation> conversations = new ArrayList<>();
    int ClientCont;
    public static void main(String[] args) {
        new multiThreadchatServer().start();
    }

    @Override
    public void run() {
        System.out.println("the server is started");
        try {
            ServerSocket ss = new ServerSocket(1234);
            while (true){
                Socket socket = ss.accept();
                ++ClientCont;
                Conversation conversation = new Conversation(socket,ClientCont);
                conversations.add(conversation);
                conversation.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    class Conversation extends Thread{
        private Socket socket;
        private int Clientid;
        public  Conversation(Socket socket,int Clientid){
            this.socket=socket;
            this.Clientid=Clientid;
        }
        @Override
        public void run() {

            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os,true);
                String IP = socket.getRemoteSocketAddress().toString();
                System.out.println("new client connecting "+Clientid+"IP="+IP);
                pw.println("welcome your Id is -->"+Clientid);
                String request ;
                while ((request = br.readLine())!=null){
                    System.out.println("new request ==> IP = "+IP+"  request = "+request );
                    List<Integer> ClientTo = new ArrayList<>();
                    String message;
                    if (request.contains("=>")){
                        String item[] = request.split("=>");
                        String clients = item[0];
                         message = item[1];
                        if (clients.contains(",")){
                            String ClientIds[] = clients.split(",");
                            for (String id: ClientIds) {
                                ClientTo.add(Integer.parseInt(id));
                            }
                        }
                        else {
                            ClientTo.add(Integer.parseInt(clients));
                        }
                    }
                    else {
                        ClientTo = conversations.stream().map(c->c.Clientid).collect(Collectors.toList());
                        message=request;
                    }
                    broadCastMessage(message,this,ClientTo);


                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        public void  broadCastMessage(String message,Conversation from,List<Integer> clients){
            try {
            for (Conversation conversation: conversations) {
                if (conversation!=from && clients.contains(conversation.Clientid)) {
                    Socket socket1 = conversation.socket;

                    OutputStream outputStream = socket1.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(outputStream, true);
                    printWriter.println(message);
                }
                }
                }catch (IOException e) {
                throw new RuntimeException(e);

            }
        }
    }
}
