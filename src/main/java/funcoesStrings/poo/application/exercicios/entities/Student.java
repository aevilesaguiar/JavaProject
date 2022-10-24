package funcoesStrings.poo.application.exercicios.entities;

public class Student {
    public String name;
    public Double grade1;
    public Double grade2;
    public Double grade3;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade1() {
        return grade1;
    }

    public void setGrade1(Double grade1) {
        this.grade1 = grade1;
    }

    public Double getGrade2() {
        return grade2;
    }

    public void setGrade2(Double grade2) {
        this.grade2 = grade2;
    }

    public Double getGrade3() {
        return grade3;
    }

    public void setGrade3(Double grade3) {
        this.grade3 = grade3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", grade1=" + grade1 +
                ", grade2=" + grade2 +
                ", grade3=" + grade3 +
                '}';
    }

    public Double finalGrade(){
        return grade1+grade2+grade3;
    }


    public Double missingPoints(){
        if(finalGrade()<60){
            return 60.00 -finalGrade();
        }else{
            return 0.00;
        }
    }
}
