package org.example.Lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            File file = new File("test6.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (NullPointerException e) {
            System.out.println("Poyman Exception 2");
        } catch (IOException e) {
            System.out.println("Poyman Exception 3");
        }
//        catch(FileNotFoundException e){
//            System.out.println("Poyman Exception 1");                 ----> bu tartibga yozishga compile ruhsat bermidi.
//                                                                            chunki FileNotFoundException IOExceptionning davomchisi bo`lganligi
//                                                                            sababli hech qachon bu Exceptionga navbat yetib kelmidi.
//        }
        catch (RuntimeException e) {
            System.out.println("Poyman Exception 4");
        } catch (Exception e) {
            System.out.println("Poyman Exception 5");
        } catch (Throwable e) {
            System.out.println("Poyman Exception 6");
        }
    }
}
