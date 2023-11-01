package BOJ;

import java.io.*;

class B4_15552 { // 버퍼 사용하는 문제
    public static void main(String[] args) throws IOException{
    	
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < n; i++){
        	
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        
        /*
        1. import는 java.io.*로 한다. (Scanner는 java.util 클래스이다.)
        2. main함수 우측에 throws IOException을 통해 예외를 처리한다. (메소드 선언부에 throws를 명시하면, 해당 메소드 내에서 exception이 발생하는 경우 해당 메소드를 호출한 곳에서 예외가 발생한다.)
        3. BufferedReader, BufferedWriter를 선언한다.
        4. n을 입력받고, n만큼 loop를 돈다.
        4-1. 해당 줄 전체를 String으로 입력받아, 스페이스로 구분하여 형변환하여 덧셈을 수행한다.
        5. BufferedWriter에 써준다.
        6. Buffer를 비워준다.
        */
        
        bw.flush();
    }
}
