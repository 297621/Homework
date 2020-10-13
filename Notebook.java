package Homework;

import java.util.ArrayList;

/*
    注释为使用String数组的写法
 */
public class Notebook {
    private ArrayList<String> notebook=new ArrayList<>();
//    private String[] notebook1=new String[];
//    private static int flag=0;//统计数组长度
    public void writeNote(String note){
        notebook.add(note);
//        notebook1[flag]=note;
    }
    public void searchNote(int index){
//      if(index>=flag)
        if (index>=notebook.size())
            System.out.println("Input error!");
        else
//            System.out.println(notebook[index-1]);
            System.out.println(notebook.get(index-1));
    }
    public void printNotebook(){
        for (String str:notebook) {
            System.out.println(str);
        }
//        for (String str:notebook1) {
//            System.out.println(str);
//        }
    }
    public void getLength(){
        System.out.println(notebook.size());
//        System.out.println(flag+1);
    }
    public void deleteNote(int index){
//        if(index>=flag)
        if (index>=notebook.size())
            System.out.println("Input error!");
        else
            notebook.remove(index-1);
//          for (int i=index-1;i<flag;i++){
//              notebook1[i]=notebook1[i+1];
//          }
//       flag--;
    }

    public static void main(String[] args) {
        Notebook book=new Notebook();
        book.writeNote("aaa");
        book.writeNote("bbb");
        book.writeNote("ccc");
        book.writeNote("ddd");
        book.writeNote("eee");
        book.writeNote("fff");
        book.searchNote(3);
        System.out.println("====================");
        book.printNotebook();
        System.out.println("====================");
        book.deleteNote(2);
        book.printNotebook();
        book.getLength();
    }
}
