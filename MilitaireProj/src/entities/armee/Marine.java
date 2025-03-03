package entities.armee;

import entities.grades.GMarine;

public class Marine extends Militaire {

    //CONSTRUCTEUR
    public Marine(String nom, String prenom, GMarine grade, int matricule) {
        super(nom, prenom, grade, matricule);
    }

    //SETTER
//    public void setNom(String nom) {
//        super.nom = nom;
//        }
//
//        public void setPrenom(String prenom) {
//            this.prenom = prenom;
//        }
        /**
         * @param grade the grade to set
         */
        public void setGrade(GMarine grade) {
            this.grade = grade;
        }
        /**
         *
         */
        public void setGrade() {

            grade = GMarine.setGrade();
        }

//        public void setMatricule(int matricule) {
//            this.matricule = matricule;
//        }

    //GETTER

    //METHODES

    //OVERRIDE
    @Override
    public String toString() {
        return "Marine ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + this.grade;
    }
}
