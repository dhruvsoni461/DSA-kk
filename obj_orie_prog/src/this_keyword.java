public class this_keyword {
    public static void main(String[] args) {
        Teacher one = new Teacher();
        System.out.println(one.name); //suresh
        System.out.println(one.ph_no);
        System.out.println(one.subj);

        System.out.println();

        Teacher two = new Teacher();
        two.name = "Mukesh";
        two.subj = "English";
        two.ph_no = 797563;
        System.out.println(two.name); //mukesh
        System.out.println(two.ph_no);
        System.out.println(two.subj);
    }
}


class Teacher{
    String name;
    String subj;
    int ph_no;
    Teacher(){
        this.name = "Suresh";
        this.ph_no = 797435;
        this.subj = "Maths";
    }

//    Teacher(String n){
//        this.name = n;
//        this.ph_no = 797435;
//        this.subj = "Maths";
//    }
//    Teacher(int ph_no){
//        this.name = "Suresh";
//        this.ph_no = ph_no;
//        this.subj = "Maths";
//    }
}
