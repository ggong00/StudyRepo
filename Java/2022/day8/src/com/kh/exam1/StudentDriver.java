package com.kh.exam1;

public class StudentDriver {
    public static void main(String[] args) {
        // 두 학생의 성적 기록을 나타내는 객체들을 만든다
        Student stud1 = new Student("선남");
        Student stud2 = new Student("선녀");

        // 첫 번째 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다
        stud1.inputGrades();

        // 첫 번째 학생의 총점을 계산한다
        System.out.println("총점 = " + stud1.getTotal());

        // 첫 번째 학생의 학점을 부여한다
        stud1.getGrade();

        // 첫 번째 학생의 이름, 총점과 학점을 출력한다
        System.out.println(stud1);

        // 두 번째 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다
        stud2.inputGrades();

        // 두 번째 학생의 총점을 계산한다
        System.out.println("총점 = " + stud2.getTotal());

        // 두 번째 학생의 학점을 부여한다
        stud2.getGrade();

        // 두 번째 학생의 이름, 총점과 학점을 출력한다
        System.out.println(stud2);
    }
}