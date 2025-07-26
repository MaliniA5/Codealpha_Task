public class Student {
    private String name;
        private int score;
        private char grade;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
            this.grade = calculateGrade(score);
        }

        private char calculateGrade(int score) {
            if (score >= 90) return 'A';
            else if (score >= 80) return 'B';
            else if (score >= 70) return 'C';
            else if (score >= 60) return 'D';
            else return 'F';
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public char getGrade() {
            return grade;
        }
    }


