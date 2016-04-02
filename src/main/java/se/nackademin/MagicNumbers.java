package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        //TODO: calculate A
        //Beräkna antalet namn (här: antalet mellanslag i namnet + 1)
        int A=1;
        char[] chArray=name.toCharArray();
        for (int i=0; i<chArray.length; i++)
            if(chArray[i] ==' ')
                A++;
        //Lägg till kundens ålder
        A=A+age;
        //Subtrahera 7 tills siffran är under 10
        while (A>=10)
            A=A-7;
        
       // return 0;
       return A;
    }

    public int calculateB() {
        //TODO: calculate B
        int B;
        //Ta antalet tecken i kundens bostadsort
        B=location.length();
        //Lägg till kundens inkomst
        B=B+income;
        //Subtrahera 7 tills siffran är under 10
        while (B>=10)
            B=B-7;      
        //return 0;
        return B;
    }

    public int calculateC() {
        //TODO: calculate C
        int A, B, C;
        A=calculateA();
        B=calculateB();
        //Beräkna <A>
        //Addera <B>
        C=A+B;
        //Subtrahera kundens längd
        C=C-height;
        //Addera 10 tills talet inte längre är negativt
        while (C<0)
            C=C+10;
        return C;
        //return 0;
    }

    public int calculateD() {
        //TODO: calculate D
        int A, B, C, D;
        //Beräkna <A>
        A=calculateA();
        //Om <A> är över 5, addera <B>. Om <A> är under eller lika med 5, addera <C>.
        if (A>5){
           B=calculateB();
           D=A+B;
        }
        else {
           C=calculateC();
           D=A+C;
        }

        //Subtrahera kundens inkomst
        D=D-income;
        //Addera 10 tills talet inte längre är negativt
        while (D<0)
            D=D+10;
        return D;
        //return 0;
    }

    public int calculateE() {
        //TODO: calculate E
        double temp;
        int E;
        //Ta kundens ålder
        //Multiplicera med kundens inkomst
        //Multiplicera resultatet från steg 2 med kundens inkomst, igen
        //Multiplicera resultatet från steg 3 med kundens längd
        temp=age*income*income*height;
        //Ta roten ur genom Math.sqrt()
        
        temp=Math.sqrt(temp);
        //Dividera talet med 2 tills talet är under 10. 
        while (temp>=10)
            temp=temp/2;            
        //Avrunda med math.round()
        E=(int) Math.round(temp);
        return E;
        //return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
